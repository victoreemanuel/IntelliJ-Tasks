public class Cachorro extends Animal{

    Cachorro(String nome, int idade){
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        super.emitirSom();
        System.out.println("Cachorro faz: Au Au");
    }
}
