package exercicio_08;

public class exercicio_08 {
    public void Start() {
        var gerente1 = new Gerente("Ricardo", 1000);
        var estagiario1 = new Estagiario("Carlos", 1000);

        estagiario1.exibirSalarios();
        gerente1.exibirSalarios();
    }
}
