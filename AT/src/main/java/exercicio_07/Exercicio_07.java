package exercicio_07;

import java.util.Scanner;

public class Exercicio_07 {
    private final Scanner sc = new Scanner(System.in);

    /// Calculadora de Média de Notas
    public void Start() {
        Aluno aluno = new Aluno();

        System.out.print("Informe o Nome do aluno: ");
        aluno.nome = sc.nextLine();

        System.out.print("Informe a Matrícula: ");
        aluno.matricula = sc.nextLine();

        aluno.nota1 = lerNota("Digite a 1° nota: ");
        aluno.nota2 = lerNota("Digite a 2° nota: ");
        aluno.nota3 = lerNota("Digite a 3° nota: ");

        String resultado = aluno.verificarAprovacao();
        System.out.println("O aluno: " + aluno.nome + " | Matrícula:" + aluno.matricula + " está " + resultado + ".");

        sc.close();
    }

    // Lê as notas e valida a entrada
    private double lerNota(String mensagem) {
        double nota;

        while (true) {
            System.out.print(mensagem);
            String entrada = sc.nextLine().replace(",", ".");
            try {
                nota = Double.parseDouble(entrada);
                if (nota < 0 || nota > 10) {
                    System.out.println("Nota inválida. A nota deve estar entre 0 e 10.");
                } else {
                    break; // Entrada válida
                }
            } catch (NumberFormatException e) {
                System.out.println("Valor inválido! Insira um número válido.");
            }
        }
        return nota;
    }
}
