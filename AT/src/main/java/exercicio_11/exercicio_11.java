package exercicio_11;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class exercicio_11 {
    private static final Scanner sc = new Scanner(System.in);

    /// Jogo de Adivinhação
    public void Start() {

        System.out.println("###### Tente acertar os números da loteria: ######");

        int acertou = 0;
        List<String> listaNumerosAletorios = new ArrayList<>();
        List<String> listaTentativas = new ArrayList<>();

        listaNumerosAletorios = gerarNumerosAleatorios(listaNumerosAletorios);
        listaTentativas = numerosTentativas(listaTentativas);


        for (int i = 0; i < listaNumerosAletorios.size(); i++) {
            for (int j = 0; j < listaTentativas.size(); j++) {
                String n1 = listaNumerosAletorios.get(i);
                String n2 = listaTentativas.get(j);
                if (listaNumerosAletorios.get(i).equals(listaTentativas.get(j))) {
                    acertou++;
                }
            }
        }

        if (acertou > 0)
            System.out.println("Dos 6 números você acertou " + acertou + "!");
        else
            System.out.println("Dos 6 números você não acertou nenhum");

        sc.close();
    }

    /// Armazena 6 tentativas do usuário
    private List<String> numerosTentativas(List<String> listaTentativas) {

        for (int i = 1; i <= 6; i++) {
            System.out.println("Informe a " + i + "° de 6 tentantivas com números de 1 a 60:");
            String input = sc.nextLine();
            boolean inputValido = false;

            do {
                try {
                    int numero = Integer.parseInt(input);

                    if (numero < 1 || numero > 60) {
                        System.out.println("Número inválido! Você deve informar um número de 1 a 60 ");
                    } else {
                        listaTentativas.add(String.valueOf(numero));
                        inputValido = true;
                    }

                } catch (Exception e) {
                    System.out.println("Você deve informar um número");
                }
            } while (!inputValido);
        }

        return listaTentativas;
    }

    /// Gera 6 números aleatórios
    private List<String> gerarNumerosAleatorios(List<String> listaNumerosAletorios) {
        Random random = new Random();

        for (int i = 0; i < 6; i++) {
            listaNumerosAletorios.add(String.valueOf(random.nextInt(60) + 1));
        }

        return listaNumerosAletorios;
    }
}
