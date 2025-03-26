package exercicio_04;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class exercicio_04 {
    public void Start() {
        Scanner sc = new Scanner(System.in);
        // Define o formato para Real (Brasil)
        NumberFormat formatoMoeda = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

        System.out.println("Informe o seu nome:");
        String nome = sc.nextLine();

        System.out.println("Informe o valor do Empréstimo:");
        double valorEmprestimo = sc.nextDouble();
        sc.nextLine();

        int numParcelas = getNumParcelas(0, sc);

        // Fórmula dos juros compostos
        double valorTotal = CalculoMontante(valorEmprestimo, numParcelas);
        double parcelaMensal = valorTotal / numParcelas;

        System.out.println("Valor total pago: " + formatoMoeda.format(valorTotal));
        System.out.println("Valor da parcela mensal: " + formatoMoeda.format(parcelaMensal));

        sc.close();
    }

    /// Obtém o número de parcelas
    private static int getNumParcelas(int numParcelas, Scanner sc) {
        do {
            System.out.println("Informe o número de parcelas que deseja para o empréstimo:\nMínimo 6, Máximo 48.");
            numParcelas = sc.nextInt();
            sc.nextLine();
        }while (numParcelas < 6 || numParcelas > 48);

        return numParcelas;
    }

    /// Calcula o montagem resultante após emprestimo com juros
    private double CalculoMontante(double valorEmprestimo, int numParcelas) {
        double taxaJuros = 0.03;
        double montate = valorEmprestimo * Math.pow((1 + taxaJuros), numParcelas);

        return montate;
    }
}
