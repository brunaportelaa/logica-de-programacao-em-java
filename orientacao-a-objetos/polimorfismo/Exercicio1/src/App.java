public class App {
    public static void main(String[] args) {
        Carros carros = View.cadastrarCarros();
        Printer.print(carros.getCarros());
        boolean continuar = true;

        while (continuar) {
            int opcao = Leitor.lerInt("[1] - Ver todos os carros\n[2] - Filtrar os carros pela marca\n[3] - Filtrar carros pelo número mínimo de cavalos\n[4] - Contar os carros pelo início da placa\nDigite qualquer outro número para encerrar o programa.");
            switch (opcao) {
                case 1:
                    Printer.print(carros.getCarros());
                    break;
                case 2:
                    String marca = Leitor.lerString("Informe a marca: ");
                    Printer.print(carros.filterByMarca(marca));
                    break;
                case 3:
                    int cavalos = Leitor.lerInt("Informe o número mínimo de cavalos");
                    Printer.print(carros.filterByMinimoCavalos(cavalos));
                    break;
                case 4:
                    String inicioPlaca = Leitor.lerString("Informe os primeiros dígitos da placa:");
                    System.out.println("A quantidade de carros com a placa de início " + inicioPlaca + " é: " + carros.searchPlacaByPrimeirasLetras(inicioPlaca));
                    break;
                default:
                    continuar = false;
            }
        }
    }
}
