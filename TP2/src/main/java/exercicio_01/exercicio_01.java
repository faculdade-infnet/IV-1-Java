package exercicio_01;

import java.util.Scanner;

public class exercicio_01 {
    /// Cadastro de Usuário Completo
    public void Start() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome completo (Nome e Sobrenome): ");
        String nomeCompleto = sc.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();
        sc.nextLine();

        System.out.print("Digite o nome do seu Pai: ");
        String nomePai = sc.nextLine();

        System.out.print("Digite o nome do seu Mãe: ");
        String nomeMae = sc.nextLine();

        boolean nomeMaior = nomeCompleto.length() > nomePai.length() || nomeCompleto.length() > nomeMae.length();

        System.out.println("\n################ Resumo do Cadastro: ################");
        System.out.println("Nome completo: " + nomeCompleto);
        System.out.println("Idade: " + idade);
        System.out.println("Nome do Pai: " + nomePai);
        System.out.println("Nome do Mãe: " + nomeMae);

        System.out.println(nomeMaior
                ? "Seu nome tem mais letras que o nome do seu Pai ou da sua Mãe.\n"
                : "Seu nome NÃO tem mais letras que o nome do seu Pai ou da sua Mãe.\n");

        sc.close();
    }
}
