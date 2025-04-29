import java.util.ArrayList;

public class Printer {
    public static void print(ArrayList<Competidor> competidores) {
        for (Competidor competidor : competidores) {
            System.out.println(competidor);
            System.out.println();
        }
    }
}
