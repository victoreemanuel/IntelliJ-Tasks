public abstract class Funcionario {
    protected String nome;
    protected double salarioBase;

    Funcionario(String nome, double salarioBase){
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public String getNome() {
        return nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public void exibirSalario(){
        System.out.println("Nome: ");
        System.out.println("Salário R$");
    }

    public abstract void salarioFinal();
}
