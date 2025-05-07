public class TerroristaNaoSuicida extends Terrorista{

    private Pais pais;

    public TerroristaNaoSuicida(String nome, int qtdExplosivos) {
        super(nome, qtdExplosivos);
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public void setPais(int valorPais) {
        this.pais = Pais.getPaisByValor(valorPais);
    }



    public int getGrauPericulosidade() {
        int grauPericulosidade;
        grauPericulosidade = 2 * this.getQtdExplosivos();
        if (pais == Pais.ARABIA_SAUDITA) {
            grauPericulosidade *= 7;
        } else {
            grauPericulosidade *= 5;
        }
        return grauPericulosidade;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nSuicida? Não" +
                "\nPaís: " + this.getPais().name() +
                "\nGrau de periculosidade: " + this.getGrauPericulosidade();
    }
}
