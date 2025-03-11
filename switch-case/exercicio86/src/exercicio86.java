import java.util.Scanner;

public class exercicio86 {
    public static void main(String[] args) {

        int mes = lerInt("Informe o mês na forma de um número inteiro (1 a 12)");

        informarEstacao(mes);
    }

    public static void informarEstacao(int mes) {
        String estacao = "";
        switch (mes) {
            case 1:
            case 2:
            case 3:
                estacao = "Verão";
                break;
            case 4:
            case 5:
            case 6:
                estacao = "Outono";
                break;
            case 7:
            case 8:
            case 9:
                estacao = "Inverno";
                break;
            case 10:
            case 11:
            case 12:
                estacao = "Primavera";
                break;
            default:
                System.out.println("Data inválida.");
        }
        System.out.println("Estação do ano: " + estacao);
    }

    public static int lerInt(String msg) {
        System.out.println(msg);
        return lerInt();
    }

    public static int lerInt() {
        return new Scanner(System.in).nextInt();
    }

}
