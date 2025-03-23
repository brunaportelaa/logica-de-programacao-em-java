import java.util.ArrayList;

public class UnidadeAdministrativa {
    int id;
    String nome;
    ArrayList<Acao> acoes;

    public void gerarId(){
        this.id = (int)Math.random() * 10000;
    }

    public ArrayList<Acao> getAcoes(){
        return this.acoes;
    }

    public void setAcoes(int qtdAcoes) {
        ArrayList<Acao> acoes = new ArrayList<Acao>();
        for (int i = 0; i < qtdAcoes; i++) {
            Acao acao = new Acao();
            acao.gerarId();
            View.lerAcao(acao);
            acoes.add(acao);
        }
        this.acoes = acoes;
    }

    public ArrayList<Acao> sortByAno(int ano){
        ArrayList<Acao> acoesSelecionadas = new ArrayList<Acao>();
        for (Acao acao : this.acoes) {
            if (acao.ano == ano) {
                acoesSelecionadas.add(acao);
            }
        }
        return acoesSelecionadas;
    }

    public ArrayList<Acao> sortByPrioridade(boolean prioridade){
        ArrayList<Acao> acoesSelecionadas = new ArrayList<Acao>();
        for (Acao acao : this.acoes) {
            if (acao.getPrioridade() == prioridade) {
                acoesSelecionadas.add(acao);
            }
        }
        return acoesSelecionadas;
    }

    public ArrayList<Acao> sortByTrimestre(){
        ArrayList<Acao> acoesSelecionadas = new ArrayList<Acao>();
        return acoesSelecionadas;
    }

    public String toString() {
        String string =
                "Nome: " + this.nome +
                "\nID: " + this.id;
        return string.toLowerCase();
    }
}
