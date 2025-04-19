import java.util.ArrayList;
import java.util.Arrays;

public class Corrida {
    private Atleta[] atletas;

    public Corrida() {
        this.atletas = new Atleta[0];
    }

    public Atleta[] getAtletas() {
        return atletas;
    }

    public void setAtletas(Atleta[] atletas) {
        this.atletas = atletas;
    }

    public void adicionar(Atleta atleta) {
        Atleta[] novosAtletas = Arrays.copyOf(this.getAtletas(), this.atletas.length + 1);
        novosAtletas[novosAtletas.length  - 1] = atleta;
        this.setAtletas(novosAtletas);
    }

    public boolean validarNumInscricao(long numInscricao) {
        for (Atleta atleta : this.getAtletas()) {
            if (numInscricao == atleta.getNumInscricao()) {
                return false;
            }
        }
        return true;
    }

    public Atleta[] filterAtletaByElite(int isElite) {
        Atleta[] atletasSelecionados = new Atleta[countAtletaByElite(isElite)];
        int i = 0;
        if (isElite == 1) {
            for (Atleta atleta : this.atletas) {
                if (atleta.isElite()) {
                    atletasSelecionados[i++] = atleta;
                    i++;
                }
            }
        } else {
            for (Atleta atleta : this.atletas) {
                if (!atleta.isElite()) {
                    atletasSelecionados[i++] = atleta;
                }
            }
        }
        return atletasSelecionados;
}

    public int countAtletaByElite(int isElite) {
        int counter = 0;
        if (isElite == 0 ){
            for (Atleta atleta : atletas) {
                if (!atleta.isElite()) {
                    counter++;
                }
            }
        } else {
            for (Atleta atleta : atletas) {
                if (atleta.isElite()) {
                    counter++;
                }
            }
        }
        return counter;
    }

    public Atleta getMelhorAtleta() {
        Atleta melhorAtleta = this.atletas[0];
        for (Atleta atleta : this.atletas) {
            if (atleta.getTempoProva()< melhorAtleta.getTempoProva()) {
                melhorAtleta = atleta;
            }
        }
        return melhorAtleta;
    }

    public ArrayList<Atleta> getAtletaByIdade(int idadeMinima, int idadeMaxima) {
        ArrayList<Atleta> atletasSelecionados = new ArrayList<>();
        for (Atleta atleta : getAtletas()) {
            if (atleta.getIdade() >= idadeMinima && atleta.getIdade() <= idadeMaxima){
                atletasSelecionados.add(atleta);
            }
        }
        return atletasSelecionados;
    }

    public double getMedia() {
        double soma = 0;
        for (Atleta atleta : this.atletas) {
            soma += atleta.getTempoProva();
        }
        return soma / this.atletas.length;
    }

}
