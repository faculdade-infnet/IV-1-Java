package exercicio_12;

import java.util.Scanner;

public class Exercicio_12 {
    private static final Scanner sc = new Scanner(System.in);

    public void Start() {
        System.out.print("Digite o nome do primeiro usuário: ");
        String user1 = sc.nextLine();

        System.out.print("Digite o nome do segundo usuário: ");
        String user2 = sc.nextLine();

        String[] mensagens = armazenarMensagens(new String[10], user1, user2);
        exibirHistoricoMensagens(mensagens);

        System.out.println("\nObrigado por utilizarem o sistema! Boa sorte para vocês! 🚀\n");
    }

    private String[] armazenarMensagens(String[] mensagens, String user1, String user2) {
        for (int i = 0; i < 10; i++) {
            String user = null;
            // se for impar, user1
            // se for par, user2
            if (i % 2 == 0)
                user = user1;
            else
                user = user2;

            System.out.print(user + ", digite sua mensagem: ");
            String input = sc.nextLine();
            mensagens[i] = user + ": " + input;
        }

        return mensagens;
    }

    private void exibirHistoricoMensagens(String[] mensagens) {
        System.out.println("\n###### Exibir Historico Mensagens: ######");

        for (String mensagem : mensagens) {
            System.out.println(mensagem);
        }
    }
}
