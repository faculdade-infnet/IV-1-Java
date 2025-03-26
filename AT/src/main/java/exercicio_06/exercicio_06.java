package exercicio_06;

public class exercicio_06 {
    public void Start() {
        var veiculo1 = new Veiculo("YJk-2025", "Gol", 2000, 30.2);
        var veiculo2 = new Veiculo("YJk-2001", "Onix", 2010, 51.2);

        veiculo1.registrarViagem(10);
        veiculo1.registrarViagem(20.2);

        veiculo2.registrarViagem(50.2);
        veiculo2.registrarViagem(20);

        veiculo1.exibirDetalhes();
        veiculo2.exibirDetalhes();
    }
}
