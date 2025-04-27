public class View {
    public static Carro cadastrarCarro() {
        String modelo = Leitor.lerString("Modelo: ");
        String placa = Leitor.lerString("Placa: ");
        String marca = Leitor.lerString("Marca: ");
        int cavalos = Leitor.lerInt("Qtd. de cavalos: ", 1);
        Carro carro = new Carro(modelo, marca, placa, cavalos);
        return carro;
    }

    public static Carros cadastrarCarros() {
        boolean continuar = true;
        Carros carros = new Carros();
        while (continuar) {
            Carro novoCarro = cadastrarCarro();
            while (!carros.adicionar(novoCarro)) {
                System.out.println("Carro já existente. Por favor informe uma placa única.");
                novoCarro = cadastrarCarro();
            }
            int opcao = Leitor.lerInt("Digite 1 para continuar e qualquer outro número para encerrar");
            if (opcao != 1) {
                continuar = false;
            }
        }
        return carros;
    }
}
