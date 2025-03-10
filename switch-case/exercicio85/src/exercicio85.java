import java.util.Random;
import java.util.Scanner;

public class exercicio85 {

    public static void main(String[] args) {
        Random gerador = new Random();

//        Coletar jogada do usuário
        int jogadaUsuario = lerInt("Escolha sua jogada: 1 = Pedra, 2 = Papel, 3 = Tesoura.");

//        Coletar jogada do bot
        int jogadaBot = gerador.nextInt(3) + 1;
        informarJogadaBot(jogadaBot);

//        Gerar resultado
        printResultado(jogadaBot, jogadaUsuario);

    }

    public static void informarJogadaBot(int jogadaBot){
        switch (jogadaBot) {
            case 1:
                System.out.println("O bot escolheu PEDRA.");
                break;
            case 2:
                System.out.println("O bot escolheu PAPEL.");
                break;
            case 3:
                System.out.println("O bot escolheu TESOURA.");
                break;
        }
    }

    public static void printResultado(int jogadaBot, int jogadaUsuario) {
        switch (jogadaUsuario) {
            case 1:
                switch (jogadaBot) {
                    case 1:
                        System.out.println("Empate! Ambos escolheram PEDRA.");
                        break;
                    case 2:
                        System.out.println("Vitória do BOT: Ele escolheu PAPEL.");
                        break;
                    case 3:
                        System.out.println("PARABÉNS! Vitória do jogador, o bot escolheu TESOURA.");
                        break;
                }
                break;
            case 2:
                switch (jogadaBot) {
                    case 1:
                        System.out.println("PARABÉNS! Vitória do jogador, o bot escolheu PEDRA.");
                        break;
                    case 2:
                        System.out.println("Empate! Ambos escolheram PAPEL.");
                        break;
                    case 3:
                        System.out.println("Vitória do BOT: Ele escolheu TESOURA.");
                        break;
                }
                break;
            case 3:
                switch (jogadaBot) {
                    case 1:
                        System.out.println("Vitória do BOT: Ele escolheu PEDRA.");
                        break;
                    case 2:
                        System.out.println("PARABÉNS! Vitória do jogador, o bot escolheu PAPEL.");
                        break;
                    case 3:
                        System.out.println("Empate! Ambos escolheram TESOURA.");
                        break;
                }
                break;
            default:
                System.out.println("Por favor, insira uma jogada válida.");
        }
    }

    public static int lerInt(String msg) {
        System.out.println(msg);
        return lerInt();
    }

    public static int lerInt() {
        return new Scanner(System.in).nextInt();
    }
}
