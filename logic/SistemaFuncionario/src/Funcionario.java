public class Funcionario {
    private String nome;
    private double salario;

    Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void novoSalario(double valor){
        System.out.println("Novo salário: R$" + valor);
    }

    public void exibirDados(){
        System.out.println("Nome: " + nome);
        System.out.println("Salário: " + salario);
    }
}
