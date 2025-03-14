import java.util.Scanner;

public class Leitor {
    public static String lerString(){
        return new Scanner(System.in).nextLine();
    }

    public static String lerString(String msg){
        System.out.println(msg);
        return lerString();
    }

    public static int lerInt(){
        return new Scanner(System.in).nextInt();
    }

    public static int lerInt(String msg){
        System.out.println(msg);
        return lerInt();
    }

    public static long lerLong(){
        return new Scanner(System.in).nextLong();
    }

    public static long lerLong(String msg){
        System.out.println(msg);
        return lerLong();
    }


}
