import java.util.Arrays;

public class Pasta {
    private int ano;
    private Documento[] documentos;

    public Pasta(int ano) {
        setAno(ano);
        this.documentos = new Documento[0];
    }

    public int getAno(){
        return this.ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Documento[] getDocumentos() {
        return this.documentos;
    }

    public void adicionar(Documento documento) {
        Documento[] novosDocumentos = Arrays.copyOf(this.documentos, this.documentos.length + 1);
        novosDocumentos[novosDocumentos.length - 1] = documento;
        this.documentos = novosDocumentos;
    }

    public int getTotalBytes() {
        int totalArmazenamento = 0;
        for (Documento documento : this.documentos) {
            totalArmazenamento += documento.getTamanho();
        }
        return totalArmazenamento;
    }

    public Documento[] sortDocsByExtensao(int extensao) {
        int totalDocs = countDocsByExtensao(extensao);
        int i = 0;
        Documento[] docsSelecionados = new Documento[totalDocs];
        for (Documento documento : this.documentos) {
            if (documento.getExtensao() == extensao) {
                docsSelecionados[i] = documento;
                i++;
            }
        }
        return docsSelecionados;
    }

    public int countDocsByExtensao(int extensao) {
        int totalDocs = 0;
        for (Documento documento : this.documentos) {
            if (documento.getExtensao() == extensao) {
                totalDocs++;
            }
        }
        return totalDocs;
    }


    public String toString() {
        return "\nAno: " + this.ano;
    }
}
