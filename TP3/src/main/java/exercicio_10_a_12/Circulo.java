package exercicio_10_a_12;

public class Circulo {
    /// O Raio é imprescindível pois ele é necessário para calcular a área e o perímetro do Círculo.
    double raio;

    public double CalcularArea() {
        double area = Math.PI * (raio * raio );
        return area;
    }
}
