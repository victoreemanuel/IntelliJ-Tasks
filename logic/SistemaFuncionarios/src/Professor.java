public class Professor extends Funcionario{
    int horasAula;

    Professor() {
        super(nome, salarioBase);
    }

    @Override
    public void salarioFinal(){
        double salarioFinal = getSalarioBase() + (horasAula * 40);
        exibirSalario();
    }
}
