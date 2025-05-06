public class ProgramaDotNet extends Programa {

    private String pacote;
    private int qtdMetodos;

    public ProgramaDotNet(String nome, int qtdLinhas) {
        super(nome, qtdLinhas);
    }

    public String getPacote() {
        return pacote;
    }

    public void setPacote(String pacote) {
        this.pacote = pacote;
    }

    public int getQtdMetodos() {
        return qtdMetodos;
    }

    public void setQtdMetodos(int qtdMetodos) {
        this.qtdMetodos = qtdMetodos;
    }

    @Override
    public int getTempoCompilacao() {
        int tempoCompilacao = super.getTempoCompilacao();
        if (this.qtdMetodos < 10 ) {
            tempoCompilacao += 2;
        } else if ( this.qtdMetodos >= 10 && this.qtdMetodos < 20 ) {
            tempoCompilacao += 3;
        } else {
            tempoCompilacao += 4;
        }
        return tempoCompilacao;
    }

    @Override
    public String toString() {
        String string = super.toString() +
                "\nLinguagem = .net" +
                "\nPacote = " + this.getPacote() +
                "\nQuantidade de métodos = " + this.getQtdMetodos();
        return string.toUpperCase();
    }
}
