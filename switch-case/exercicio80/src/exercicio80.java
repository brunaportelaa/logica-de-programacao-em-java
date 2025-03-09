import java.util.Scanner;

public class exercicio80 {
    public static void main(String[] args) {
        int diaSemana = lerInt("Informe um dia da semana como um número inteiro de 1 a 7, sendo 1 correspondente a domingo e 7 correspondente a sábado");
        exibirDiaSemana(diaSemana);
    }

    public static void exibirDiaSemana(int diaSemana) {
        switch (diaSemana) {
            case 1:
                    System.out.println("Domingo.");
                break;
            case 2:
                System.out.println("Segunda.");
                break;
            case 3:
                System.out.println("Terça.");
                break;
            case 4:
                System.out.println("Quarta.");
                break;
            case 5:
                System.out.println("Quinta.");
                break;
            case 6:
                System.out.println("Sexta.");
                break;
            case 7:
                System.out.println("Sábado.");
                break;
            default:
                System.out.println("Por favor, informe um valor válido (S para solteiro, C para casado, V para viúvo, D para divorciado ou E para desquitado)");
                break;
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
