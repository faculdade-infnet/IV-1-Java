package exercicio_07;

public class Aluno {
    String nome;
    String matricula;
    double nota1;
    double nota2;
    double nota3;

    /// Calcula a média das 3 notas
    double calcularMedia() {
        double media = (nota1 + nota2 + nota3) / 3;
        return media;
    }


    /// Verifica se o aluno foi aprovado ou reprovado
    String verificarAprovacao() {
        double media = calcularMedia();
        String situacao = media >= 7 ? "Aprovado" : "Reprovado";

        return situacao;
    }
}
