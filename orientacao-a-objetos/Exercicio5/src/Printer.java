public class Printer {

    public static void print(Atleta[] atletas) {
        for (Atleta atleta : atletas) {
            print(atleta);
        }
    }

    public static void print(Atleta atleta) {
        System.out.println(atleta.toString());
    }


}
