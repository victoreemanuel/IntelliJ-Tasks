package br.com.PraticaAlura.modelos;

public class IdadePessoa {
    private String nome;
    private int idade;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void exibirIdadePessoa(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }

    public void verificarIdade(){
        if (idade > 18){
            System.out.println("Maior de idade.");
        }else{
            System.out.println("Menor de idade.");
        }
    }
}

