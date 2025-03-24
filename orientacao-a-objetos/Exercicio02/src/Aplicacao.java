public class Aplicacao {
    public static void main(String[] args) {
        UnidadeAdministrativa unidade = new UnidadeAdministrativa();
        unidade.gerarId();
        View.lerUnidadeAdministrativa(unidade);
        Printer.print(unidade);

        // System.out.println("Escolha quais ações deseja visualizar: \n1 - Todas\n2 - Prioritárias\n3 - Por trimestre\n4 - Por ano");
        Printer.print(unidade.sortByAno(2017));
        Printer.print(unidade.sortByPrioridade(true));
        Printer.print(unidade.sortByTrimestre(3));
    }
}
