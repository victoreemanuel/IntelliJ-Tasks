public class Funcionario {
    String nome;
    double notaDesempenho;

    Funcionario(String nome, double notaDesempenho){
        this.nome = nome;
        this.notaDesempenho = notaDesempenho;
    }

    public void avaliarDesempenho(){
        System.out.println("Nome: " + nome);
        System.out.println("Nota Desempenho: " + notaDesempenho);

        if (notaDesempenho >= 8){
            System.out.println("Desempenho excelente!");
        } else if (notaDesempenho >= 5 && notaDesempenho < 8) {
            System.out.println("Desempenho regular!");
        } else {
            System.out.println("Desempenho insatisfatório");
        }
        System.out.println("-----------------------------");
    }
}
