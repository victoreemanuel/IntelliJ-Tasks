public class Animal {
    private String nome;

    Animal(){
        this.nome = nome;
    }

    Animal(String nome){
        this.nome = nome;
    }

    public void emitirSom(){
        System.out.println("O animal emite um som.");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
