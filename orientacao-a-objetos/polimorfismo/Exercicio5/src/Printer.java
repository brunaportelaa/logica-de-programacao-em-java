import java.util.ArrayList;

public class Printer {
    public static void print(ArrayList<Programa> programas) {
        for (Programa programa : programas) {
            print(programa);
        }
    }

    public static void print(Programa programa){
        System.out.println(programa);
        System.out.println();
    }
}
