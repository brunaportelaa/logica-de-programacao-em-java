import java.lang.reflect.Array;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        Leitor leitor = new Leitor();
        Printer printer = new Printer();
        View view = new View();
        GestorServicos gestorServicos = view.cadastrarGestorServicos();

        String prompt = "Quais serviços gostaria de exibir?\n" +
                        "[1] - Todos os serviços\n" +
                        "[2] - O serviço mais caro\n" +
                        "[3] - Quantidade de serviços prestados por tipo\n" +
                        "[4] - Filtrar por tipo de serviço\n" +
                        "[5] - Buscar serviço por termo da descrição\n" +
                        "Digite qualquer outro número para encerrar o programa.";

        int operacao;
        boolean continuar = true;

        while (continuar) {
            operacao = leitor.lerInt(prompt);
            switch (operacao) {
                case 1:
//                    "[1] - Todos os serviços\n"
                    ArrayList<Servico> servicos = gestorServicos.getServicos();
                    printer.print(servicos);
                    break;
                case 2:
//                    "[2] - O serviço mais caro\n"
                    printer.print(gestorServicos.getMaisCaro());
                    break;
                case 3:
//                    "[3] - Quantidade de serviços prestados por tipo\n"
                    int tipo = leitor.lerInt("Informe 1 para serviços de FOTOGRAFIA  e 2 para de FILMAGEM", 1, 2);
                    System.out.println(gestorServicos.countServicosByTipo(tipo) + " serviços contabilizados do tipo informado");
                    break;
                case 4:
//                    "[4] - Filtrar por tipo de serviço\n" +
                    int opcao = leitor.lerInt("Informe 1 para serviços de FOTOGRAFIA  e 2 para de FILMAGEM", 1, 2);
                    printer.print(gestorServicos.filterServicosByTipo(opcao));
                    break;
                case 5:
//                    "[5] - Buscar serviço por termo da descrição\n"
//                    String inputBusca = leitor.lerString("Informe o texto que gostaria de pesquisar");
                    printer.print(gestorServicos.searchDescricao("save date"));
                    break;
                default:
                    continuar = false;
                    System.out.println("Encerrando o programa...");
            }
        }
    }
}
