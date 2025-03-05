package exercicio_05;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class exercicio_05 {
    /// Calculadora de Descontos Progressivos
    public void Start() {
        Scanner sc = new Scanner(System.in);
// Define o formato para Real (Brasil)
        NumberFormat formatoBR = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

        System.out.println("Informe o valor da compra para verificarmos os desconto:");
        double compra = sc.nextDouble();
        sc.nextLine();

        double desconto = 0.00;
        String descontoPercentual = "";

        if (compra > 1000 ) {
            desconto = compra * 0.1;
            descontoPercentual = "10%";
        } else if (compra >= 500 && compra <= 1000) {
            desconto = compra * 0.05;
            descontoPercentual = "5%";
        }

        System.out.println("Para a compra de " + formatoBR.format(compra) + " - desconto " +  descontoPercentual + "(" + formatoBR.format(desconto) + ")");
        System.out.println("O preço final a ser pago pela sua compra é de " +  formatoBR.format((compra - desconto)) + "\n");


    }
}
