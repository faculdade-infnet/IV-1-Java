package exercicio_01;

// Declaração da classe Livro
public class Livro {
    // Campos (ou atributos) da classe
    String titulo;
    String autor;
    int numeroPaginas;
    boolean foiLido;

    // Construtor da classe
    Livro (String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
        this.foiLido = foiLido;
    }

    // Método que marca o livro como lido
    public void MarcarComoLido() {
        this.foiLido = true;
        System.out.println("O livro " +  titulo + " foi marcado como lido!");
    }
    
    // Método que retorna a informação resumida sobre o livro
    public String ObterInformacoes() {
        String statusLeitura = this.foiLido ?  "já foi lido" : "ainda não foi lido";
        String retorno = "Livro:" + titulo + ", Autor: " + autor + ", Páginas: " + numeroPaginas + ", Status: " + statusLeitura;

        return retorno;
    }
}
