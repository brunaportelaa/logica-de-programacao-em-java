import java.util.ArrayList;

public class CamaraDeputados{
    private ArrayList<Legislador> legisladores = new ArrayList<>();

    public void setDeputados(ArrayList<Legislador> deputados) {
        this.legisladores = deputados;
    }

    public ArrayList<Legislador> getDeputados() {
        return this.legisladores;
    }

    public ArrayList<Legislador> filterDeputadosByPartidoSigla(String sigla) {
        ArrayList<Legislador> legisladoresFiltrados = new ArrayList<>();
        for (Legislador legislador : this.getDeputados()) {
            if (legislador.getPartido().getSigla().equalsIgnoreCase(sigla)) {
                legisladoresFiltrados.add(legislador);

            }
        }
        return legisladoresFiltrados;
    }

    public ArrayList<Legislador> filterDeputadosByPartidoCodigo(int codigo) {
        ArrayList<Legislador> legisladoresFiltrados = new ArrayList<>();
        for (Legislador legislador : this.getDeputados()) {
            if (legislador.getPartido().getCodigo() == codigo) {
                legisladoresFiltrados.add(legislador);
            }
        }
        return legisladoresFiltrados;
    }

    public int countDeputadosByIdeologia(int ideologia) {
        int counter = 0;
        for (Legislador legislador : this.getDeputados()) {
            if (legislador.getPartido().getIdeologia() == ideologia) {
                counter ++;
            }
        }
        return counter;
    }



}
