package exercicio_01;

/**
 * Explique o Conceitos de Classe, Objeto, Campos e Métodos (C#) com exemplos do dia a dia
*/
public class exercicio_01 {
    public void Start() {
        System.out.println("########## " + this.getClass().getSimpleName() + ": Conceitos de Classe, Objeto, Campos e Métodos ##########\n");

        System.out.println("Conceitos Básicos:\n" +
                            "Classe: É um modelo que define o tipo de um objeto, contendo características e comportamentos que os objetos desse tipo terão.\n" +
                            "Objeto: É uma instância concreta de uma classe, Representa algo do mundo real que possui estado e comportamento definidos pela classe.\n" +
                            "Campos (ou Atributos): São as variáveis declaradas dentro de uma classe que armazenam os dados/estados dos objetos. Representam as características ou propriedades que os objetos daquela classe possuem.\n" +
                            "Métodos: São funções definidas dentro de uma classe que determinam o comportamento dos objetos. Eles podem manipular os campos e realizar operações.\"");


        // Exemplo de utilização dos conceitos de Classe, Objeto, Campos e Métodos
        // Criando objetos (instâncias) da classe Livro
        Livro livro1 = new Livro("Dom Casmurro", "Machado de Assis", 256);
        Livro livro2 = new Livro("1984", "George Orwell", 328);

        // Usando os métodos para interagir com os objetos
        System.out.println("\n" + livro1.ObterInformacoes());

        // Modificando o estado do objeto através de um método
        livro1.MarcarComoLido();

        // Verificando a mudança de estado
        System.out.println(livro1.ObterInformacoes());
        System.out.println(livro2.ObterInformacoes());
    }
}
