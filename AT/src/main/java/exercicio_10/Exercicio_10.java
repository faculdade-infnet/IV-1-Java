package exercicio_10;

import java.nio.file.Path;
import java.util.Scanner;

public class Exercicio_10 {
    public void Start() {
        Scanner sc = new Scanner(System.in);
        Path arquivo = Path.of(System.getProperty("user.dir")).resolve("compras.txt");

        System.out.println("######## Cadastre 3 compras: ########");

        for (int i = 0; i < 3; i++) {
            var produto1 = new Produto();
            System.out.print("Informe o nome do produto: ");
            produto1.nome = sc.nextLine();

            System.out.print("Informe a quanidade disponível do produto: ");
            produto1.quantidade = sc.nextInt();
            sc.nextLine();

            System.out.print("Informe o preço por unidade do produto: ");
            produto1.precoUnitario = Double.parseDouble(sc.nextLine().replace(",", "."));

            produto1.adicionarProduto(arquivo);
        }

        Produto.exibirProdutos(arquivo);
    }
}
