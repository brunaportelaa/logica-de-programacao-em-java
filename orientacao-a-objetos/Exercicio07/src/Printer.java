import java.util.ArrayList;

public class Printer {
    public static void print(Jogador jogador) {
        System.out.println(jogador.toString());
    }

    public static void print(ArrayList<Jogador> jogadores) {
        for (Jogador jogador : jogadores) {
            print(jogador);
        }
    }
}
