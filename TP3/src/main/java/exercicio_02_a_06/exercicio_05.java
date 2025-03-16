package exercicio_02_a_06;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * Imagine que você é responsável pelo gerenciamento de produtos em um pequeno supermercado.
 * É preciso cadastrar cada item com nome, preço e quantidade disponível em estoque, bem como atualizar esses dados sempre que houver mudanças.
 * Ao final, você deve exibir as informações do produto para ter um registro atualizado no sistema.
 */
public class exercicio_05 {
    public void Start() {
        System.out.println("########## " + this.getClass().getSimpleName() + ": Criando Métodos de Propriedade (Getters e Setters) ##########\n");

        System.out.println("Explicação do porque (getters e setters) são úteis no código:");
        System.out.println("1 - Encapsulamento: Usar getters e setters estabelece um padrão consistente que facilita mudanças futuras. Se você precisar adicionar validações ou lógica adicional mais tarde, a interface pública da sua classe permanece a mesma.");
        System.out.println("2 - Validação de dados: Os setters permitem validar dados antes de atribuí-los.");
        System.out.println("3 - Lógica Computacional: Getters podem retornar valores calculados, não apenas o valor bruto armazenado.");
        System.out.println("4 - Notificações de Mudança: Setters podem notificar outros componentes quando um valor muda.\n");

        Produto produto = new Produto();
        produto.setNome("Iphone 8");
        produto.setPreco(3100.20);
        produto.setQuantidadeEmEstoque(100);

        // Define o formato para moeda no Brasil
        NumberFormat formatoMoeda = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

        System.out.println("Informações do Produto");
        System.out.println("Nome do Produto: "+ produto.getNome());
        System.out.println("Preço: " + formatoMoeda.format(produto.getPreco()));
        System.out.println("Quantidade em Estoque: " + produto.getQuantidadeEmEstoque() + " unidades");
    }
}
