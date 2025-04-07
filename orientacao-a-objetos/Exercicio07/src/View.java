import java.util.ArrayList;

public class View {
    public static Jogador cadastrarJogador() {
        System.out.println("---CADASTRO DO JOGADOR:---");
        String nome = Leitor.lerString("Nome:");
        int idade = Leitor.lerInt("Idade:", 1, 100);
        int qtdGols = Leitor.lerInt("Quantidade de gols", 1, 100);
        String pais = Leitor.lerString("País");
        Jogador jogador = new Jogador(nome, idade, qtdGols, pais);
        return jogador;
    }

    public static Olimpiadas cadastrarOlimpiadas() {
        Olimpiadas olimpiadas = new Olimpiadas();
        ArrayList<Jogador> jogadores = new ArrayList<>();
        boolean continuar = true;
        while (continuar) {
            jogadores.add(cadastrarJogador());
            int opcao = Leitor.lerInt("Gostaria de continuar adicionando jogadores?\n[1] - SIM\n[2] - NÃO", 1, 2);
            if (opcao == 2) {
                continuar = false;
            }
        }
        olimpiadas.setJogadores(jogadores);
        return olimpiadas;
    }
}
