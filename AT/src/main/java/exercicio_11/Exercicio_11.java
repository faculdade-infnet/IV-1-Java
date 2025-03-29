package exercicio_11;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Exercicio_11 {
    private static final Scanner sc = new Scanner(System.in);

    /// Jogo de Adivinhação
    public void Start() {

        System.out.println("###### Tente acertar os números da loteria: ######");

        int acertou = 0;
        List<Integer> listaNumerosAletorios = gerarNumerosAleatorios();
        List<Integer> listaTentativas =  numerosTentativas();

        // Conta quantos acertos o usário teve
        for (Integer numero : listaTentativas) {
            if (listaNumerosAletorios.contains(numero)) {
                acertou++;
            }
        }

        if (acertou > 0)
            System.out.println("Dos 6 números você acertou " + acertou + "!");
        else
            System.out.println("Dos 6 números você não acertou nenhum");

        sc.close();
    }

    /// Armazena 6 tentativas do usuário
    private List<Integer> numerosTentativas() {
        List<Integer> listaTentativas = new ArrayList<>();

        for (int i = 1; i <= 6; i++) {
            System.out.println("Informe a " + i + "° de 6 tentantivas com números de 1 a 60:");
            boolean inputValido = false;

            do {
                String input = sc.nextLine();

                try {
                    int numero = Integer.parseInt(input);

                    if (numero < 1 || numero > 60) {
                        System.out.println("Número inválido! Você deve informar um número de 1 a 60 ");
                    } else {
                        listaTentativas.add(numero);
                        inputValido = true;
                    }

                } catch (Exception e) {
                    System.out.println("Você deve informar um número válido!");
                }
            } while (!inputValido);
        }

        return listaTentativas;
    }

    /// Gera 6 números aleatórios
    private List<Integer> gerarNumerosAleatorios() {
        List<Integer> listaNumerosAletorios = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 6; i++) {
            listaNumerosAletorios.add(random.nextInt(60) + 1);
        }

        return listaNumerosAletorios;
    }
}
