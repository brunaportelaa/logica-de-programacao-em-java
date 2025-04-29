public class App {
    public static void main(String[] args) {
        DataCenter dataCenter = View.cadastrarDatacenter();

        boolean continuar = true;

        while (continuar) {
            int opcao = Leitor.lerInt("[1] - Exibir todos os sistemas\n[2] - Exibir sistemas ordenados pelo número de funcionários\n[3] - Sistema que possui mais funcionários\n[4] - Pesquisar pelo nome do funcionário responsável\nDigite qualquer outro número para encerrar o programa.");
            switch (opcao) {
                case 1:
                    Printer.print(dataCenter.getSistemas());
                    break;
                case 2:
                    Printer.print(dataCenter.sortByNumFuncionarios());
                    break;
                case 3:
                    System.out.println(dataCenter.getSistemaMaisFuncionarios());
                    break;
                case 4:
                    String termoPesquisa = Leitor.lerString("Insira o nome que deseja pesquisar");
                    Printer.print(dataCenter.searchByFuncionarioNome(termoPesquisa));
                    break;
                default:
                    System.out.println("Encerrando o programa.");
                    continuar = false;
            }
        }
    }
}
