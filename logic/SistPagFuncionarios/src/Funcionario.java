public class Funcionario {
    String nome;
    double salario;

    Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }


    public void exibirDados(){
        System.out.println("Nome: " + nome);
        System.out.println("Salário: " + salario);
    }
}
