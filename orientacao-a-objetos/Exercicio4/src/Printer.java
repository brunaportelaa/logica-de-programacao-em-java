public class Printer {
    public static void print(Placa[] placas) {
        for (Placa placa : placas) {
            print(placa);
        }
    }

    public static void print(Placa placa) {
        System.out.println(placa.toString());
    }

}
