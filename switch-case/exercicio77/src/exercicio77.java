import java.util.Scanner;

public class exercicio77 {

    public static void main(String[] args) {
        int data = lerInt("Informe a data no formato MMAAAA");
        int mes = data / 10000;
        int ano = data % 10000;

        int diasDoMes = retornarDias(mes, ano);
        System.out.println("O mês informado possui " + diasDoMes + " dias.");
    }

    public static int retornarDias(int mes, int ano) {
        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                if ((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0) {
                    return 29;
                } else {
                    return 28;
                }
            default:
                System.out.println("Insira uma data válida no formado MMAAAA");
                return 0;
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
