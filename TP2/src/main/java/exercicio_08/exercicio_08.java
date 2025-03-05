package exercicio_08;

import java.util.Scanner;

public class exercicio_08 {
    /// Classificação de Triângulos
    public void Start() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o 1° lado dos 3 lados do triângulo:");
        double ladoA = sc.nextDouble();
        sc.nextLine();

        System.out.println("Informe o 2° lado dos 3 lados do triângulo:");
        double ladoB = sc.nextDouble();
        sc.nextLine();

        System.out.println("Informe o 3° lado dos 3 lados do triângulo:");
        double ladoC = sc.nextDouble();
        sc.nextLine();

        // Verificando se os lados podem formar um triângulo
        if (ladoA <= 0 || ladoB <= 0 || ladoC <= 0 ||
                ladoA + ladoB <= ladoC || ladoA + ladoC <= ladoB || ladoB + ladoC <= ladoA) {
            System.out.println("Os valores informados não formam um triângulo válido.");
        } else {
            String tipoTriangulo = "Escaleno";

            if (ladoA == ladoB && ladoA == ladoC) {
                tipoTriangulo = "Equilátero";
            } else if (ladoA == ladoB || ladoA == ladoC || ladoB == ladoC) {
                tipoTriangulo = "Isóceles";
            }

            System.out.println("Atráves das 3 lados informados do triângulo, podemos afirmar que se trata de um triângulo " + tipoTriangulo);
        }
    }
}
