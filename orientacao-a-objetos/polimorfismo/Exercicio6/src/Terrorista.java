public abstract class Terrorista {
    private String nome;
    private int qtdExplosivos;

    public Terrorista() {

    }

    public Terrorista(String nome, int qtdExplosivos) {
        this.nome = nome;
        this.qtdExplosivos = qtdExplosivos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdExplosivos() {
        return qtdExplosivos;
    }

    public void setQtdExplosivos(int qtdExplosivos) {
        this.qtdExplosivos = qtdExplosivos;
    }

    public abstract int getGrauPericulosidade();


    @Override
    public String toString() {
        return "Terrorista" +
                "\nNome: " + this.getNome() +
                "\nQuantidade de explosivos" + this.getQtdExplosivos();
    }
}
