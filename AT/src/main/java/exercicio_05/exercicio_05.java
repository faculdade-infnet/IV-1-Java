package exercicio_05;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class exercicio_05 {
    public void Start() {
        Scanner sc = new Scanner(System.in);
        // Define o formato para Real (Brasil)
        NumberFormat formatoMoeda = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

        String saudacao = "Saudação CGI";
        System.out.println("Informe o corpo de resposta:");
        String corpo = sc.nextLine();

        System.out.println(
                "<html>\n" +
                "<head><title>" + saudacao + "</title></head>\n" +
                "<body>\n" +
                "<h1>" + corpo + "</h1>\n" +
                "</body>\n" +
                "</html>");

        sc.close();
    }
}
