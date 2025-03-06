package exercicio_10;

import java.util.Random;
import java.util.Scanner;

public class exercicio_10 {
    /// Jogo de Adivinhação
    public void Start() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Tente adivinhar o número.");
        boolean acertou = false;

        Random random = new Random();
        // Geração de um número aleatório entre 1 e 100 (inclusive)
        int numeroAleatorio = random.nextInt(100) + 1;

        while (!acertou) {
            acertou = VerificaResposta(numeroAleatorio, acertou);
        }

        sc.close();
    }


    /**
     * Verifica se o usuário acertou o número
     */
    public boolean VerificaResposta(int numeroAleatorio, boolean acertou) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um número de 1 a 100 para começarmos:");
        boolean erro = false;
        int numero = 0;

        // Verifica se o próximo valor inserido é um número inteiro
        if (!sc.hasNextInt()) {
            numero = sc.nextInt();
            System.out.println("Número inválido! Você deve informar um número inteiro.");
            erro = true;
        } else {
            numero = sc.nextInt();

            if (numero <= 1 || numero >= 100) {
                System.out.println("Número inválido! Você deve informar um número de 1 e 100 ");
                erro = true;
            }
        }

        if (!erro) {
            if (numero == numeroAleatorio) {
                System.out.println("Parabéns, Você acertou!!!\nO Número era " + numeroAleatorio + ".\n");
                acertou = true;
            } else if (numeroAleatorio >= numero)
                System.out.println("\nDica: O número que está tentando adivinhar é maior");
            else if (numeroAleatorio < numero)
                System.out.println("\nDica: O número que está tentando adivinhar é menor");
        }

        return acertou;
    }
}
