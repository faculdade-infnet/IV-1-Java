package exercicio_02;

import java.util.Scanner;

public class exercicio_02 {
    /// Validador de Senha
    public void Start() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o seu nome:");
        String nome = sc.nextLine();

        System.out.println("Informe uma senha:");
        String senha = sc.nextLine();

        boolean confirmacaoSenha = false;

        // Enquanto a validação não acontrecer, fica no loop
        while (!confirmacaoSenha) {
            StringBuilder errorMensagem = new StringBuilder();
            boolean upperCase = true;
            boolean isNumber = true;
            boolean isCharSpecial = true;
            boolean isMinLenght8 = true;

            upperCase = VerificarLetraMaiuscula(senha, errorMensagem);
            isNumber = VerificarNumero(senha, errorMensagem);
            isCharSpecial = VerificaCaractereEspecial(senha, errorMensagem);
            isMinLenght8 = VerificaComprimento(senha, errorMensagem);

            if (!errorMensagem.isEmpty()) {
                System.out.println(errorMensagem);
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
     * Verifica se é uma letra Maiúcula
     */
    public boolean VerificarLetraMaiuscula(String senha, StringBuilder errorMensagem) {
        for (char c : senha.toCharArray()) {
            if (Character.isUpperCase(c))
                return true;
        }

        errorMensagem.append("A senha deve conter ao menos uma 'letra Maiúscula'!").append("\n");
        return false;
    }

    /**
     * Verifica se é um Número
     */
    public boolean VerificarNumero(String senha, StringBuilder errorMensagem) {
        for (char c : senha.toCharArray()) {
            if (Character.isDigit(c))
                return true;
        }

        errorMensagem.append("A senha deve conter ao menos um 'Número'!").append("\n");
        return false;
    }

    /**
     * Verifica se é um caractere especial
     */
    public boolean VerificaCaractereEspecial(String senha, StringBuilder errorMensagem) {
        for (char c : senha.toCharArray()) {
            if (!Character.isLetterOrDigit(c))
                return true;
        }

        errorMensagem.append("A senha deve conter ao menos um 'Caractere Especial'!").append("\n");
        return false;
    }

    /**
     * Verifica se a senha contém pelo menos 8 caracteres
     */
    public boolean VerificaComprimento(String senha, StringBuilder errorMensagem) {
        if (senha.length() >= 8)
            return true;
        else {
            errorMensagem.append("A senha deve ter ao menos '8 Caracteres'!").append("\n");
            return false;
        }
    }
}
