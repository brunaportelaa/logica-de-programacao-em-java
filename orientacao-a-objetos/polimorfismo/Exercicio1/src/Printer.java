import java.util.ArrayList;

public class Printer {
    public static void print(ArrayList<Carro> carros) {
        for (Carro carro : carros) {
            System.out.println(carro);
            System.out.println();
        }
    }
}
