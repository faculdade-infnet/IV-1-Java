package exercicio_02_a_06;

/**
 * Imagine que você é responsável pelo gerenciamento de produtos em um pequeno supermercado.
 * É preciso cadastrar cada item com nome, preço e quantidade disponível em estoque, bem como atualizar esses dados sempre que houver mudanças.
 * Ao final, você deve exibir as informações do produto para ter um registro atualizado no sistema.
 */
public class exercicio_04 {
    public void Start() {
        System.out.println("\n########## " + this.getClass().getSimpleName() + ": Testando a Classe 'Produto' ##########\n");

        Produto  produto = new Produto();
        produto.nome = "Iphone 8";
        produto.preco = 3100.20;
        produto.quantidadeEmEstoque = 100;

        produto.alterarPreco(2500);
        produto.alterarQuantidade(50);
        produto.exibirInformacoes();
    }
}
