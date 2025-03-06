package exercicio_06;

import java.util.Scanner;

public class exercicio_06 {
    /// Verificador de Ano Bissexto
    public void Start() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um ano com 4 dígitos (Ex: 1989):");
        String input = sc.nextLine();

        // Verifica se o input tem exatamente 4 dígitos
        if (input.length() != 4 && input != "0000") {
            System.out.println("Erro! Informe um ano válido com 4 dígitos.");
            return;
        }

        int ano = Integer.parseInt(input);
        boolean anoBissexto = false;

        // Anos múltiplos de 400 são bixestos
        // Anos múltiplos de 4 são bisextos, exexeto múltiplos de 100
        if ((ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0)) {
            anoBissexto = true;
        }

        System.out.println(anoBissexto
                ? "O Ano de " + ano + " é Bissexto!"
                : "O Ano de " + ano + " não é Bissexto!");

        sc.close();
    }
}
