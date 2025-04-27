public class Livro {
    String titulo;
    String autor;
    int anoPublicacao;

    livro(){
    }

    Livro1(String titulo, String autor, int anoPublicacao){
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    Livro2(String titulo, String autor, int anoPublicacao){
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    Livro3(String titulo, String autor, int anoPublicacao){
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public void exibirDetalhes1(){
        System.out.println("Aceite a sua vulnerabilidade e ouse ser grande..");
    }

    public void exibirDetalhes2(){
        System.out.println("sua estratégia inusitada para uma vida melhor.");
    }

    public void exibirDetalhes3(){
        System.out.println("Hábitos Atômicos é um livro de James Clear que ensina a criar bons hábitos e abandonar os maus.");
    }

}
