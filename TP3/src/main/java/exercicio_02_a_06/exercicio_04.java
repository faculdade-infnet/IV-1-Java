package exercicio_02_a_06;

public class exercicio_04 {
    public void Start() {
        System.out.println("########## " + this.getClass().getSimpleName() + ": Testando a Classe 'Produto' ##########\n");

        Produto  produto = new Produto();
        produto.nome = "Iphone 8";
        produto.preco = 3100.20;
        produto.quantidadeEmEstoque = 100;

        produto.AlterarPreco(2500);
        produto.AlterarQuantidade(50);
        produto.ExibirInformacoes();
    }
}
