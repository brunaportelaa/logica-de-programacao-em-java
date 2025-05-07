import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        CatalogoPolicialTerrorismo catalogoPolicialTerrorismo = View.cadastrarCatalogoTerroristas();
        Printer.print(catalogoPolicialTerrorismo.getListaTerroristas());

        boolean continuar = true;

        while (continuar) {
            int opcao = Leitor.lerInt("[1] - Exibir todos os terroristas\n[2] - Terroristas filtrados por grau de periculosidade mínimo\n[3] - Procurar terroristas pelo nome\n[4] - Terroristas filtrados pela quantidade mínima de explosivos\n[5] - Filtrar pelo país\nDigite qualquer outro número para encerrar o programa.");
            switch (opcao) {
                case 1:
                    Printer.print(catalogoPolicialTerrorismo.getListaTerroristas());
                    break;
                case 2:
                    Printer.print(catalogoPolicialTerrorismo.filterByPericulosidade(50));
                    break;
                case 3:
                    Printer.print(catalogoPolicialTerrorismo.searchByName("Mohamed"));
                    break;
                case 4:
                    Printer.print(catalogoPolicialTerrorismo.filterByQtdExplosivos(10));
                    break;
                case 5:
                    ArrayList terroristasNaoDaArabia = catalogoPolicialTerrorismo.filtrarNaoDoPais(Pais.ARABIA_SAUDITA);
                    Printer.print(terroristasNaoDaArabia);
                    break;
                default:
                    System.out.println("Encerrando o programa.");
                    continuar = false;
            }
        }

    }
}
