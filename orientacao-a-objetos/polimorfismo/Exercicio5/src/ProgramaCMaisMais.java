public class ProgramaCMaisMais extends Programa {

    private int qtdBibliotecas;
    private int qtdFuncoes;

    public ProgramaCMaisMais(String nome, int qtdLinhas) {
        super(nome, qtdLinhas);
    }

    public int getQtdBibliotecas() {
        return qtdBibliotecas;
    }

    public void setQtdBibliotecas(int qtdBibliotecas) {
        this.qtdBibliotecas = qtdBibliotecas;
    }

    public int getQtdFuncoes() {
        return qtdFuncoes;
    }

    public void setQtdFuncoes(int qtdFuncoes) {
        this.qtdFuncoes = qtdFuncoes;
    }

    @Override
    public int getTempoCompilacao() {
        int tempoCompilacao = super.getTempoCompilacao();
        if (this.qtdFuncoes < 60 ) {
            tempoCompilacao += 3;
        } else if ( this.qtdFuncoes >= 60 && this.qtdFuncoes < 80 ) {
            tempoCompilacao += 4;
        } else {
            tempoCompilacao += 5;
        }
        return tempoCompilacao;
    }

    @Override
    public String toString() {
        String string = super.toString() +
                "\nLinguagem = C++" +
                "\nQuantidade de bibliotecas = " + this.getQtdBibliotecas() +
                "\nQuantidade de funções = " + this.getQtdFuncoes();
        return string.toUpperCase();
    }
}
