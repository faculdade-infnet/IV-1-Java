package exercicio_10_a_12;

public class Esfera {
    /// O Raio é imprescindível pois ele é necessário para calcular o volume da Esfera.
    double raio;

    public double calcularVolume() {
        double volume = (4.0 / 3.0) * Math.PI * (raio * raio * raio);
        return volume;
    }
}
