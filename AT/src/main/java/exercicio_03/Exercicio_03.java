package exercicio_03;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio_03 {
    private static final int MESES_NO_ANO = 12; // Definição de constante

    /// Calculadora de Impostos
    public void Start() {
        Scanner sc = new Scanner(System.in);
        // Define o formato para Real (Brasil)
        NumberFormat formatoMoeda = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

        System.out.print("Informe o seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Informe o seu salário mensal: ");
        double salarioMensalBruto = Double.parseDouble(sc.nextLine().replace(",", "."));
        double salarioAnualBruto = salarioMensalBruto * MESES_NO_ANO;
        double impostoAnual = calcularImpostoRenda(salarioAnualBruto);
        String salarioLiquidoMensal = formatoMoeda.format((salarioAnualBruto - impostoAnual )/MESES_NO_ANO);

        System.out.println("Após o desconto de " + formatoMoeda.format(impostoAnual) +
                " do imposto de renda seu salário líquido mensal é de:\n" + salarioLiquidoMensal);
        System.out.println("\nObs. considerei 12 meses no cálculo.\n");

        sc.close();
    }

    // Calcula a imposto anual a ser descontado
    private double calcularImpostoRenda(double salarioAnual) {
        if (salarioAnual > 45012.61) {
            return salarioAnual * 0.275;
        } else if (salarioAnual >= 33919.81) {
            return salarioAnual * 0.15;
        } else if (salarioAnual >= 22847.77) {
            return salarioAnual * 0.075;
        }

        return 0;
    }
}
