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
        System.out.println("O tempo médio da corrida foi de: " + corrida.mediaTempo);
        System.out.println("O piloto mais rápido foi " + corrida.pilotoMaisRapido.nome + " com o tempo de " + corrida.pilotoMaisRapido.tempoVolta + " minutos.");
        System.out.println("O piloto mais lento foi " + corrida.pilotoMaisLento.nome + " com o tempo de " + corrida.pilotoMaisLento.tempoVolta + " minutos.");

    }
}
