public class Main {
    public static void main(String[] args) {
        SistemaCompeticao sistemaCompeticao = View.cadastrarSistemaCompeticao();

        boolean continuar = true;

        while (continuar) {
            int opcao = Leitor.lerInt("[1] - Exibir todos os competidores\n[2] - Exibir competidores ordenados pelo custo\n[3] - Atleta de menor custo\n[4] - Custo total\n[5] - Competidores filtrados pelo sexo\nDigite qualquer outro número para encerrar o programa.");
            switch (opcao) {
                case 1:
                    Printer.print(sistemaCompeticao.getCompetidores());
                    break;
                case 2:
                    Printer.print(sistemaCompeticao.sortByCusto());
                    break;
                case 3:
                    System.out.println(sistemaCompeticao.sortByCusto().getFirst());
                    break;
                case 4:
                    System.out.println("Custo total: R$" + sistemaCompeticao.getTotalCusto());
                    break;
                case 5:
                    Printer.print(sistemaCompeticao.filterBySexo(Leitor.lerInt("Sexo: \n[1] - Feminino\n[2] - Masculino", 1, 2)));
                    break;
                default:
                    System.out.println("Encerrando o programa.");
                    continuar = false;
            }
        }
    }
}
