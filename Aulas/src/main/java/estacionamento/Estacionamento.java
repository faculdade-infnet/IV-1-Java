package estacionamento;

import java.util.ArrayList;
import java.util.Scanner;

public class Estacionamento {
    static final int NUMERO_MAXIMO_DE_VAGAS = 10;

    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Veiculo> vagas = new ArrayList<>();

    public static void main(String[] args) {
        int opcao;

        do {
            System.out.println("\n\n\n##################################");
            System.out.println("### Estacionamento Inteligente ###");
            System.out.println("##################################");
            System.out.println("1 - Estacionar veículo!");
            System.out.println("2 - Remover veículo!");
            System.out.println("3 - Listar veículos!");
            System.out.println("4 - Exibir vagas disponíveis!");
            System.out.println("5 - Sair!!!");

            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    estacionarVeiculo();
                    break;
                case 2:
                    removerVeiculo();
                    break;
                case 3:
                    listarVeiculo();
                    break;
                case 4:
                    System.out.println("\n Vagas disponiveis: " + (NUMERO_MAXIMO_DE_VAGAS - vagas.size()));
                    break;
                case 5:
                    System.out.println("Sistema encerrado!");
                    break;
                default:
                    System.out.println("Opção invalida!");
            }
        } while (opcao != 5);
    }

    private static void listarVeiculo() {
        if (vagas.isEmpty()) {
            System.out.println("Nenhum veículo estacionado!");
            return;
        }
        System.out.println("Veículos estacionados: ");

        for (Veiculo v : vagas) {
            v.setPlaca("");
            System.out.println(" -> Placa: " + v.getPlaca() + " | Modelo: " + v.getModelo());
        }
    }

    private static void removerVeiculo() {
        if (vagas.isEmpty()) {
            System.out.println("\nNão há veiculos para remover!\n\n");
            return;
        }
        System.out.print("\nDigite a placa do veículo a ser removido: ");
        var placa = scanner.nextLine();

        for (Veiculo v : vagas) {
            if (v.isPlacaEqual(placa)) {
                var tempo = v.calcularTempoEstacionado();
                var valorAPagar = tempo * 5.0;
                System.out.println("Tempo estacionado: " + tempo + " horas");
                System.out.println("Valor a pagar: R$ " + valorAPagar);
                vagas.remove(v);
                System.out.println("Veiculo removido com sucesso!");
                return;
            }
        }

        System.out.println(" Veículo não encontrado!");
    }

    private static void estacionarVeiculo() {
        if (vagas.size() >= NUMERO_MAXIMO_DE_VAGAS) {
            System.out.println("\n Estacionamento cheio! Não há mais vagas!");
            return;
        }

        System.out.print("\n Digite a placa do veiculo: ");
        String placa = scanner.nextLine();

        System.out.print("\n Digite o modelo do veiculo: ");
        String modelo = scanner.nextLine();

        var novoVeiculo = new Veiculo(placa, modelo);
        vagas.add(novoVeiculo);

        System.out.println("Veículo estacionado com sucesso!");
    }

}
