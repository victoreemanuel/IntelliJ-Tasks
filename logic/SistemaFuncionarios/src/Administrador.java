public class Administrador extends Funcionario{
    double bonus;

    Administrador() {
        super(nome, salarioBase);
    }

    @Override
    public void salarioFinal(){
        double salarioFinal = getSalarioBase() + bonus;
        exibirSalario();
    }

}
