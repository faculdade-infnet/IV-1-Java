package exercicio_07_a_09;

public class Conta {
    String titular;         // Representa o nome do dono da conta.
    int numero;             // Identifica a conta.
    String agencia;         //Identifica a agência bancária.
    double saldo;           // Indica o valor atualmente disponível na conta.
    String dataAbertura;    // Registra quando a conta foi aberta.


    /// Saca valora da conta
    public void sacar(double valor) {
        if (saldo > 0) {
            saldo -= valor;
        }
    }

    /// Deposita valor na conta
    public void depositar(double valor) {
        saldo += valor;
    }

    /// Calcula o Rendimento ta conta
    public void calcularRendimento() {
        saldo *= 0.1;
    }
}
