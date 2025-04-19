public class Administrativo extends Funcionario{

    private int dependentes;

    public int getDependentes() {
        return dependentes;
    }

    public void setDependentes(int dependentes) {
        this.dependentes = dependentes;
    }

    public Administrativo (String nome, String cpf, double salario, int dependentes) {
        super(nome, cpf, salario);
        setDependentes(dependentes);
    }

    public double getContribuicaoSindical() {
        return super.getSalario() * 0.01;
    }
}
