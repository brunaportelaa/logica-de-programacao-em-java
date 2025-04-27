import java.util.ArrayList;

public class Carros {
    private ArrayList<Carro> carros;

    public Carros() {
        setCarros(new ArrayList<>());
    }

    public ArrayList<Carro> getCarros() {
        return carros;
    }

    public void setCarros(ArrayList<Carro> carros) {
        this.carros = carros;
    }

    public boolean adicionar(Carro novoCarro) {
        ArrayList<Carro> listaCarros = this.getCarros();
        if (!this.getCarros().isEmpty()) {
            for (Carro carro : listaCarros) {
                if (novoCarro.equals(carro)) {
                    return false;
                }
            }
        }
        listaCarros.add(novoCarro);
        setCarros(listaCarros);
        return true;
    }

    public ArrayList<Carro> filterByMarca(String marca) {
        ArrayList<Carro> carrosSelecionados = new ArrayList<>();
        for (Carro carro : this.getCarros()) {
            if (carro.getMarca().equalsIgnoreCase(marca)) {
                carrosSelecionados.add(carro);
            }
        }
        return carrosSelecionados;
    }

    public ArrayList<Carro> filterByMinimoCavalos(int cavalos) {
        ArrayList<Carro> carrosSelecionados = new ArrayList<>();
        for (Carro carro : this.getCarros()) {
            if (carro.getCavalos() >= cavalos) {
                carrosSelecionados.add(carro);
            }
        }
        return carrosSelecionados;
    }

    public int searchPlacaByPrimeirasLetras(String inicioPlaca) {
        int counter = 0;
        for (Carro carro : this.getCarros()){
            if (carro.getPlaca().startsWith(inicioPlaca)){
                counter++;
            }
        }
        return counter;
    }

}
