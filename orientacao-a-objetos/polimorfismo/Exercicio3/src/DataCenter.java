import java.util.ArrayList;

public class DataCenter {
    ArrayList<Sistema> sistemas;

    public DataCenter() {
        this.sistemas = new ArrayList<>();
    }

    public ArrayList<Sistema> getSistemas() {
        return sistemas;
    }

    public void setSistemas(ArrayList<Sistema> sistemas) {
        this.sistemas = sistemas;
    }

    public ArrayList<Sistema> sortByNumFuncionarios(){
        ArrayList<Sistema> sistemasRankeados = this.getSistemas();
        sistemasRankeados.sort((s1, s2) -> Integer.compare(s1.getTotalFuncionarios(),s2.getTotalFuncionarios()));
        return sistemasRankeados;
    }

    public Sistema getSistemaMaisFuncionarios() {
        return this.sortByNumFuncionarios().getLast();
    }

    public ArrayList<Sistema> searchByFuncionarioNome(String termoPesquisa) {
        ArrayList<Sistema> sistemasSelecionados = new ArrayList<>();
        for (Sistema sistema : this.getSistemas()) {
            if (sistema.getFuncionarioResponsavel().getNome().contains(termoPesquisa)) {
                sistemasSelecionados.add(sistema);
            }
        }
        return sistemasSelecionados;
    }
}
