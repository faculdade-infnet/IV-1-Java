//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int idade = 25;

        quadrado(idade);

        System.out.printf("Hello and welcome!");
    }

    public static int quadrado(int numero) {
        System.out.println("cheguei aqui! - " + numero);
        return numero * 2;
    }
}