package exercicio_06;

import java.text.MessageFormat;

public class Veiculo {
    double quilometragem;
    private String placa;
    private String modelo;
    private int anoDeFabricacao;

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
        System.out.println(MessageFormat.format("Placa: {0} | Modelo: {1} | Ano de Fabricacção:  {2,number,#} | Km: {3,number,#.00}\n", placa, modelo, anoDeFabricacao, quilometragem));
    }


    ///  Adiciona km ao total.
    public void registrarViagem(double km) {
        quilometragem += km;
        System.out.println("Carro: " +  this.modelo + " Placa: " + this.placa + ", Viagem registrada com sucesso!");
    }
}