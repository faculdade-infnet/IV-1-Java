package exercicio_11;

import java.util.Scanner;

public class exercicio_11 {
    /// Sequência Numérica Personalizada
    public void Start() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número para valor inicial:");
        int inicio = sc.nextInt();

        System.out.println("Digite um número para ser o incremento:");
        int incremento = sc.nextInt();

        String textoConcatenado = "";

        for (int i = inicio; i < 1000; i += incremento) {
            textoConcatenado += i + " ; ";

            if (i > 100)
                break;
        }
        System.out.println("A sequência númerica gerada foi:\n" + textoConcatenado);

        sc.close();
    }
}
