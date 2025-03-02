package exercicio_10;
import java.util.Scanner;

public class LeituraUsuario10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Nome: " + nome + ", Idade: " + idade);

        scanner.close();
    }
}
