package exercicio_04;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class exercicio_04 {
    /// Calculadora de Idade em Dias
    public void Start() {
        Scanner sc = new Scanner(System.in);

        // Captura a data de nascimento do usuário
        System.out.print("Digite o dia do seu nascimento (1-31): ");
        int dia = sc.nextInt();

        System.out.print("Digite o mês do seu nascimento (1-12): ");
        int mes = sc.nextInt();

        System.out.print("Digite o ano do seu nascimento: (máx-2025)");
        int ano = sc.nextInt();

        // Obtém a data atual
        LocalDate dataAtual = LocalDate.now();

        // Cria um objeto LocalDate com a data de nascimento
        LocalDate dataNascimento = LocalDate.of(ano, mes, dia);

        // Calcula a diferença total de dias entre as duas datas
        long idadeEmDias = ChronoUnit.DAYS.between(dataNascimento, dataAtual);

        // Exibe o resultado
        System.out.println("\nVocê tem cerca de " + idadeEmDias + " dias de vida.");

        sc.close();
    }
}
