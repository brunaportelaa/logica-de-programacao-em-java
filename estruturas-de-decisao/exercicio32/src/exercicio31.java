import java.util.Scanner;

public class exercicio31 {
    public static void main(String[] args) {
        int inteiroUm = lerInt("Informe um número inteiro:");
        int inteiroDois = lerInt("Informe outro número inteiro:");

        printMaiorInt(inteiroUm, inteiroDois);
    }

    public static int lerInt(String msg) {
        System.out.println(msg);
        return lerInt();
    }

    public static int lerInt() {
        return new Scanner(System.in).nextInt();
    }

    public static void printMaiorInt(int a, int b) {
        if (a > b){
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }
}
