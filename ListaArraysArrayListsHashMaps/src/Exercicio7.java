//7. Cadastro de Pessoas usando HashMap
//Crie um programa que utilize um HashMap<String, Integer> para armazenar nome e idade de 5 pessoas.
//Depois, percorra o mapa e imprima cada pessoa e sua respectiva idade.

import java.util.HashMap;
public class Exercicio7 {
    public static void main(String[] args) {

        HashMap<String, Integer> pessoas = new HashMap<>();

        pessoas.put("Ana", 25);
        pessoas.put("Bruno", 30);
        pessoas.put("Carlos", 22);
        pessoas.put("Daniela", 28);
        pessoas.put("Eduardo", 35);

        System.out.println("Lista de pessoas e suas idades:");
        for (String nome : pessoas.keySet()) {
            int idade = pessoas.get(nome);
            System.out.println(nome + " - " + idade + " anos");
        }
    }
}
