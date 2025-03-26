package exercicio_03;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class exercicio_03 {
    /// Calculadora de Descontos Progressivos
    public void Start() {
        Scanner sc = new Scanner(System.in);

        // Define o formato para Real (Brasil)
        NumberFormat formatoMoeda = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

//        System.out.println("Informe o seu nome:");
//        String nome = sc.nextLine();

        System.out.println("Informe o seu salário mensal:");
        double salarioMensalBruto = sc.nextDouble();
        sc.nextLine();

        int meses = 12;
        double salarioAnualBruto = salarioMensalBruto * meses;

        double imposto = CalculoDescontoSalarioImposto(salarioAnualBruto);
        double salarioLiquido = (salarioAnualBruto - (salarioAnualBruto * imposto) )/meses;

        System.out.println("Após o desconto de " + String.format("%.2f",(imposto * 100)) + "% do imposto de renda seu salário líquido mensal é de:");
        System.out.println(formatoMoeda.format(salarioLiquido));
        System.out.println("\nObs. considerei 12 meses no cálculo.\n");

        sc.close();
    }

    private double CalculoDescontoSalarioImposto(double salarioAnual) {
        double desconto = 0;

        if (salarioAnual > 45012.61) {
            desconto = 0.275;
        } else if (salarioAnual >= 33919.81) {
            desconto = 0.15;
        } else if (salarioAnual >= 22847.77) {
            desconto = 0.075;
        }

        return desconto;
    }
}
