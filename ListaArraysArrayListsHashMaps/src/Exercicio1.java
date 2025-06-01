//1. Criando um vetor fixo de inteiros
//Crie um vetor de 5 números inteiros e preencha manualmente com valores à sua escolha.
//Depois, imprima todos os números utilizando um laço for.

public class Exercicio1 {
    public static void main(String[] args) {
        int[] valor = new int[5];

        valor[0] = 22;
        valor[1] = 33;
        valor[2] = 44;
        valor[3] = 55;
        valor[4] = 66;

         for(int i = 0; i < 5; i++) {
             System.out.println(valor[i]);

         }
    }
}
