public class Professor {
    private String nome;
    private Titulacao titulacao;
    private double salario;
    private int matricula;

    public Professor(int matricula) {
        setMatricula(matricula);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Titulacao getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(Titulacao titulacao) {
        this.titulacao = titulacao;
    }

    public void setTitulacao(int codigoTitulacao) {
        Titulacao titulacao = Titulacao.getTitulacaoByCodigo(codigoTitulacao);
        setTitulacao(titulacao);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    @Override
    public boolean equals(Object obj) {
        Professor professor = (Professor) obj;
        if (professor.getMatricula() == this.getMatricula()){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        String string =  "Nome: " + this.getNome();
        string +=  "\nMatrícula: " + this.getMatricula();
        string += "\nTitulação: " + this.getTitulacao();
        string += "\nSalário: " + this.getSalario();
        return string.toUpperCase();
    }
}
