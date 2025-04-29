public class CompetidorParalimpico extends Competidor{

    private String nomeResponsavel;

    public CompetidorParalimpico(int numero, String nome, int sexo, int idade, String nomeResponsavel) {
        super(numero, nome, sexo, idade);
        setNomeResponsavel(nomeResponsavel);
    }

    public String getNomeResponsavel() {
        return nomeResponsavel;
    }

    public void setNomeResponsavel(String nomeResponsavel) {
        this.nomeResponsavel = nomeResponsavel;
    }

    public double getDesconto(){
        if (this.getNomeResponsavel().equalsIgnoreCase("Henrique Siqueira")) {
            return 0.9;
        }
        return 1.0;
    }

    @Override
    public double getPagamento(){
        return getNumero() * getDesconto();
    }

    @Override
    public String toString() {
        return super.toString() + "\nNome Responsável: " + this.getNomeResponsavel();
    }
}
