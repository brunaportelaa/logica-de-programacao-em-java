import java.util.ArrayList;

public class RegistroProgramas {
    private ArrayList<Programa> programas;

    public RegistroProgramas() {
        programas = new ArrayList<>();
    }

    public boolean adicionar(Programa novoPrograma) {
        if (programas.isEmpty()) {
            this.programas.add(novoPrograma);
            return true;
        }

        for (Programa programa : this.getProgramas()) {
            if (novoPrograma.getNome().equalsIgnoreCase(programa.getNome())) {
                return false;
            }
        }

        ArrayList<Programa> programas = this.getProgramas();
        programas.add(novoPrograma);
        this.setProgramas(programas);
        return true;

    }

    public ArrayList<Programa> sortByTempoCompilacao() {
        ArrayList<Programa> programasOrdenados = this.getProgramas();
        programasOrdenados.sort((p1, p2) -> (Integer.compare(p2.getTempoCompilacao(), p1.getTempoCompilacao())));
        return programasOrdenados;
    }

    public Programa getProgramaMaiorTempoCompilacao() {
        Programa programaMaiorTempoCompilacao = this.getProgramas().getFirst();
        for (Programa programa : this.getProgramas()) {
            if (programa.getTempoCompilacao() > programaMaiorTempoCompilacao.getTempoCompilacao()) {
                programaMaiorTempoCompilacao = programa;
            }
        }
        return programaMaiorTempoCompilacao;
    }

    public ArrayList<Programa> filterByQtdLinhas(int minLinhas, int maxLinhas){
        ArrayList<Programa> programasFiltrados = new ArrayList<>();
        for (Programa programa : this.getProgramas()) {
            if (programa.getQtdLinhas() >= minLinhas && programa.getQtdLinhas() <= maxLinhas) {
                programasFiltrados.add(programa);
            }
        }
        return programasFiltrados;
    }

    public ArrayList searchByNome(String termoPesquisa) {
        ArrayList<Programa> programasFiltrados = new ArrayList<>();
        for (Programa programa : this.getProgramas()) {
            if (programa.getNome().contains(termoPesquisa)) {
                programasFiltrados.add(programa);
            }
        }
        return programasFiltrados;
    }

    public ArrayList<Programa> getProgramas() {
        return programas;
    }

    public void setProgramas(ArrayList<Programa> programas) {
        this.programas = programas;
    }
}
