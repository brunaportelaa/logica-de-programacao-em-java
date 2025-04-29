import java.util.ArrayList;

public class SistemaCompeticao {
    private ArrayList<Competidor> competidores;
    public SistemaCompeticao() {
        this.competidores = new ArrayList<>();
    }

    public ArrayList<Competidor> getCompetidores() {
        return competidores;
    }

    public void setCompetidores(ArrayList<Competidor> competidores) {
        this.competidores = competidores;
    }

    public boolean adicionar(Competidor novoCompetidor) {
        if (!this.getCompetidores().isEmpty()) {
            for (Competidor competidor : this.getCompetidores()) {
                if (novoCompetidor.equals(competidor)) {
                    return false;
                }
            }
        }
        ArrayList<Competidor> competidores = this.getCompetidores();
        competidores.add(novoCompetidor);
        setCompetidores(competidores);
        return true;
    }

    public ArrayList<Competidor> sortByCusto() {
        ArrayList<Competidor> competidoresOrdenados = this.getCompetidores();
        competidoresOrdenados.sort((c1, c2) -> (Double.compare(c1.getPagamento(), c2.getPagamento())));
        return competidoresOrdenados;
    }

    public double getTotalCusto() {
        double custo = 0.0;
        for (Competidor competidor : this.getCompetidores()) {
            custo += competidor.getPagamento();
        }
        return custo;
    }

    public ArrayList<Competidor> filterBySexo(int sexo) {
        ArrayList<Competidor> competidoresFiltrados = new ArrayList<>();
        for (Competidor competidor : this.getCompetidores()) {
            if (competidor.getSexo() == sexo) {
                competidoresFiltrados.add(competidor);
            }
        }
        return competidoresFiltrados;
    }
}
