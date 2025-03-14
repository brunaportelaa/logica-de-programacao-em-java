public class Aplicacao {
    public static void main(String[] args) {
        int operacao = 0;
        double resultado = 0;
        do {
            operacao = Leitor.lerInt("Informe qual operação deseja realizar:\n1 - ADIÇÃO\n2 - SUBTRAÇÃO\n3 - MULTIPLICAÇÃO\n4 - DIVISÃO");
            switch (operacao) {
                case 1:
                    resultado = ServiceCalculadora.adicionar();
                    break;
                case 2:
                    resultado = ServiceCalculadora.subtrair();
                    break;
                case 3:
                    resultado = ServiceCalculadora.multiplicar();
                    break;
                case 4:
                    resultado = ServiceCalculadora.dividir();
                    break;
            }
        } while (operacao < 1 || operacao > 4);


        Printer.printResultado(resultado);
    }

}
