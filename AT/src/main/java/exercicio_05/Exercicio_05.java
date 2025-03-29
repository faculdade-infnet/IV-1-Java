package exercicio_05;

public class Exercicio_05 {
    public void Start() {
        // Cabeçalho HTTP obrigatório
        System.out.println("Content-Type: text/html\n");

        // Corpo
        System.out.println(
                "<html>\n" +
                "<head><title>Saudação CGI</title></head>\n" +
                "<body>\n" +
                "<h1>Olá, Terráqueos!</h1>\n" +
                "</body>\n" +
                "</html>");
    }
}
