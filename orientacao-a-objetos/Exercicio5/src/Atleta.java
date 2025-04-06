public class Atleta {

    //Tempo em minutos para maior precisão
    final int TEMPO_MAX_PROVA_ELITE = 300;
    final static int MIN_LENGTH_NOME = 3;
    final static int MAX_LENGTH_NOME = 50;

    private long numInscricao;
    private String nome;
    private double tempoProva;
    private int idade;

    public Atleta (long numInscricao, String nome) {
        this.setNumInscricao(numInscricao);
        this.setNome(nome);
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

    public static boolean validarNome(String nome) {
        if (nome.length() < MIN_LENGTH_NOME || nome.length() > MAX_LENGTH_NOME) {
            return false;
        }
        return true;
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
        return "N. Inscrição: " + this.getNumInscricao() +
                "\nNome: " + this.getNome() +
                "\nIdade: " + this.getIdade() +
                "\nTempo de prova: " + this.getTempoProva() +
                "\nElite: " + (this.isElite() ? "Sim" : "Não") + "\n";
    }
}
