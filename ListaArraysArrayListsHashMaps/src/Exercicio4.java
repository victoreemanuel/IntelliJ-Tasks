//4. ArrayList de Produtos
//Crie um ArrayList<String> para armazenar o nome de 5 produtos.
//Adicione os produtos usando o método add e imprima todos eles com um for-each.

import java.util.ArrayList;
public class Exercicio4 {
    public static void main(String[] args) {

        ArrayList<String> produtos = new ArrayList<>();

        produtos.add("Arroz");
        produtos.add("Feijão");
        produtos.add("Macarrão");
        produtos.add("Leite");
        produtos.add("Café");

        for (String produto : produtos) {
            System.out.println(produto);
        }
    }
}

