package heranca;

import service.StringDemo;
//import service.poo.StringDemo as String;
import service.condicional.VerificaSaldo;

import static heranca.OperacaoBancaria.OP_SAQUE;


public class BancoDemo {
    public static void main(String[] args) {
        //exemplo1();
        //exemplo2();
        OperacaoBancaria op = new OperacaoBancaria(OP_SAQUE, 500.0);
        StringDemo sd = new StringDemo();
        service.poo.StringDemo sd2 = new service.poo.StringDemo();
        VerificaSaldo vs = new VerificaSaldo();
    }

    private static void exemplo2() {
        ContaCorrente cc = new ContaCorrente("Maria", 1000.0, 5.0);
        ContaPoupanca cp = new ContaPoupanca("José", 500.0, 2.5);

        ContaBancaria ref;

        ref = cc;
        ref.exibirInformacoes();
        System.out.println();

        ref = cp;
        ref.exibirInformacoes();
    }

    private static void exemplo1() {
        ContaCorrente cc = new ContaCorrente("Maria", 1000.0, 5.0);
        cc.exibirInformacoes();
        cc.sacar(100.0);
        cc.exibirInformacoes();

        System.out.println("=========================");
        ContaPoupanca cp = new ContaPoupanca("José", 500.0, 2.5);
        cp.exibirInformacoes();
        cp.aplicarRendimento();
        cp.exibirInformacoes();
        cp.sacar(100.0);
        cp.exibirInformacoes();

        //Como virou abstrata, não pode ser mais implementada!
//        ContaBancaria cb = new ContaBancaria("Fulano", 1000.0);
//        cb.exibirInformacoes();
    }
}
