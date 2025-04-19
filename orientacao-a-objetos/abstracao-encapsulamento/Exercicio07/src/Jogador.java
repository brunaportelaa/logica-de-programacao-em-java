import java.security.PublicKey;

public class Jogador {
    private final int LIMITE_FRACO = 15;
    private final int LIMITE_BOM = 31;
    private final int MAIORIDADE = 18;
    private String nome;
    private int idade;
    private int qtdGols;
    private String pais;

    public Jogador(int qtdGols) {
        this.qtdGols = qtdGols;
    }

    public Jogador(String nome, int idade, int qtdGols, String pais) {
        setNome(nome);
        setIdade(idade);
        setQtdGols(qtdGols);
        setPais(pais);
    }

    public String getNome(){
        return this.nome;
    }

    public String getPrimeiroNome() {
        String[] nome = this.getNome().split(" ");
        return nome[0];
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade(){
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getQtdGols(){
        return this.qtdGols;
    }

    public void setQtdGols(int qtdGols) {
        this.qtdGols = qtdGols;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getPais(){
        return this.pais;
    }

    /**
     * entrada: qtdGols
     * @return
     * 3 para fraco (<15 gols), 2 para mediano (15<x<31 gols), 1 para bom (>31 gols)
     */
    public int getQualificacao() {
        int qualificacao;
        if (this.qtdGols < LIMITE_FRACO) {
            qualificacao = 3;
        } else {
            if (this.qtdGols >= LIMITE_FRACO && this.qtdGols <= LIMITE_BOM) {
                qualificacao = 2;
            } else {
                qualificacao = 1;
            }
        }
        return qualificacao;
    }

    public String getQualificacaoDescricao(int qualificacao) {
        if (this.getQualificacao() == 3) {
            return "FRACO";
        } else {
            if (this.getQualificacao() == 2) {
                return "MEDIANO";
            } else {
                return "BOM";
            }
        }
    }

    public double getSalario() {
        if (this.getQualificacao() == 3) {
            return 500.00;
        } else {
            if (this.getQualificacao() == 2) {
                return 5000.00;
            } else {
                if (this.getQualificacao() == 1) {
                    return 10000.00;
                } else {
                    return 0;
                }
            }
        }
    }

    public boolean isMaiorDeIdade() {
        if (this.idade >= MAIORIDADE) {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        String string = "Nome: " + this.getPrimeiroNome() +
                "\nIdade: " + this.getIdade() +
                "\nQuantidade de gols: " + this.getQtdGols() +
                "\nPaís: " + this.getPais() +
                "\nQualificação: " + this.getQualificacaoDescricao(getQualificacao()) + "\n";
        return string.toUpperCase();
    }
}
