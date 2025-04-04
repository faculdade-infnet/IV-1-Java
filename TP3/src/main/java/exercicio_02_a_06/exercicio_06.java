package exercicio_02_a_06;

/**
 * Imagine que você é responsável pelo gerenciamento de produtos em um pequeno supermercado.
 * É preciso cadastrar cada item com nome, preço e quantidade disponível em estoque, bem como atualizar esses dados sempre que houver mudanças.
 * Ao final, você deve exibir as informações do produto para ter um registro atualizado no sistema.
 */
public class exercicio_06 {
    public void Start() {
        System.out.println("\n########## " + this.getClass().getSimpleName() + ": Adicionando Construtores à Classe 'Produto' ##########\n");


        Produto produto = new Produto("Iphone 8", 3100.20, 100);

        produto.setNome("Iphone 11");
        produto.setPreco(2500);
        produto.setQuantidadeEmEstoque(50);
        produto.exibirInformacoes();

        System.out.println("\nVantagens do Uso de Construtores:");
        System.out.println("1 - Garantia de estado inicial válido: Ao usar um construtor com parâmetros, garantimos que o objeto é criado já com todos os dados essenciais, sem possíbilidade do estado incompleto ou inválido.");
        System.out.println("2 - Atomicidade na criação: Você evita de ter objetos parcialmente inicializados como nos Setters.");
        System.out.println("3 - Imutabilidade facilitada: Facilitam a criação de objetos imutáveis (que não mudam após criados)");
        System.out.println("4 - Legibilidade e concisão do código");
    }
}

