public class Placa {
    final double PRECO_INICIAL = 20.0;
    String codigo;
    int pinos;
    int entradasAnalogicas;
    boolean produzSinalMLP;

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

    public String toString() {
        String string =
                "Código: " + this.codigo +
                "\nQuantidade de pinos digitais: " + this.pinos +
                "\nQuantidade de entradas analógicas: " + this.entradasAnalogicas +
                "\nProduz sinal MLP? " + (this.produzSinalMLP ? "Sim" : "Não") + "\n";
        return string;
    }
}
