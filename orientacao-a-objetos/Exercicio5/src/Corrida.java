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
        System.out.println("Validando número de inscrição");
        for (Atleta atleta : this.getAtletas()) {
            if (numInscricao == atleta.getNumInscricao()) {
                System.out.println("Número inválido");
                return false;
            }
        }
        System.out.println("Número válido");
        return true;
    }

    public Atleta[] sortAtletaByElite(int isElite) {
        Atleta[] atletasSelecionados = new Atleta[countAtletaByElite(isElite)];
        int i = 0;
        for (Atleta atleta : this.atletas) {
            if (isElite == 1 && atleta.isElite()) {
                atletasSelecionados[i] = atleta;
                i++;
            } else {
                if (isElite == 2 && !atleta.isElite()) {
                    atletasSelecionados[i] = atleta;
                    i++;
                }
            }
        }
        return atletasSelecionados;
    }

    public int countAtletaByElite(int isElite) {
        int counter = 0;
        for (Atleta atleta : atletas) {
            if (isElite == 1 && atleta.isElite()) {
                counter++;
            } else {
                if (isElite == 0 && !atleta.isElite()) {
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

    public double getMedia() {
        double soma = 0;
        for (Atleta atleta : this.atletas) {
            soma += atleta.getTempoProva();
        }
        return soma / this.atletas.length;
    }

}
