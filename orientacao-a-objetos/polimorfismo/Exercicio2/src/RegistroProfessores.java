import java.util.ArrayList;

public class RegistroProfessores {
    private ArrayList<Professor> professores;

    public RegistroProfessores() {
        setProfessores(new ArrayList<>());
    }

    public ArrayList<Professor> getProfessores() {
        return professores;
    }

    public void setProfessores(ArrayList<Professor> professores) {
        this.professores = professores;
    }

    public boolean adicionar(Professor novoProfessor) {
        if (!this.getProfessores().isEmpty()) {
            for (Professor professor : this.getProfessores()) {
                if (professor.equals(novoProfessor)) {
                    return false;
                }
            }
        }
        ArrayList<Professor> novaListaProfessores = this.getProfessores();
        novaListaProfessores.add(novoProfessor);
        this.setProfessores(novaListaProfessores);
        return true;
    }

    public ArrayList<Professor> searchByNome(String termoPesquisa) {
        ArrayList<Professor> professoresSelecionados = new ArrayList<>();
        for (Professor professor : this.getProfessores()) {
            if (professor.getNome().contains(termoPesquisa)) {
                professoresSelecionados.add(professor);
            }
        }
        return professoresSelecionados;
    }

    public ArrayList<Professor> filterByTitulacao(int codigoTitulacao) {
        Titulacao titulacao = Titulacao.getTitulacaoByCodigo(codigoTitulacao);
        ArrayList<Professor> professoresSelecionados = new ArrayList<>();
        for (Professor professor : this.getProfessores()) {
            if (professor.getTitulacao() == titulacao) {
                professoresSelecionados.add(professor);
            }
        }
        return professoresSelecionados;
    }

    public ArrayList<Professor> filterBySalarioMin(double salarioMinimo) {
        ArrayList<Professor> professoresSelecionados = new ArrayList<>();
        for (Professor professor : this.getProfessores()) {
            if (professor.getSalario() >= salarioMinimo) {
                professoresSelecionados.add(professor);
            }
        }
        return professoresSelecionados;
    }
}
