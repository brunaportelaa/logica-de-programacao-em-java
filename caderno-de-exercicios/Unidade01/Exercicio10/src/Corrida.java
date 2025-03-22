import java.util.Arrays;

public class Corrida {
    Piloto[] pilotos;

    public Piloto[] rankearPilotos(){
        Piloto[] pilotosRankeados = Arrays.copyOf(this.pilotos, pilotos.length);
        for (int i = 0; i < pilotosRankeados.length - 1; i++) {
            for (int j = 0; j < pilotosRankeados.length - i - 1; j++) {
                if (pilotosRankeados[j].tempoVolta > pilotosRankeados[j + 1].tempoVolta) {
                    Piloto temp = pilotosRankeados[j];
                    pilotosRankeados[j] = pilotosRankeados[j + 1];
                    pilotosRankeados[j + 1] = temp;
                }
            }
        }
        return pilotosRankeados;
    }

    public Piloto getPilotoMaisRapido(){
        return this.rankearPilotos()[0];
    };

    public Piloto getPilotoMaisLento(){
        return this.rankearPilotos()[this.rankearPilotos().length - 1];
    };

    public double getMedia(){
        double somaTempos = 0;

        for (Piloto piloto : pilotos){
            somaTempos += piloto.tempoVolta;
        }

        return somaTempos / this.pilotos.length;
    }
}
