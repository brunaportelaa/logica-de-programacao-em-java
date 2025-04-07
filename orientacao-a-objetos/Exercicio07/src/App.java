import java.util.ArrayList;

public class App {

    public static void main(String[] args) {

        Olimpiadas olimpiadas = View.cadastrarOlimpiadas();
        boolean continuar = true;

        while (continuar) {
            String prompt = "Qual operação deseja realizar?" +
                    "[1] Listar todos os jogadores;\n" +
                    "[2] O jogador que mais fez gols na temporada;\n" +
                    "[3] Os jogadores com qualificação Mediana;\n" +
                    "[4] A média de gols dos jogadores maiores de idade;\n" +
                    "[5] Gasto da FIFA;\n" +
                    "Digite qualquer outro número para encerrar o programa";

            int operacao = Leitor.lerInt(prompt);

            switch (operacao) {
                case 1:
                    //a. Listar todos os jogadores;
                    Printer.print(olimpiadas.getJogadores());
                    break;
                case 2:
                    //b. O jogador que mais fez gols na temporada;
                    Printer.print(olimpiadas.getMelhorJogador());
                    break;
                case 3:
                    //c. Os jogadores com qualificação Mediana;
                    if (olimpiadas.filterJogadoresByQualificacao(2).size() == 0) {
                        System.out.println("Não há jogadores dessa qualificação");
                    } else {
                        Printer.print(olimpiadas.filterJogadoresByQualificacao(2));
                    }
                    break;
                case 4:
                    //d. A média de gols dos jogadores maiores de idade;
                    ArrayList<Jogador> jogadoresMaioresDeIdade = olimpiadas.getJogadoresMaioresDeIdade();
                    if (jogadoresMaioresDeIdade.size() == 0) {
                        System.out.println("Não há jogadores maiores de idade");
                    } else {
                        double media = olimpiadas.calcularMedia();
                        System.out.println("A média de gols de jogadores maiores de idade foi de: " + media);
                    }
                    break;
                case 5:
                    //e. Gasto da FIFA *;
                    System.out.println("Gasto total FIFA: " + olimpiadas.getCustoTotal());
                    break;
                default:
                    System.out.println("Encerrando o programa.");
                    continuar = false;
            }
        }
    }
}
