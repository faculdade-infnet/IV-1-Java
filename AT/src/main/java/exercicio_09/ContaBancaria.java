package exercicio_09;

public class ContaBancaria {

    String titular;
    private double saldo;

    /**
     * Retorna o saldo atual da conta
     */
    public void exibirSaldo() {
        System.out.println("Seu saldo Sr(a)." + titular + " é de R$" + String.format("%.2f", saldo));
    }

    /**
     * Realiza o deposito do valor informado no saldo da conta
     *
     * @param valor Quantia a ser depositada
     */
    public void depositar(double valor) {
        saldo += valor;
    }

    /**
     * Realiza o saque do valor informado no saldo da conta
     *
     * @param valor Quantia a ser retirada
     */
    public void sacar(double valor) {
        if (saldo < valor) {
            System.out.println("Saldo insuficiente!\nSeu saldo disponível é de R$" + String.format("%.2f", saldo));
        } else {
            saldo -= valor;
        }
    }
}
