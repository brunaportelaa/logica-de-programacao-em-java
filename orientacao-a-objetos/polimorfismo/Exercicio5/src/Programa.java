public abstract class Programa {

    private String nome;
    private int qtdLinhas;

    public Programa(String nome, int qtdLinhas) {
        setNome(nome);
        setQtdLinhas(qtdLinhas);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdLinhas() {
        return qtdLinhas;
    }

    public void setQtdLinhas(int qtdLinhas) {
        this.qtdLinhas = qtdLinhas;
    }

    public int getTempoCompilacao(){
        int tempoCompilacao = 1;
        tempoCompilacao += this.getTempoCompilacao(this.getNome());
        tempoCompilacao += this.getTempoCompilacao(this.getQtdLinhas());
        return tempoCompilacao;
    }

    public int getTempoCompilacao(String nome) {
        int tempoCompilacao = 1;
        if (nome.length() > 100) {
            tempoCompilacao++;
        }
        return tempoCompilacao;
    }

    public int getTempoCompilacao(int qtdLinhas) {
        int tempoCompilacao = 0;
        if (this.getQtdLinhas() < 1000) {
            tempoCompilacao++;
        } else if (this.getQtdLinhas() >= 1000 && this.getQtdLinhas()< 5000) {
            tempoCompilacao += 2;
        } else {
            tempoCompilacao += 3;
        }
        return tempoCompilacao;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Programa)) {
            return false;
        }
        Programa programa = (Programa) obj;
        return programa.getNome() == this.getNome();
    }

    @Override
    public String toString() {
        String string = "Nome = " + this.getNome() +
                "\nQuantidade de linhas = " + this.getQtdLinhas() +
                "\nTempo de compilação = " + this.getTempoCompilacao() + "s";
        return string.toUpperCase();
    }
}
