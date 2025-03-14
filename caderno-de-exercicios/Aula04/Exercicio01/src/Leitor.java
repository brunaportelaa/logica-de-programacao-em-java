import java.util.Scanner;

public class Leitor {
    public static int lerInt(){
        return new Scanner(System.in).nextInt();
    }

    public static int lerInt(String msg){
        System.out.println(msg);
        return lerInt();
    }

    public static double lerDouble(){
        return new Scanner(System.in).nextInt();
    }

    public static double lerDouble(String msg){
        System.out.println(msg);
        return lerDouble();
    }
}
