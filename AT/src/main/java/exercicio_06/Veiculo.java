package exercicio_06;

import java.text.MessageFormat;

public class Veiculo {
    double quilometragem;
    private final String placa;
    private final String modelo;
    private final int anoDeFabricacao;

    /// Construtor
    public Veiculo(String placa, String modelo, int anoDeFabricacao, double quilometragem) {
        this.placa = placa;
        this.modelo = modelo;
        this.anoDeFabricacao = anoDeFabricacao;
        this.quilometragem = quilometragem;
    }

    /// Exibe os dados do veículo.
    public void exibirDetalhes() {
        System.out.println("Dados do Veículo:");
        System.out.println(MessageFormat.format("Placa: {0} | Modelo: {1} | Ano: {2} | Km: {3,number,#.##}", placa, modelo, anoDeFabricacao, quilometragem));
    }


    ///  Adiciona km ao total.
    public void registrarViagem(double km) {
        quilometragem += km;
        System.out.println("Carro: " +  this.modelo + " Placa: " + this.placa + ", Viagem registrada com sucesso!");
    }
}