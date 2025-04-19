public class Professor extends Funcionario {

    private String titulacao;


    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    public Professor(String nome, String cpf, double salario, String titulacao) {
        super(nome, cpf, salario);
        setTitulacao(titulacao);
    }

    public double getImpostoRenda() {
        return super.getSalario() * 0.23;
    }


}
