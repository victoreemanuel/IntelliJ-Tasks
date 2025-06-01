//3. Soma de elementos de um vetor
//Crie um vetor de 6 números inteiros.
//Percorra o vetor usando for e calcule a soma de todos os elementos.
//Ao final, imprima o valor total da soma.

public class Exercicio3 {
    public static void main(String[] args) {

        int[] numeros = {11, 22, 33, 44, 55, 66};

        int soma = 0;

        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }

        System.out.println("A soma dos elementos é: " + soma);
    }
}
