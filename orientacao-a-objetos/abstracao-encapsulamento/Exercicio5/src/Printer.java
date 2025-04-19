import java.util.ArrayList;

public class Printer {

    public static void print(Atleta[] atletas) {
        for (Atleta atleta : atletas) {
            print(atleta);
        }
    }

    public static void print(ArrayList<Atleta> atletas) {
        for (Atleta atleta : atletas) {
            print(atleta);
        }
    }

    public static void print(Atleta atleta) {
        System.out.println(atleta.toString().toUpperCase());
    }


}
