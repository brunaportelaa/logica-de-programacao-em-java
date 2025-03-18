public class Corrida {
    public Piloto[] pilotos;


    public void rankearPilotos(){
        for (int i = 0; i < this.pilotos.length - 1; i++) {
            for (int j = 0; j < this.pilotos.length - i - 1; j++) {
                if (this.pilotos[j].tempoVolta > this.pilotos[j + 1].tempoVolta) {
                    Piloto temp = this.pilotos[j];
                    this.pilotos[j] = this.pilotos[j + 1];
                    this.pilotos[j + 1] = temp;
                }
            }
        }
    }
    public Piloto getPilotoMaisRapido(){
        this.rankearPilotos();
        return this.pilotos[0];
    };

    public Piloto getPilotoMaisLento(){
        this.rankearPilotos();
        return this.pilotos[this.pilotos.length - 1];
    };

    public double getMedia(){
        double qtdCorridas = 0;
        double somaTempos = 0;

        for (Piloto piloto : pilotos){
            qtdCorridas++;
            somaTempos += piloto.tempoVolta;
        }

        return somaTempos / qtdCorridas;
    }
}
