//2. Vetor de Nomes e Impressão com For-Each
//Crie um vetor de nomes de cidades com 4 elementos.
//Utilize o laço for-each para imprimir cada cidade na tela.

public class Exercicio2 {
    public static void main(String[] args) {
        String[] cidade = new String[4];

        cidade[0] = "Maringá";
        cidade[1] = "Itambé";
        cidade[2] = "Floresta";
        cidade[3] = "Floriano";

        for(String cidades : cidade){
            System.out.println(cidades);
        }
    }
}