package exercicio_08;

import java.text.NumberFormat;
import java.util.Locale;

public abstract class Funcionario {
    protected String nome;
    public double salarioBase;
    public String cargo;

    /**
     * Construtor
     */
    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }


    /**
     * Método abstrato para calcular o salário final
     */
    public abstract double calcularSalario();

    /**
    * Método para exibir detalhes do funcionário
    */
    public void exibirSalarios() {
        System.out.println(cargo + ": " + nome + " | Salário Final: R$ " + String.format("%.2f", calcularSalario()));
    }
}
