public class ServiceCorrida {
    public static double calcularMedia(Corrida corrida){
        double qtdCorridas = 0;
        double somaTempos = 0;
        for (Piloto piloto : corrida.pilotos){
            qtdCorridas++;
            somaTempos += piloto.tempoVolta;
        }

        corrida.media = somaTempos / qtdCorridas;
        return corrida.media;
    }

    public static void rankearPilotos(Corrida corrida){
        int size = corrida.pilotos.length;

        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (corrida.pilotos[j].tempoVolta > corrida.pilotos[j + 1].tempoVolta) {
                    Piloto temp = corrida.pilotos[j];
                    corrida.pilotos[j] = corrida.pilotos[j + 1];
                    corrida.pilotos[j + 1] = temp;
                }
            }
        }
    }

    public static void atribuirMaisRapido(Corrida corrida){
        corrida.pilotoMaisRapido = corrida.pilotos[0];
    }

    public static void atribuirMaisLento(Corrida corrida){
        corrida.pilotoMaisLento = corrida.pilotos[corrida.pilotos.length - 1];
    }
}
