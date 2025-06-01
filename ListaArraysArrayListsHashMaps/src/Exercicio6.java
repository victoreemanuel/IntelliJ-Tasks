//6. Verificar se um item existe no ArrayList
//Utilizando o ArrayList de produtos:
//• Peça ao usuário (via Scanner) um nome de produto.
//• Verifique se o produto existe na lista usando contains.
//• Exiba uma mensagem apropriada ("Produto encontrado" ou "Produto não encontrado").

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        ArrayList<String> produtos = new ArrayList<>();
        produtos.add("Arroz");
        produtos.add("Feijão");
        produtos.add("Macarrão");
        produtos.add("Leite");
        produtos.add("Café");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome de um produto para verificar: ");
        String nomeProduto = scanner.nextLine();

        if (produtos.contains(nomeProduto)) {
            System.out.println("Produto encontrado!");
        } else {
            System.out.println("Produto não encontrado.");
        }

        scanner.close();
    }
}
