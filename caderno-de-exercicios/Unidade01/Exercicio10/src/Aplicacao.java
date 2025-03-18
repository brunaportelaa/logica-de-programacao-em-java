public class Aplicacao {
    public static void main(String[] args) {
        Corrida corrida = View.lerCorrida();
        Printer.print(corrida);
    }
}
