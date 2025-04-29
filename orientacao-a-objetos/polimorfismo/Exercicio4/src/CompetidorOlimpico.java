public class CompetidorOlimpico extends Competidor{

    private int qtdTitulosMundiais;

    public CompetidorOlimpico(int numero, String nome, int sexo, int idade, int qtdTitulosMundiais) {
        super(numero, nome, sexo, idade);
        setQtdTitulosMundiais(qtdTitulosMundiais);
    }

    public int getQtdTitulosMundiais() {
        return qtdTitulosMundiais;
    }

    public void setQtdTitulosMundiais(int qtdTitulosMundiais) {
        this.qtdTitulosMundiais = qtdTitulosMundiais;
    }

    @Override
    public double getPagamento(){
        return (this.getQtdTitulosMundiais() * 10.0) - (100 - this.getQtdTitulosMundiais());
    }

    @Override
    public String toString() {
        return super.toString() + "\nTítulos mundiais: " + this.getQtdTitulosMundiais();
    }
}
