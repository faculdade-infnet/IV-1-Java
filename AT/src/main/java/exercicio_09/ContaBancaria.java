package exercicio_09;

public class ContaBancaria {
    private final String titular;
    private double saldo;

    // Construtor para inicializar a conta
    public ContaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public String getTitular() {
        return titular;
    }

    /**
     * Retorna o saldo atual da conta
     */
    public void exibirSaldo() {
        System.out.println("Seu saldo Sr(a)." + titular + " é de " + FormatarSaldo(saldo) + "\n");
    }

    /**
     * Realiza o deposito do valor informado no saldo da conta
     *
     * @param valor Quantia a ser depositada
     */
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de " + FormatarSaldo(valor) + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    /**
     * Realiza o saque do valor informado no saldo da conta
     *
     * @param valor Quantia a ser retirada
     */
    public void sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque de " + FormatarSaldo(valor) + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente! Tentativa de saque no valor de " + FormatarSaldo(valor));
        }
    }

    private String FormatarSaldo(double valor) {
        return "R$" + String.format("%.2f", valor);
    }
}
