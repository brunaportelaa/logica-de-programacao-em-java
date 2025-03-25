public class Aplicacao {
    public static void main(String[] args) {
        SistemaControleFranquias sistema = View.gerarSistema();
        Printer.print(sistema);


        int operacao = 1;

        while (operacao >= 1 && operacao <= 4) {
            operacao = Leitor.lerInt("Qual relatório gostaria de gerar?\n[1] - Franquia mais barata\n[2] - Por empresa\n[3] - Selecionar franquias através de um valor mínimo\n[4] - Preço médio das franquias.\nDigite qualquer outro valor para encerrar o programa.");
            switch (operacao) {
                case 1:
                    Printer.print(sistema.selectMaisBarata());
                    break;
                case 2:
                    int empresa = Leitor.lerInt("Qual empresa deseja consultar?\n[1] - VIVO\n[2] - TIM\n[3] - CLARO\n[4] - OI", 1, 4);
                    Printer.print(sistema.sortFranquiaByEmpresa(empresa));
                    break;
                case 3:
                    int gbMinimo = Leitor.lerInt("Qual o valor mínimo em GB que deseja consultar?", 1);
                    Printer.print(sistema.sortFranquiaByGBMinimo(gbMinimo));
                    break;
                case 4:
                    System.out.println("O preço médio das franquias é de: R$" + sistema.getPrecoMedio());
                    break;
                default:
                    System.out.println("Programa encerrado.");
                    operacao = 5;
            }
        }
    }
}