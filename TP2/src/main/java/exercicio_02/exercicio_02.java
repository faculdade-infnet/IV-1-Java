package exercicio_02;

import java.util.Scanner;

public class exercicio_02 {
    /// Calculadora de Média de Notas
    public void Start() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a 1° nota do Bimestre: ");
        Double nota1 = sc.nextDouble();
        sc.nextLine();

        System.out.print("Digite a 2° nota do Bimestre: ");
        Double nota2 = sc.nextDouble();
        sc.nextLine();

        System.out.print("Digite a 3° nota do Bimestre: ");
        Double nota3 = sc.nextDouble();
        sc.nextLine();

        System.out.print("Digite a 4° nota do Bimestre: ");
        Double nota4 = sc.nextDouble();
        sc.nextLine();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        String resultado = ClassificarNota(media);
        System.out.println("Sua média final é: " + media + "\nVocê foi " + resultado);

        sc.close();
    }

    private String ClassificarNota(double nota) {
        String retorno;

        if (nota <= 5) {
            retorno = "Reprovado";
        } else if (nota >= 7) {
            retorno = "Aprovado";
        } else {
            retorno = "Recuperação";
        }

        return retorno;
    }
}
