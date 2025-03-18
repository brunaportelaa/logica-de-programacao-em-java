public class View {
    public static Corrida lerCorrida(){
        int qtdPilotos = Leitor.lerInt("Quantos pilotos participaram da corrida?");
        return lerCorrida(qtdPilotos);
    }

    public static Corrida lerCorrida(int qtdPilotos){
        Corrida corrida = new Corrida();
        corrida.pilotos = new Piloto[qtdPilotos];
        for (int i = 0; i < corrida.pilotos.length; i++) {
            corrida.pilotos[i] = lerPiloto();
        }
        return corrida;
    }

    public static Piloto lerPiloto() {
        Piloto piloto = new Piloto();
        piloto.nome = Leitor.lerString("Informe o nome do piloto");
        piloto.escuderia = Leitor.lerString("Informe a escuderia do piloto");
        piloto.tempoVolta = Leitor.lerDouble("Informe o tempo do piloto em minutos.", "Tempo inválido.", 1, 60);
        return piloto;
    }
}
