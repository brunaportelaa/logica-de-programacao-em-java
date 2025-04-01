public class Atleta {

    //Tempo em minutos para maior precisão
    final int TEMPO_MAX_PROVA_ELITE = 300;

    private long numInscricao;
    private String nome;
    private double tempoProva;
    private int idade;

    public Atleta (long numInscricao, String nome) {
        this.numInscricao = numInscricao;
        this.nome = nome;
    }

    public long getNumInscricao() {
        return numInscricao;
    }

    public void setNumInscricao(long numInscricao) {
        this.numInscricao = numInscricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getTempoProva() {
        return tempoProva;
    }

    public void setTempoProva(double tempoProva) {
        this.tempoProva = tempoProva;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean isElite() {
        return this.tempoProva < TEMPO_MAX_PROVA_ELITE;
    }

    public String toString() {
        return "N. Inscrição: " + this.numInscricao +
                "\nNome: " + this.nome +
                "\nIdade: " + this.idade +
                "\nTempo de prova: " + this.tempoProva +
                "\nElite: " + (this.isElite() ? "Sim" : "Não") + "\n";
    }
}
