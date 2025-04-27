public class Produto {
    String nome;
    String marca;
    float preco;

    Produto(String nome){
        this.nome = nome;
    }

    Produto(String nome, String marca, float preco){
        this.nome = nome;
        this.marca = marca;
        this.preco = preco;
    }

    Produto(String nome, float preco){
        this.nome = nome;
        this.preco = preco;
    }
}
