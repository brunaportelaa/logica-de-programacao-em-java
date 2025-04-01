import java.util.Arrays;

public class Armazenamento {
    private Pasta[] pastas;

    public Armazenamento() {
        this.pastas = new Pasta[0];
    }

    public Pasta[] getPastas(){
        return this.pastas;
    }

    public void adicionar(Pasta pasta) {
        Pasta[] novasPastas = Arrays.copyOf(this.pastas, this.pastas.length + 1);
        novasPastas[novasPastas.length - 1] = pasta;
        this.pastas = novasPastas;
    }

    public int countPastasByAno(int ano) {
        int total = 0;
        for (Pasta pasta : this.pastas) {
            if (pasta.getAno() == ano) {
                total++;
            }
        }
        return total;
    }

    public Pasta[] sortPastasByAno(int ano) {
        int totalPastas = countPastasByAno(ano);
        Pasta[] pastasSelecionadas = new Pasta[totalPastas];
        int i = 0;
        for (Pasta pasta : this.pastas) {
            if (pasta.getAno() == ano) {
                pastasSelecionadas[i] = pasta;
                i++;
            }
        }
        return pastasSelecionadas;
    }

    public int getTotalBytes() {
        int totalBytes = 0;
        for (Pasta pasta : this.pastas) {
            totalBytes += pasta.getTotalBytes();
        }
        return totalBytes;
    }

    public Documento[] sortDocsByExtensao(int extensao) {
        int totalDocs = countDocsByExtensao(extensao);
        Documento[] docsSelecionados = new Documento[totalDocs];
        int i = 0;
        for (Pasta pasta : this.pastas) {
            for (Documento documento : pasta.sortDocsByExtensao(extensao)) {
                docsSelecionados[i] = documento;
                i++;
            }
        }
        return docsSelecionados;
    }

    public int countDocsByExtensao(int extensao) {
        int totalDocs = 0;
        for (Pasta pasta : this.pastas) {
            totalDocs += pasta.countDocsByExtensao(extensao);
        }
        return totalDocs;
    }


}
