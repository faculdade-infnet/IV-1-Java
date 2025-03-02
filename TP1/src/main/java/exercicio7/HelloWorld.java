package exercicio7;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class HelloWorld {
    public static void main(String[] args) {
        // Data atual
        LocalDate hoje = LocalDate.now();
        // Formato brasileiro de data
        DateTimeFormatter formatoBr = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        String dataFormatada = hoje.format(formatoBr);

        System.out.println("Hoje é dia " + dataFormatada);
        System.out.println("Meu nome é Samuel Hermany");
    }
}
