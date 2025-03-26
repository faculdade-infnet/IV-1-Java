package exercicio_07;

import java.util.Scanner;

public class exercicio_07 {
    /// Calculadora de Média de Notas
    public void Start() {
        Scanner sc = new Scanner(System.in);

        var aluno = new Aluno();

        System.out.println("Informe o Nome do aluno:");
        aluno.nome = sc.nextLine();

        System.out.println("Informe a Matrícula:");
        aluno.matricula = sc.nextLine();

        System.out.print("Digite a 1° nota: ");
        aluno.nota1 = sc.nextDouble();
        sc.nextLine();

        System.out.print("Digite a 2° nota: ");
        aluno.nota2 = sc.nextDouble();
        sc.nextLine();

        System.out.print("Digite a 3° nota: ");
        aluno.nota3 = sc.nextDouble();
        sc.nextLine();

        String resultado = aluno.verificarAprovacao();
        System.out.println("O aluno: " + aluno.nome + " | Matrícula:" + aluno.matricula + " está " + resultado + ".");

        sc.close();
    }
}
