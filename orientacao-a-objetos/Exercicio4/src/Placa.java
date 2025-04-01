public class Placa {
    private final double PRECO_INICIAL = 20.0;
    private String codigo;
    private int pinos;
    private int entradasAnalogicas;
    private boolean produzSinalMLP;

    public Placa(String codigo) {
        this.codigo = codigo;
    }

    public double getPreco() {
        double precoFinal = PRECO_INICIAL;
        if (produzSinalMLP) {
            precoFinal += (pinos * 0.5);
        }
        if (entradasAnalogicas > 3) {
            precoFinal *= 3;
        }
        return precoFinal;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getPinos() {
        return pinos;
    }

    public void setPinos(int pinos) {
        this.pinos = pinos;
    }

    public int getEntradasAnalogicas() {
        return entradasAnalogicas;
    }

    public void setEntradasAnalogicas(int entradasAnalogicas) {
        this.entradasAnalogicas = entradasAnalogicas;
    }

    public boolean isProduzSinalMLP() {
        return produzSinalMLP;
    }

    public void setProduzSinalMLP(boolean produzSinalMLP) {
        this.produzSinalMLP = produzSinalMLP;
    }

    public String toString() {
        String string =
                "Código: " + this.getCodigo() +
                "\nQuantidade de pinos digitais: " + this.getPinos() +
                "\nQuantidade de entradas analógicas: " + this.getEntradasAnalogicas() +
                "\nProduz sinal MLP? " + (this.isProduzSinalMLP() ? "Sim" : "Não") + "\n";
        return string;
    }
}
