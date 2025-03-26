package exercicio_08;

public class Gerente extends Funcionario {
    public Gerente(String nome, double salarioBase) {
        super(nome, salarioBase);
        this.cargo = "Gerente";
    }

    /// Acréscimo de 20% no salário base
    @Override
    public double calcularSalario() {
        return salarioBase * 1.2;
    }
}
