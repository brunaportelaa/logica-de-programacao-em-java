public class App {
    public static void main(String[] args) {

//        1 – Apresente todas as franquias;
//        2 – A franquia mais barata;
//        3 – A quantidade de franquias oferecidas pela empresa VIVO.
//        4 – A quantidade de franquias que vão fornecer mais de 2GB.
//        5 - Preço médio das franquias.

        boolean continuar = true;

        Anatel anatel = View.cadastrarAnatel();
        int opcao = Leitor.lerInt("O que gostaria de fazer? [...] \nDigite qualquer outro número para encerrar o programa.");
        while (continuar) {
            switch (opcao) {
                case 1:
                    Printer.print(anatel);
                    break;
                case 2:
                    Printer.print(anatel.getMaisBarata());
                    break;
                case 3:
                    Printer.print(anatel.sortFranquiaByEmpresa("VIVO"));
                    break;
                case 4:
                    //mesma coisa do 3;
                case 5:
                    System.out.println("O preço médio das franquias é de: " + anatel.getMediaPreco());
                    break;
                default:
                    System.out.println("Encerrando programa.");
                    continuar = false;
            }
        }






    }
}
