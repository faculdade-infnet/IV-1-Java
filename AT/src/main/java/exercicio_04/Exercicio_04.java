package exercicio_04;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio_04 {
    private static final Scanner sc = new Scanner(System.in);
    private static final double TAXA_JUROS = 0.03; // 3% ao mês
    private static final int PARCELA_MINIMA = 6;
    private static final int PARCELA_MAXIMA = 48;

    public void Start() {
        // Define o formato para Real (Brasil)
        NumberFormat formatoMoeda = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

        System.out.print("Informe o seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Informe o valor do Empréstimo: ");
        String input = sc.nextLine(); // Lê a linha inteira
        double valorEmprestimo = Double.parseDouble(input.replace(",", "."));

        int numParcelas = getNumParcelas();

        // Fórmula dos juros compostos
        double valorTotal = calculoMontante(valorEmprestimo, numParcelas);
        double parcelaMensal = valorTotal / numParcelas;

        System.out.println("Valor total pago: " + formatoMoeda.format(valorTotal));
        System.out.println("Valor da parcela mensal: " + formatoMoeda.format(parcelaMensal));

        sc.close();
    }

    /// Obtém o número de parcelas
    private static int getNumParcelas() {
        int numParcelas;
        do {
            System.out.println("Informe o número de parcelas (Mínimo " + PARCELA_MINIMA + ", Máximo " + PARCELA_MAXIMA + ") que deseja para o empréstimo:\n");
            numParcelas = sc.nextInt();
            sc.nextLine();
        }while (numParcelas < 6 || numParcelas > 48);

        return numParcelas;
    }

    /// Calcula o montagem resultante após emprestimo com juros
    private double calculoMontante(double valorEmprestimo, int numParcelas) {
        return valorEmprestimo * Math.pow((1 + TAXA_JUROS), numParcelas);
    }
}
