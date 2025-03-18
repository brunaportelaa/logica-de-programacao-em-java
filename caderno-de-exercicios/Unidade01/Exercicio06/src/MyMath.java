public class MyMath {

    public static void main(String[] args) {

        boolean continuar = true;
        int opcao;
        Numero numero = new Numero();

        while (continuar) {
            opcao = Leitor.lerInt("Digite 1 para calcular fatorial, 2 para retornar maior valor, 3 para checar se é par ou 4 para checar se é primo. Digite qualquer outro número para encerrar o programa.");
            switch (opcao) {
                case 1:
                    numero.numero = Leitor.lerInt("Insira um número para calcular fatorial:");
                    Printer.print(numero.getFatorial(numero.numero));
                    break;
                case 2:
                    numero.numero = Leitor.lerInt("Informe um número.");
                    int comparador = Leitor.lerInt("Informe um número para comparar com o anterior.");
                    Printer.print(numero.compararNumero(comparador));
                    break;
                case 3:
                    numero.numero = Leitor.lerInt("Qual número você gostaria de verificar se é par?");
                    numero.isPar();
                    break;
                case 4:
                    numero.numero = Leitor.lerInt("Qual número você gostaria de verificar se é primo?");
                    if (numero.isPrimo()) {
                        System.out.println("O número é primo.");
                    }
                    break;
                default:
                    continuar = false;
                    break;
            }

        }
    }
}
