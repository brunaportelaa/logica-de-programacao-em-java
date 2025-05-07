public class TerroristaSuicida extends Terrorista {

    private Religiao religiao;

    public TerroristaSuicida(String nome, int qtdExplosivos) {
        super(nome, qtdExplosivos);
    }

    public Religiao getReligiao() {
        return religiao;
    }

    public void setReligiao(Religiao religiao) {
        this.religiao = religiao;
    }

    public void setReligiao(int valorReligiao) {
        this.religiao = Religiao.getReligiaoByValor(valorReligiao);
    }

    public int getGrauPericulosidade() {
        int grauPericulosidade;
        grauPericulosidade = 2 * this.getQtdExplosivos();
        if (religiao == Religiao.ISLAMICO) {
            grauPericulosidade *= 5;
        } else {
            grauPericulosidade *= 2;
        }
        return grauPericulosidade;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nSuicida? Sim" +
                "\nReligião: " + this.getReligiao().name() +
                "\nGrau de periculosidade: " + this.getGrauPericulosidade();
    }
}
