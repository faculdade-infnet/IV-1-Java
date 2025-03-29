package exercicio_08;

public class Estagiario  extends Funcionario {
    public Estagiario(String nome, double salarioBase) {
        super(nome, salarioBase);
        this.cargo = "Estagiario";
    }

    /// Desconto de 10% no salário base
    @Override
    public double calcularSalario() {
        return salarioBase * 0.9;
    }
}
