public class App {
    public static void main(String[] args) {

        RegistroProgramas registroProgramas = View.cadastrarRegistroProgramas();

        boolean continuar = true;

        while (continuar) {
            int opcao = Leitor.lerInt("[1] - Exibir todos os programas ordenados por tempo de compilação\n[2] - Arquivo mais demorado\n[3] - Programas dentro de um intervalo de linhas\n[4] - Pesquisar por termo\nDigite qualquer outro número para encerrar o programa.");
            switch (opcao) {
                case 1:
                    Printer.print(registroProgramas.sortByTempoCompilacao());
                    break;
                case 2:
                    Printer.print(registroProgramas.getProgramaMaiorTempoCompilacao());
                    break;
                case 3:
                    int maxLinhas = Leitor.lerInt("Insira o número máximo de linhas");
                    int minLinhas = Leitor.lerInt("Insira o número mínimo de linhas", 0, maxLinhas, "O número de linhas não pode ser menor que zero ou maior que o máximo fornecido");
                    Printer.print(registroProgramas.filterByQtdLinhas(minLinhas, maxLinhas));
                    break;
                case 4:
                    String termoPesquisa = Leitor.lerString("Qual termo deseja pesquisar?");
                    Printer.print(registroProgramas.searchByNome(termoPesquisa));
                    break;
                default:
                    System.out.println("Encerrando o programa.");
                    continuar = false;
            }
        }
    }
}
