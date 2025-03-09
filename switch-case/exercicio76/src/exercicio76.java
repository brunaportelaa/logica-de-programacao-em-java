import java.util.Scanner;

public class exercicio76 {
    public static void main(String[] args) {

        int data = lerInt("Informe a data no formato DDMMAAAA");
        int dia = data / 1000000;
        int mes = (data / 10000) % 100;

        informarEstacao(dia, mes);
    }

    public static void informarEstacao(int dia, int mes) {
        String estacao = "";
        switch (mes) {
            case 1:
            case 2:
                estacao = "Verão";
                break;
            case 3:
                if (dia < 21){
                    estacao = "Verão";
                } else {
                    estacao = "Outono";
                }
                break;
            case 4:
            case 5:
                estacao = "Outono";
                break;
            case 6:
                if (dia < 21){
                    estacao = "Outono";
                } else {
                    estacao = "Inverno";
                }
                break;
            case 7:
            case 8:
                estacao = "Inverno";
                break;
            case 9:
                if (dia < 21){
                    estacao = "Inverno";
                } else {
                    estacao = "Primavera";
                }
                break;
            case 10:
            case 11:
                estacao = "Primavera";
                break;
            case 12:
                if (dia < 21){
                    estacao = "Primavera";
                } else {
                    estacao = "Verão";
                }
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
