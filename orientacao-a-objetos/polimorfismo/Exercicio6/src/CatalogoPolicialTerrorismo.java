import java.util.ArrayList;

public class CatalogoPolicialTerrorismo {
    ArrayList<Terrorista> listaTerroristas;

    public CatalogoPolicialTerrorismo() {
        this.listaTerroristas = new ArrayList<>();
    }

    public ArrayList<Terrorista> getListaTerroristas() {
        return listaTerroristas;
    }

    public void setListaTerroristas(ArrayList<Terrorista> listaTerroristas) {
        this.listaTerroristas = listaTerroristas;
    }

    public ArrayList<Terrorista> filterByPericulosidade(int minGrauPericulosidade){
        ArrayList<Terrorista> selecionados = new ArrayList<>();

        for (Terrorista terrorista : this.getListaTerroristas()){
            if (terrorista.getGrauPericulosidade() >= minGrauPericulosidade) {
                selecionados.add(terrorista);
            }
        }
        return selecionados;
    }

    public ArrayList<Terrorista> searchByName(String termoPesquisa) {
        ArrayList<Terrorista> selecionados = new ArrayList<>();

        for (Terrorista terrorista : this.getListaTerroristas()){
            if (terrorista.getNome().contains(termoPesquisa)) {
                selecionados.add(terrorista);
            }
        }
        return selecionados;
    }

    public ArrayList<Terrorista> filterByQtdExplosivos (int minQtdExplosivos) {
        ArrayList<Terrorista> selecionados = new ArrayList<>();

        for (Terrorista terrorista : this.getListaTerroristas()){
            if (terrorista.getQtdExplosivos() > minQtdExplosivos) {
                selecionados.add(terrorista);
            }
        }
        return selecionados;
    }

    public ArrayList filtrarTerroristaPorSuicida(boolean isSuicida) {
            if (isSuicida) {
                ArrayList<TerroristaSuicida> selecionados = new ArrayList<>();
                for (Terrorista terrorista : this.getListaTerroristas()){
                    if (terrorista instanceof TerroristaSuicida){
                        selecionados.add((TerroristaSuicida) terrorista);
                    }
                }
                return selecionados;
            } else {
                ArrayList<TerroristaNaoSuicida> selecionados = new ArrayList<>();
                for (Terrorista terrorista : this.getListaTerroristas()){
                    if (terrorista instanceof TerroristaNaoSuicida){
                        selecionados.add((TerroristaNaoSuicida) terrorista);
                    }
                }
                return selecionados;
            }
    }

    public ArrayList<TerroristaNaoSuicida> filtrarNaoDoPais(Pais pais) {
        ArrayList<TerroristaNaoSuicida> naoSuicidas = this.filtrarTerroristaPorSuicida(false);
        ArrayList<TerroristaNaoSuicida> selecionados = new ArrayList<>();
        for (TerroristaNaoSuicida terrorista : naoSuicidas){
            if (terrorista.getPais() != pais) {
                selecionados.add(terrorista);
            }
        }
        return selecionados;
    }

    public ArrayList<TerroristaNaoSuicida> filtrarPorPais(Pais pais) {
        ArrayList<TerroristaNaoSuicida> selecionados = this.filtrarTerroristaPorSuicida(false);
        for (TerroristaNaoSuicida terrorista : selecionados){
            if (terrorista.getPais() == pais) {
                selecionados.add(terrorista);
            }
        }
        return selecionados;
    }

}
