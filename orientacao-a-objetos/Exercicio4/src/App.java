import javax.swing.text.ElementIterator;

public class App {
    public static void main(String[] args) {
        GrupoPlacas grupoPlacas =  View.cadastrarPlacas();
        boolean continuar = true;
        int produzSinal;

        while (continuar) {
            int operacao = Leitor.lerInt("Qual operação deseja realizar?\n[1] - Visualizar todas as placas\n[2] - Visualizar o custo total das placas\n[3] - Visualizar placas de acordo com a produção de sinal MLP\n[4] - Visualizar o custo das placas de acordo com a produção de sinal MLP.\nDigite qualquer outro número para encerrar o programa.");
            switch (operacao) {
                case 1:
                    Printer.print(grupoPlacas.getPlacas());
                    break;
                case 2:
                    System.out.println("O custo total das placas é de: R$" + grupoPlacas.calcularCustoTotal());
                    break;
                case 3:
                    produzSinal = Leitor.lerInt("Digite 1 para ver placas que produzem sinal ou 2 para ver placas que não produzem sinal", "Valor inválido.", 1, 2);
                    Placa[] placasSelecionadas = grupoPlacas.sortByProduzSinalMLP(produzSinal);
                    Printer.print(placasSelecionadas);
                    break;
                case 4:
                    produzSinal = Leitor.lerInt("Digite 1 para ver placas que produzem sinal ou 2 para ver placas que não produzem sinal", "Valor inválido.", 1, 2);
                    double custoPlacasSelecionadas = grupoPlacas.calcularCustoPorProducaoSinal(produzSinal);
                    System.out.println("O custo total das placas selecionadas é: R$" + custoPlacasSelecionadas);
                    break;
                default:
                    System.out.println("Encerrando o programa.");
                    continuar = false;
            }
        }


    }
}
