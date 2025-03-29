package exercicio_02;

import java.util.Scanner;

public class Exercicio_02 {
    /// Validação de Senha Segura
    public void Start() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Informe uma senha: ");
        String senha = sc.nextLine();

        // Enquanto a senha não for valida, tenta de novo
        while (true) {
            StringBuilder errorMensagem = new StringBuilder();

            verificarLetraMaiuscula(senha, errorMensagem);
            verificarNumero(senha, errorMensagem);
            verificaCaractereEspecial(senha, errorMensagem);
            verificaComprimento(senha, errorMensagem);

            // Em caso de erro exibe a mensagem
            if (errorMensagem.length() >0) {
                System.out.println(errorMensagem.toString());
                System.out.println("Informe uma nova senha:");
                senha = sc.nextLine();
            } else {
                System.out.println("Senha confirmada com sucesso!\n");
                break;
            }
        }

        sc.close();
    }

    /**
     * Verifica se existe ao menos uma letra Maiúcula
     */
    public void verificarLetraMaiuscula(String senha, StringBuilder errorMensagem) {
        for (char c : senha.toCharArray()) {
            if (Character.isUpperCase(c))
                return;
        }

        errorMensagem.append("A senha deve conter ao menos uma 'letra Maiúscula'!").append("\n");
    }

    /**
     * Verifica se existe ao menos um Número
     */
    public void verificarNumero(String senha, StringBuilder errorMensagem) {
        for (char c : senha.toCharArray()) {
            if (Character.isDigit(c))
                return;
        }

        errorMensagem.append("A senha deve conter ao menos um 'Número'!\n");
    }

    /**
     * Verifica se existe ao menos um caractere especial
     */
    public void verificaCaractereEspecial(String senha, StringBuilder errorMensagem) {
        for (char c : senha.toCharArray()) {
            if (!Character.isLetterOrDigit(c))
                return;
        }

        errorMensagem.append("A senha deve conter ao menos um 'Caractere Especial'!\n");
    }

    /**
     * Verifica se a senha tem pelo menos 8 caracteres
     */
    public void verificaComprimento(String senha, StringBuilder errorMensagem) {
        if (senha.length() < 8)
            errorMensagem.append("A senha deve ter ao menos '8 Caracteres'!\n");
    }
}
