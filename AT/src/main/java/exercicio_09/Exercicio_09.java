package exercicio_09;

import java.util.Scanner;

public class Exercicio_09 {
    public void Start() {
        Scanner sc = new Scanner(System.in);

        ContaBancaria conta = new ContaBancaria("Carlos Nascimento", 0);

        conta.exibirSaldo();
        conta.depositar(500);
        conta.exibirSaldo();
        conta.sacar(300);
        conta.exibirSaldo();
        conta.sacar(1500);
        conta.exibirSaldo();
    }
}
