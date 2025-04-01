import java.util.Scanner;

public class Leitor {

    public int lerInt() {
        return new Scanner(System.in).nextInt();
    }

    public int lerInt(String msg) {
        System.out.println(msg);
        return lerInt();
    }

    public int lerInt(String msg, String msgErro, int min, int max) {
        int valor;
        do {
            valor = lerInt(msg);
            if (valor < min || valor > max ) {
                System.out.println(msgErro);
            }
        } while (valor < min || valor > max);
        return valor;
    }
}
