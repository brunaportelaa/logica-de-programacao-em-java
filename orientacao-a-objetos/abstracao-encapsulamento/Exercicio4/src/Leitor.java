import java.util.Scanner;

public class Leitor {


    public static int lerInt(String msg, int min) {
        int valor;
        do {
            valor = lerInt(msg);
            if (valor < min) {
                System.out.println("Valor inválido.");
            }
        } while (valor < min);
        return valor;
    }

    public static int lerInt(String msg, String msgErro, int min, int max) {
        int valor;
        do {
            valor = lerInt(msg);
            if (valor < min || valor > max) {
                System.out.println(msgErro);
            }
        } while (valor < min || valor > max);
        return valor;
    }



    public static int lerInt(){
        return new Scanner(System.in).nextInt();
    }

    public static int lerInt(String msg){
        System.out.println(msg);
        return lerInt();
    }

    public static String lerString(){
        return new Scanner(System.in).nextLine();
    }

    public static String lerString(String msg){
        System.out.println(msg);
        return lerString();
    }
}
