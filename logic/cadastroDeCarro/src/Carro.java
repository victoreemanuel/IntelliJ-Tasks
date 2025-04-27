public class Carro {
    String modelo;
    String marca;
    int ano;

    public Carro(String modelo, String marca, int ano){
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
    }

    public void mostraInfo(){
        System.out.println("Modelo: " + modelo);
        System.out.println("Marca: " + marca);
        System.out.println("Ano: " + ano);
    }

    public void verificarCarroAntigo(){
        if (ano < 2000){
            System.out.println("Esse carro é antigo.");
        }
    }

}
