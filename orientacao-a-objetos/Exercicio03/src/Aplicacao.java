public class Aplicacao {
    public static void main(String[] args) {
        Universidade universidade = View.lerUniversidade();
        int tipoRelatorio = 1;
        while (tipoRelatorio > 0 && tipoRelatorio <= 5) {
            tipoRelatorio = Leitor.lerInt("Qual relatório deseja gerar? \n1 - Geral\n2 - Por tipo de responsável\n3 Relatório de itens - Por tipo de item\n4 - Relatório de custos\n5 - Localidade e quantitativo de itens\nInsira qualquer outro número para encerrar o programa");
            switch (tipoRelatorio) {
                case 1:
                    Printer.print(universidade);
                    break;
                case 2:
                    int cargoResponsavel = Leitor.lerInt("Informe 1 para cargo TÉCNICO e 2 para cargo ANALISTA", "Valor inválido. Informe 1 para cargo TÉCNICO e 2 para cargo ANALISTA", 1, 2);
                    int qtdLaboratorios = universidade.countByResponsavel(cargoResponsavel);
                    Laboratorio[] labsSelecionados = universidade.sortByResponsavel(qtdLaboratorios, cargoResponsavel);
                    Printer.print(labsSelecionados);
                    break;
                case 3:
                    int tipoItens = Leitor.lerInt("Informe 1 para cargo TECNOLOGIA e 2 para cargo OUTROS","Valor inválido. Informe 1 para cargo TECNOLOGIA e 2 para cargo OUTROS", 1, 2);
                    System.out.println("O total de itens do tipo selecionado é: " + universidade.countItensByTipo(tipoItens));
                    break;
                case 4:
                    System.out.println("O custo total da Universidade com seus laboratórios é de: " + universidade.somarCusto());
                    break;
                case 5:
//                    universidade.getLocalItens();
                    break;
                default:
                    System.out.println("Valor inválido. Programa encerrado.");
            }
        }
    }
}
