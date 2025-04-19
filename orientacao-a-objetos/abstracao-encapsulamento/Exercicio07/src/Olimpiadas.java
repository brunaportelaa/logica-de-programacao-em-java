import java.util.ArrayList;

public class Olimpiadas {
    private ArrayList<Jogador> jogadores;

    public Olimpiadas() {
        this.jogadores = new ArrayList<Jogador>();
    }

    public ArrayList<Jogador> getJogadores() {
        return this.jogadores;
    }

    public void setJogadores(ArrayList<Jogador> jogadores) {
        this.jogadores = jogadores;
    }

    public ArrayList<Jogador> filterJogadoresByQualificacao(int qualificacao) {
        ArrayList<Jogador> jogadoresSelecionados = new ArrayList<>();
        for (Jogador jogador : this.jogadores) {
            if (jogador.getQualificacao() == qualificacao) {
                jogadoresSelecionados.add(jogador);
            }
        }
        return jogadoresSelecionados;
    }


    public double getCustoTotal() {
        double custoTotal = 0;
        for (Jogador jogador : this.jogadores) {
            custoTotal += jogador.getSalario();
        }
        return custoTotal;
    }

    public ArrayList<Jogador> getJogadoresMaioresDeIdade() {
        ArrayList<Jogador> jogadoresMaioresDeIdade = new ArrayList<Jogador>();
        for (Jogador jogador : this.jogadores) {
            if (jogador.isMaiorDeIdade()) {
                jogadoresMaioresDeIdade.add(jogador);
            }
        }
        return jogadoresMaioresDeIdade;
    }

    public Jogador getMelhorJogador() {
        Jogador melhorJogador = this.jogadores.getFirst();
        for (Jogador jogador : this.jogadores) {
            if (jogador.getQtdGols() > melhorJogador.getQtdGols()) {
                melhorJogador = jogador;
            }
        }
        return melhorJogador;
    }

    public double calcularMedia() {
        double soma = 0;
        for (Jogador jogador : this.jogadores) {
            soma += (double) jogador.getQtdGols();
        }
        return soma / this.jogadores.size();
    }

    public double calcularMedia(ArrayList<Jogador> jogadores) {
        double soma = 0;
        for (Jogador jogador : jogadores) {
            soma += (double) jogador.getQtdGols();
        }
        return soma / jogadores.size();
    }

}
