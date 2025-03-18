import java.util.Scanner;

public class Leitor {

    public static int lerInt(String msg) {
        System.out.println(msg);
        return new Scanner(System.in).nextInt();
    }


}
