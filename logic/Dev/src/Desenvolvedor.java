public class Desenvolvedor {
    private String nome;
    private String ramo;

    public Desenvolvedor(String nome, String ramo) {
        this.nome = nome;
        this.ramo = ramo;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Ramo: " + ramo);
    }

    public static void main(String[] args) {
        Desenvolvedor dev = new Desenvolvedor("Victor Emanuel", "Desenvolvedor Java - Backend");
        dev.exibirInformacoes();
    }
}
