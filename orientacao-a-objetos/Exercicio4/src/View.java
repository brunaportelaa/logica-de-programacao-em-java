import java.util.Arrays;

public class View {
    public static GrupoPlacas cadastrarPlacas() {
        GrupoPlacas grupo = new GrupoPlacas();
        grupo.placas = new Placa[0];
        boolean continuar = true;
        do {
            String codigo = Leitor.lerString("Insira um código alfanumérico para a placa: ");
            if (grupo.validarCodigo(codigo)) {
                Placa[] placas = Arrays.copyOf(grupo.placas, grupo.placas.length + 1);
                placas[placas.length - 1] = View.cadastrarPlaca(codigo);
                grupo.placas = placas;
            } else {
                System.out.println("Este código já foi utilizado. Por favor insira um novo.");
            }

            int desejaContinuar = Leitor.lerInt("Aperte 1 para continuar ou qualquer outro número para encerrar o cadastro de placas");
            if (desejaContinuar != 1) {
                continuar = false;
            }

        } while (continuar);
        return grupo;
    }

    public static Placa cadastrarPlaca(String codigo) {
        Placa placa = new Placa(codigo);
        placa.entradasAnalogicas = Leitor.lerInt("Quantas entradas analógicas possui a placa?", 0);
        placa.pinos = Leitor.lerInt("Quantos pinos digitais possui a placa?", 0);
        int produzSinalMLP = Leitor.lerInt("Insira 1 se a placa produz sinal MLP, e 0 se não produz", "Valor inválido. Insira 1 se a placa produzsinal MLP, e 0 se não produz.", 0, 1);
        if (produzSinalMLP == 0) {
            placa.produzSinalMLP = false;
        } else {
            placa.produzSinalMLP = true;
        }
        return placa;
    }
}
