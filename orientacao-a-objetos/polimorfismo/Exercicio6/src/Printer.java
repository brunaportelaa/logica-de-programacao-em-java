import java.util.ArrayList;

public class Printer {
    public static void print(ArrayList objetos) {
        for (Object obj : objetos) {
            print((Terrorista) obj);
        }
    }


    public static void print(Terrorista terrorista){
        System.out.println(terrorista);
        System.out.println();
    }


}
