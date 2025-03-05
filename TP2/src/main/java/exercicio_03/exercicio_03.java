package exercicio_03;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class exercicio_03 {
    /// Conversor de Moedas
    public void Start() {
        Scanner sc = new Scanner(System.in);

        // Define o formato para Real (Brasil)
        NumberFormat formatoBR = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

        System.out.print("Digite um valor em R$: ");
        double reais = sc.nextDouble();
        sc.nextLine();

        System.out.println("Escolha uma moeda para conversão:\n1 - Dólar\n2 - Euro\n3 - Libra");
        int moeda = sc.nextInt();

        String[] conversao = Conversao(moeda, reais);
        System.out.println("A conversão de " + formatoBR.format(reais)+ " para (" + conversao[1] + ") é de " + conversao[0]);

        sc.close();
    }

    private String[] Conversao(int moeda, double reais) {
        String conversao = "";
        String moedaTexto = "";

        switch (moeda) {
            case 1:
                moedaTexto = "Dólar";
                // Formata o número em R$
                NumberFormat formatoBR = NumberFormat.getCurrencyInstance(Locale.US);

                double dolar = 5.83;
                conversao = formatoBR.format(reais * dolar);
                break;
            case 2:
                moedaTexto = "Euro";
                // Define o formato para Dólar (EUA)
                NumberFormat formatoUS = NumberFormat.getCurrencyInstance(Locale.FRANCE);

                double euro = 6.12;
                conversao = formatoUS.format(reais * euro);
                break;
            case 3:
                moedaTexto = "Libra";
                // Define o formato para Libra Esterlina (Reino Unido)
                NumberFormat formatoUK = NumberFormat.getCurrencyInstance(Locale.UK);

                double libra = 7.47;
                conversao = formatoUK.format(reais * libra);
                break;
            default:
                System.out.println("Opção informada inválida! Escolha um número de 1 a 3.");
                break;
        }

        return new String[] {conversao, moedaTexto};
    }
}
