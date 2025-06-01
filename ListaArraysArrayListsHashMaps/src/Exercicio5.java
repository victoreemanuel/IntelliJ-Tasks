//5. Remover um elemento do ArrayList
//Com base no exercício anterior:
//• Após adicionar os 5 produtos, remova um deles pelo nome usando remove("produto").
//• Em seguida, imprima novamente o conteúdo da lista.

import java.util.ArrayList;

public class Exercicio5 {

    public class RemoverProduto {
        public static void main(String[] args) {

            ArrayList<String> produtos = new ArrayList<>();

            produtos.add("Arroz");
            produtos.add("Feijão");
            produtos.add("Macarrão");
            produtos.add("Leite");
            produtos.add("Café");

            System.out.println("Lista original de produtos:");
            for (String produto : produtos) {
                System.out.println(produto);
            }

            produtos.remove("Leite");

            System.out.println("\nLista após remover 'Leite':");
            for (String produto : produtos) {
                System.out.println(produto);
            }
        }
    }
}
