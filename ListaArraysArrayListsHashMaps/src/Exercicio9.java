//9. Comparação de Performance — Lista vs HashMap (Avançado)
//Crie dois conjuntos de dados:
//• Um ArrayList<String> com 10.000 nomes (use um laço para gerar nomes como "Nome0", "Nome1",
//"Nome2", etc.).
//• Um HashMap<String, Integer>, onde a chave é o nome ("Nome0", "Nome1", etc.) e o valor é um
//número qualquer.
//Faça o programa:
//• Pedir um nome ("Nome9999") e medir o tempo para encontrar esse nome:
//o 1º no ArrayList (percorrendo com for-each).
//o 2º no HashMap (usando get() diretamente).
//Exiba o tempo gasto em milissegundos.
//Dica: use System.currentTimeMillis() antes e depois da busca.


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Exercicio9 {
    public class ComparacaoPerformance {
        public static void main(String[] args) {
            ArrayList<String> lista = new ArrayList<>();
            HashMap<String, Integer> mapa = new HashMap<>();

            for (int i = 0; i < 10000; i++) {
                String nome = "Nome" + i;
                lista.add(nome);
                mapa.put(nome, i);
            }

            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite o nome a ser buscado (ex: Nome9999): ");
            String nomeBusca = scanner.nextLine();

            long inicioLista = System.currentTimeMillis();
            boolean encontradoLista = false;

            for (String nome : lista) {
                if (nome.equals(nomeBusca)) {
                    encontradoLista = true;
                    break;
                }
            }

            long fimLista = System.currentTimeMillis();
            long tempoLista = fimLista - inicioLista;

            long inicioMapa = System.currentTimeMillis();
            boolean encontradoMapa = mapa.get(nomeBusca) != null;
            long fimMapa = System.currentTimeMillis();
            long tempoMapa = fimMapa - inicioMapa;

            System.out.println("\nResultado da busca:");
            System.out.println("ArrayList -> Encontrado: " + encontradoLista + " | Tempo: " + tempoLista + " ms");
            System.out.println("HashMap   -> Encontrado: " + encontradoMapa + " | Tempo: " + tempoMapa + " ms");

            scanner.close();
        }
    }
}