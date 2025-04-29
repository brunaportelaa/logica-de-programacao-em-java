import java.util.ArrayList;

public class Congresso {

    private CamaraDeputados camaraDeputados = new CamaraDeputados();
    private Senado senado = new Senado();

    public CamaraDeputados getCamaraDeputados() {
        return camaraDeputados;
    }

    public void setCamaraDeputados(CamaraDeputados camaraDeputados) {
        this.camaraDeputados = camaraDeputados;
    }

    public Senado getSenado() {
        return senado;
    }

    public void setSenado(Senado senado) {
        this.senado = senado;
    }


    public ArrayList<Legislador> getAllLegisladores() {
        ArrayList<Legislador> legisladores = new ArrayList<>();
        legisladores.addAll(camaraDeputados.getDeputados());
        legisladores.addAll(senado.getSenadores());
        return legisladores;
    }


    public ArrayList<Legislador> filterLegisladoresByPartidoSigla(String sigla) {
        ArrayList<Legislador> legisladoresFiltrados = new ArrayList<>();
        for (Legislador legislador : this.getAllLegisladores()) {
            if (legislador.getPartido().getSigla().equalsIgnoreCase(sigla)) {
                legisladoresFiltrados.add(legislador);
            }
        }
        return legisladoresFiltrados;
    }

    public ArrayList<Legislador> filterLegisladoresByPartidoCodigo(int codigo) {
        ArrayList<Legislador> legisladoresFiltrados = new ArrayList<>();
        for (Legislador legislador : this.getAllLegisladores()) {
            if (legislador.getPartido().getCodigo() == codigo) {
                legisladoresFiltrados.add(legislador);
            }
        }
        return legisladoresFiltrados;
    }

    public ArrayList<Legislador> filterLegisladoresByEstadoSigla(String sigla) {
        ArrayList<Legislador> legisladoresFiltrados = new ArrayList<>();
        for (Legislador legislador : this.getAllLegisladores()) {
            if (legislador.getEstado().getSigla().equalsIgnoreCase(sigla)) {
                legisladoresFiltrados.add(legislador);
            }
        }
        return legisladoresFiltrados;
    }

    public int countByIdeologia(int ideologia){
        int counter = 0;
        for (Legislador legislador : this.getAllLegisladores()) {
            if (legislador.getPartido().getIdeologia() == ideologia) {
                counter ++;
            }
        }
        return counter;
    }

}
