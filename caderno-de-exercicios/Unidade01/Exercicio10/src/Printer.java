public class Printer {
    public static void print(Piloto piloto){
        System.out.println("Nome do piloto: " + piloto.nome);
        System.out.println("Escuderia: " + piloto.escuderia);
        System.out.println("Tempo de volta: " + piloto.tempoVolta);
    }

    public static void print(Corrida corrida){
        for (Piloto piloto : corrida.pilotos) {
            print(piloto);
        }
        System.out.println("O tempo médio da corrida foi de: " + corrida.getMedia());
        System.out.println("O piloto mais rápido foi " + corrida.getPilotoMaisRapido().nome + " com o tempo de " + corrida.getPilotoMaisRapido().tempoVolta + " minutos.");
        System.out.println("O piloto mais lento foi " + corrida.getPilotoMaisLento().nome + " com o tempo de " + corrida.getPilotoMaisLento().tempoVolta + " minutos.");

    }
}
