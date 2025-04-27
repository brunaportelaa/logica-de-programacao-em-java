public class App {
    public static void main(String[] args) {
        RegistroProfessores registroProfessores = View.cadastrarProfessores();

        boolean continuar = true;

        while (continuar) {
            int opcao = Leitor.lerInt("[1] - Exibir todos os professores\n[2] - Pesquisar pelo nome\n[3] - Filtrar pela titulação\n[4] - Filtrar pelo valor do salário\nDigite qualquer outro número para encerrar o programa.");
            switch (opcao) {
                case 1:
                    Printer.print(registroProfessores.getProfessores());
                    break;
                case 2:
                    String termoPesquisa = Leitor.lerString("Insira o nome que deseja pesquisar");
                    Printer.print(registroProfessores.searchByNome(termoPesquisa));
                    break;
                case 3:
                    int titulacao = Leitor.lerInt("[1] - Doutor\n[2] - Mestre\n[3] - Pós-graduado\n[4] - Licenciado", 1 ,4);
                    Printer.print(registroProfessores.filterByTitulacao(titulacao));
                    break;
                case 4:
                    double salario = Leitor.lerDouble("Informe o valor mínimo do salário:");
                    Printer.print(registroProfessores.filterBySalarioMin(salario));
                    break;
                default:
                    System.out.println("Encerrando o programa.");
                    continuar = false;
            }
        }
    }
}
