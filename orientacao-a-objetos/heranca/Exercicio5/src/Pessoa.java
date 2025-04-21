public class Pessoa {
    String nome;
    int codigo;
    double salario;

    public Pessoa (String nome, int codigo, double salario) {
        setNome(nome);
        setCodigo(codigo);
        setSalario(salario);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public boolean equals(Object obj) {
        Pessoa comparador = (Pessoa) obj;
        return comparador.getCodigo() == this.getCodigo();
    }

    @Override
    public String toString() {
        return "Nome: " + this.getNome() +
                "\nSalário: " + this.getSalario() +
                "\nFaixa de Renda: " + FaixaDeRenda.getFaixaName(FaixaDeRenda.getFaixa(this.getSalario()));
    }
}
