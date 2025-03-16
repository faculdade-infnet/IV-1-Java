package exercicio_07_a_09;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/**
 * Imagine que você é responsável por criar um sistema simples de gerenciamento de contas bancárias.
 * Esse sistema deverá cadastrar informações básicas sobre a conta, bem como realizar operações essenciais, como saque e depósito.
 */
public class exercicio_09 {
    public void Start() {
        System.out.println("########## " + this.getClass().getSimpleName() + ": Vamos testar nossa classe ##########\n");

        Conta conta = new Conta();
        conta.titular = "Ricardo Gomes";
        conta.numero = 12345;
        conta.agencia = "0235";
        conta.saldo = 5000;
        // Data
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataBrasil = LocalDate.now();
        conta.dataAbertura =  dataBrasil.format(formato);


        // Define o formato para moeda no Brasil
        NumberFormat formatoMoeda = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

        System.out.println("Informações da Conta:");
        System.out.println("Titular: " + conta.titular);
        System.out.println("Conta/Agência: " + conta.numero + "/" + conta.agencia);
        System.out.println("Saldo: " + formatoMoeda.format(conta.saldo));
        System.out.println("Data de Abertura: " + conta.dataAbertura);
    }
}
