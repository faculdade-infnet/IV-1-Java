package exercicio_12;

import java.util.Scanner;

public class exercicio_12 {
    /// Contagem de Palavras
    public void Start() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um frase:");
        String frase = sc.nextLine();

        // Remove espaços antes e depois e verifica se a string não é vazia
        // trim.split() divide o texto entre os espaços encontrados
        // .lenght - conta quantas palavras foram encontradas
        int numeroPalavras = frase.trim().isEmpty() ? 0 : frase.trim().split("\\s+").length;

        System.out.println("Número de palavras: " + numeroPalavras);

        sc.close();
    }
}
