package exercicio_10_a_12;

/**
 * Você está desenvolvendo um sistema simples para calcular áreas (para figuras 2D) e volumes (para figuras 3D).
 * Ainda não foram apresentados conceitos avançados (como herança), então você criará classes independentes para cada forma.
 */
public class exercicio_12 {
    public void Start() {
        System.out.println("\n########## " + this.getClass().getSimpleName() + ": Testando as Classes de Figuras ##########\n");

        Circulo circulo = new Circulo();
        Esfera esfera = new Esfera();

        circulo.raio = 3;
        esfera.raio = 5;

        String areaCirculo = String.format("%.2f", circulo.calcularArea());
        String areaEsfera = String.format("%.2f", esfera.calcularVolume());

        System.out.println("Área do Círculo para raio(" + circulo.raio + "): " + areaCirculo);
        System.out.println("Volume da Esfera para raio(" + esfera.raio + "): " + areaEsfera);
    }
}
