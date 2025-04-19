import java.util.ArrayList;

public class Senado {

    private ArrayList<Legislador> senadores = new ArrayList<>();

    public ArrayList<Legislador> getSenadores() {
        return senadores;
    }

    public void setSenadores(ArrayList<Legislador> senadores) {
        this.senadores = senadores;
    }

    public ArrayList<Legislador> filterSenadoresByPartidoSigla(String sigla) {
        ArrayList<Legislador> legisladoresFiltrados = new ArrayList<>();
        for (Legislador legislador : this.getSenadores()) {
            if (legislador.getPartido().getSigla().equalsIgnoreCase(sigla)) {
                legisladoresFiltrados.add(legislador);

            }
        }
        return legisladoresFiltrados;
    }

    public ArrayList<Legislador> filterSenadoresByPartidoCodigo(int codigo) {
        ArrayList<Legislador> legisladoresFiltrados = new ArrayList<>();
        for (Legislador legislador : this.getSenadores()) {
            if (legislador.getPartido().getCodigo() == codigo) {
                legisladoresFiltrados.add(legislador);
            }
        }
        return legisladoresFiltrados;
    }
}
