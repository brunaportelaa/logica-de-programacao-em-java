import java.util.ArrayList;
import java.util.Arrays;

public class Armazenamento {
    private ArrayList<Pasta> pastas;

    public Armazenamento() {
        this.pastas = new ArrayList<Pasta>();
    }

    public ArrayList<Pasta> getPastas(){
        return this.pastas;
    }

    public void setPastas(ArrayList<Pasta> pastas){
        this.pastas = pastas;
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

    public ArrayList<Pasta> sortPastasByAno(int ano) {
        int totalPastas = countPastasByAno(ano);
        ArrayList<Pasta> pastasSelecionadas = new ArrayList<Pasta>();
        int i = 0;
        for (Pasta pasta : this.pastas) {
            if (pasta.getAno() == ano) {
                pastasSelecionadas.add(pasta);
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
