public class Documento {
    private String nome;
    private int extensao;
    private int tamanho;

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getExtensao(){
        return this.extensao;
    }


    public String getExtensaoDescricao(int extensao){
        switch (extensao) {
            case 1:
                return ".png";
            case 2:
                return ".pdf";
            case 3:
                return ".jpeg";
            case 4:
                return ".jpg";
            default:
                return "Formato inválido.";
        }
    }

    public void setExtensao(int extensao) {
        this.extensao = extensao;
    }

    public int getTamanho(){
        return this.tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public String toString() {
        return "\nNome: " + this.nome +
                "\nExtensão: " + this.getExtensaoDescricao(this.extensao) +
                "\nTamanho: " + this.tamanho + "\n";
    }
}
