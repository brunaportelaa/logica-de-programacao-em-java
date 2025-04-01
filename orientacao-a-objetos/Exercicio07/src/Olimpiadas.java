public class Olimpiadas {
    private Jogador[] jogadores;

    public Olimpiadas() {
        this.jogadores = new Jogador[0];
    }

    public double getCustoTotal() {
        double custoTotal = 0;
        for (Jogador jogador : this.jogadores) {
            custoTotal += jogador.getSalario();
        }
        return custoTotal;
    }

    public Jogador[] getJogadoresMaioresDeIdade(int qtdJogadoresMaioresDeIdade) {
        Jogador[] jogadoresMaioresDeIdade = new Jogador[qtdJogadoresMaioresDeIdade];
        int i = 0;
        for (Jogador jogador : this.jogadores) {
            if (jogador.isMaiorDeIdade()) {
                jogadoresMaioresDeIdade[i] = jogador;
                i++;
            }
        }
        return jogadoresMaioresDeIdade;
    }

    public int countJogadoresMaioresDeIdade() {
        int qtdJogadoresMaioresDeIdade = 0;
        for (Jogador jogador : this.jogadores) {
            if (jogador.isMaiorDeIdade()) {
                qtdJogadoresMaioresDeIdade ++;
            }
        }
        return qtdJogadoresMaioresDeIdade;
    }

    public Jogador getMelhorJogador() {
        Jogador melhorJogador = this.jogadores[0];
        for (Jogador jogador : this.jogadores) {
            if (jogador.getQtdGols() > melhorJogador.getQtdGols()) {
                melhorJogador = jogador;
            }
        }
        return melhorJogador;
    }


}
