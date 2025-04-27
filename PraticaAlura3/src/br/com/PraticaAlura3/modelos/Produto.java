package br.com.PraticaAlura3.modelos;

public class Produto {
    private String nome;
    private double preco;
    private int desconto;

    //getters e setters
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void aplicarDesconto(double percentual){
        double valorDesconto = (preco * percentual) /100;
        //preço é igual preço - o desconto
        preco -= valorDesconto;
    }
}
