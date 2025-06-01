//8. Buscar uma idade pelo nome (HashMap)
//Expandindo o exercício anterior:
//• Após o cadastro das pessoas, peça ao usuário que digite um nome.
//• Busque o nome no HashMap e, se encontrado, imprima a idade correspondente.
//• Se não encontrado, imprima uma mensagem adequada.

import java.util.HashMap;
import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {

        HashMap<String, Integer> pessoas = new HashMap<>();


        pessoas.put("Ana", 25);
        pessoas.put("Bruno", 30);
        pessoas.put("Carlos", 22);
        pessoas.put("Daniela", 28);
        pessoas.put("Eduardo", 35);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome da pessoa para buscar a idade: ");
        String nomeBusca = scanner.nextLine();

        if (pessoas.containsKey(nomeBusca)) {
            int idade = pessoas.get(nomeBusca);
            System.out.println(nomeBusca + " tem " + idade + " anos.");
        } else {
            System.out.println("Pessoa não encontrada.");
        }

        scanner.close();
    }
}