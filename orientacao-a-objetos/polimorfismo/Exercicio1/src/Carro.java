public class Carro {
    private String modelo;
    private String marca;
    private String placa;
    private int cavalos;

    public Carro(String placa) {
        setPlaca(placa);
    }

    public Carro(String modelo, String marca, String placa, int cavalos) {
        setModelo(modelo);
        setMarca(marca);
        setPlaca(placa);
        setCavalos(cavalos);
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getCavalos() {
        return cavalos;
    }

    public void setCavalos(int cavalos) {
        this.cavalos = cavalos;
    }

    @Override
    public boolean equals(Object obj) {
        Carro novoCarro = (Carro) obj;
        if (novoCarro.getPlaca().equals(this.getPlaca())) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Modelo: " + this.getModelo() +
                "\nMarca: " + this.getMarca() +
                "\nPlaca: " + this.getPlaca() +
                "\nQtd. Cavalos: " + this.getCavalos();
    }
}
