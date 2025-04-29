import java.util.ArrayList;

public class Printer {
    public static void print(ArrayList<Sistema> sistemas) {
        for (Sistema sistema : sistemas) {
            System.out.println(sistema);
            System.out.println();
        }
    }
}
