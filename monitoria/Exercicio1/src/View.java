public class View {
    public static Anatel cadastrarAnatel() {
        Anatel anatel = new Anatel();
        boolean continuar = true;
        while (continuar) {
            anatel.adicionar(cadastrarFranquia());
            int opcao = Leitor.lerInt("Informe 1 para continuar ou 2 para parar o cadastro de franquias", 1, 2);
            if (opcao == 2) {
                continuar = false;
            }
        }
        return anatel;
    }

    public static Franquia cadastrarFranquia() {
        Franquia franquia = new Franquia();
        franquia.setQtdGB(Leitor.lerInt("Informe a quantidade de GB: ", 1));
        franquia.setEmpresa(Leitor.lerString("Informe o nome da empresa: "));
        franquia.setPreco(Leitor.lerDouble("Informe o preço:", 0));
        franquia.setDiaExpiracao(Leitor.lerInt("Informe a data mensal de expiração: ", 1, 30));
        return franquia;
    }
}
