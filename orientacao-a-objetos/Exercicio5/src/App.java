public class App {
    public static void main(String[] args) {

        final int TOTAL_CORREDORES = 1200;
        Corrida corrida = View.cadastrarCorrida(TOTAL_CORREDORES);
        boolean continuar = true;

        while (continuar) {
            int operacao = Leitor.lerInt("Qual operação deseja realizar?\n[1] - Ver todos os atletas\n[2] - Ver todos os atletas ELITE\n[3] - Ver melhor atleta da competição\n[4] - Ver a média do tempo dos atletas.\nDigite qualquer outro número para encerrar o programa.");
            switch (operacao) {
                case 1:
                    // [1] - Ver todos os atletas
                    Printer.print(corrida.getAtletas());
                    break;
                case 2:
                    // [2] - Ver todos os atletas ELITE
                    int isElite = Leitor.lerInt("Insira 1 para selecionar atletas ELITE ou 2 para selecionar os demais atletas", "Valor inválido", 1, 2);
                    Atleta[] atletasSelecionados;
                    if (isElite == 1) {
                        atletasSelecionados = corrida.sortAtletaByElite(isElite);
                    } else {
                        atletasSelecionados = corrida.sortAtletaByElite(isElite);
                    }
                    Printer.print(atletasSelecionados);
                    break;
                case 3:
                    // [3] - Ver melhor atleta da competição
                    Atleta atleta = corrida.getMelhorAtleta();
                    Printer.print(atleta);
                    break;
                case 4:
                    // [4] - Ver a média do tempo dos atletas.
                    System.out.println("O tempo médio dos atletas foi de: " + corrida.getMedia());
                    break;
                default:
                    System.out.println("Encerrando o programa.");
                    continuar = false;
            }
        }
    }
}
