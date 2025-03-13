public class Aplicacao {
    public static void main(String[] args) {
        Corrida corrida = Leitor.lerCorrida();
        Corrida.media = ServiceCorrida.calcularMedia(corrida);
        ServiceCorrida.rankearPilotos(corrida);
        ServiceCorrida.atribuirMaisLento(corrida);
        ServiceCorrida.atribuirMaisRapido(corrida);
        Printer.printCorrida(corrida);
    }
}
