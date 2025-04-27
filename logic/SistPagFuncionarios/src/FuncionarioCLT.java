public class FuncionarioCLT extends Funcionario {

    double percentual;

    public FuncionarioCLT(String nome, double salario, double percentual){
        super(nome, salario);
        this.percentual = percentual;
    }

    @Override
    public void exibirDados(){
        super.exibirDados();
        System.out.println("Percentual: " + percentual + "%");
    }

    public void calcularSalario(){
        salario = salario (salario * 10 /100);
    }
}
