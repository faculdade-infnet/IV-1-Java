package exercicio_09;

import java.util.Scanner;

public class exercicio_09 {
    /// Validador de Senha
    public void Start() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe uma senha:");
        String senha = sc.nextLine();
        String confirmacaoSenha = "";

        while (!senha.equals(confirmacaoSenha)) {
            System.out.println("Digite novamente a mesma senha para validação:");
            confirmacaoSenha = sc.nextLine();
        }

        System.out.println("Senha confirmada com sucesso!\n");

        sc.close();
    }
}
