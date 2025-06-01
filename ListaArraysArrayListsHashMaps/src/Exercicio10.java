//10. Cadastro de Produtos Avançado (Avançado)
//Crie um sistema simples de cadastro de produtos utilizando um HashMap<Integer, String>, onde:
//• A chave é o código do produto (inteiro).
//• O valor é o nome do produto.
//O programa deve permitir:
//• Adicionar produtos até que o usuário decida parar.
//• Pesquisar um produto pelo seu código.
//• Listar todos os produtos cadastrados.

import java.util.HashMap;
import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        HashMap<Integer, String> produtos = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Digite o código do produto (ou '0' para parar): ");
            int codigo = scanner.nextInt();
            scanner.nextLine();

            if (codigo == 0) {
                break;
            }

            System.out.print("Digite o nome do produto: ");
            String nome = scanner.nextLine();

            produtos.put(codigo, nome);
            System.out.println("Produto adicionado com sucesso!\n");
        }

        System.out.print("\nDigite o código de um produto para pesquisar: ");
        int codigoBusca = scanner.nextInt();

        if (produtos.containsKey(codigoBusca)) {
            System.out.println("Produto encontrado: " + produtos.get(codigoBusca));
        } else {
            System.out.println("Produto não encontrado.");
        }

        System.out.println("\nLista de todos os produtos cadastrados:");
        for (Integer codigo : produtos.keySet()) {
            String nome = produtos.get(codigo);
            System.out.println("Código: " + codigo + " - Produto: " + nome);
        }

        scanner.close();
    }
}