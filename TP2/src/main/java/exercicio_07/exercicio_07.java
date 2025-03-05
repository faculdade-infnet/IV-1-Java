package exercicio_07;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class exercicio_07 {
    /// Calculadora de Imposto de Renda
    public void Start() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o seu salário Bruto: ");
        double salarioBruto = sc.nextDouble();
        sc.nextLine();

        double desconto = CalculoDescontoSalarioImposto(salarioBruto);

        // Define o formato para Real (Brasil)
        NumberFormat formatoBR = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        double descontoReais = salarioBruto * desconto;

        System.out.println("Após o desconto de " + (desconto * 100) + "%(" +
                formatoBR.format(descontoReais) + ") seu salário Líquido é de " + formatoBR.format(salarioBruto - descontoReais));

    }

    private double CalculoDescontoSalarioImposto(double salarioBruto) {
        double desconto = 0;

        if (salarioBruto > 4664.68) {
            desconto = 0.275;
        } else if (salarioBruto >= 3751.06) {
            desconto = 0.225;
        } else if (salarioBruto >= 2826.66) {
            desconto = 0.15;
        } else if (salarioBruto >= 2259.21) {
            desconto = 0.075;
        }

        return desconto;
    }
}
