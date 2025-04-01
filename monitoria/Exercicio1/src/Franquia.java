public class Franquia {
//    quantidade de GB, dia de expiração da franquia, preço da franquia e nome da empresa

    private int qtdGB;
    private int diaExpiracao;
    private double preco;
    private String empresa;


    public Franquia() {
    }

    public int getQtdGB() {
        return qtdGB;
    }

    public void setQtdGB(int qtdGB) {
        this.qtdGB = qtdGB;
    }

    public int getDiaExpiracao() {
        return diaExpiracao;
    }

    public void setDiaExpiracao(int diaExpiracao) {
        this.diaExpiracao = diaExpiracao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String toString(){
        String franquia =
                "Quantidade de GB: " + this.getQtdGB() +
                        "\nData de expiração: " + this.getDiaExpiracao() +
                        "\nPreço: " + this.getPreco() +
                        "\nNome da empresa: " + this.getEmpresa();
        return franquia;
    }
}
