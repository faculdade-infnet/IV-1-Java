package exercicio_09;

import java.util.Scanner;

public class exercicio_09 {
    public void Start() {
        Scanner sc = new Scanner(System.in);

        var conta = new ContaBancaria();
        conta.titular = "Carlos Nascimento";

        System.out.println("Informe o valor de Deposito:");
        double valor = sc.nextDouble();
        sc.nextLine();
        conta.depositar(valor);

        System.out.println("Informe o valor de Saque:");
        valor = sc.nextDouble();
        sc.nextLine();
        conta.sacar(valor);

        conta.exibirSaldo();
    }
}
