package exercicio_10;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Scanner;

public class Produto {
    Scanner sc = new Scanner(System.in);

    String nome;
    int quantidade;
    double precoUnitario;

    public void adicionarProduto(Path arquivo) {
        String produto = nome + " | " + quantidade + " | " + precoUnitario + "\n";

        try {
            Files.writeString(arquivo, produto, StandardCharsets.UTF_8,
                    StandardOpenOption.CREATE,
                    StandardOpenOption.APPEND);

            System.out.println("Produto adicionado com sucesso!");
        } catch (IOException e) {
            System.out.println("Erro ao adicionar produto");
        }
    }

    public static void exibirProdutos(Path arquivo) {
        if (Files.exists(arquivo)) {
            List<String> linhas = null;
            try {
                System.out.println("Lista de produtos cadastrados:");
                linhas = Files.readAllLines(arquivo, StandardCharsets.UTF_8);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            linhas.forEach(System.out::println);
        } else {
            System.out.println("Arquivo não encontrado!");
        }
    }
}
