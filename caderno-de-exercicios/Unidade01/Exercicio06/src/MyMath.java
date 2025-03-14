import java.util.Scanner;

public class MyMath {

    public static void main(String[] args) {

        boolean continuar = true;
        int opcao;
        int numero;
        int resultado;

        while (continuar) {
            opcao = lerInt("Digite 1 para calcular fatorial, 2 para retornar maior valor, 3 para checar se é par ou 4 para checar se é primo. Digite qualquer outro número para encerrar o programa.");

            switch (opcao) {
                case 1:
                    numero = lerInt("Insira um número para calcular fatorial:");
                    resultado = calcularFatorial(numero);
                    printResultado(resultado);
                    break;
                case 2:
                    int qtdValores = lerInt("Quantos valores gostaria de comparar?");
                    resultado = retornarMaior(qtdValores);
                    printResultado(resultado);
                    break;
                case 3:
                    numero = lerInt("Qual número você gostaria de verificar se é par?");
                    isPar(numero);
                    break;
                case 4:
                    numero = lerInt("Qual número você gostaria de verificar se é primo?");
                    if (isPrimo(numero)) {
                        System.out.println("O número é primo.");
                    }
                    break;
            }

        }
    }

    public static int calcularFatorial(int numero){
        if (numero == 1) {
            return 1;
        } else {
            return numero * calcularFatorial(numero - 1);
        }
    }

    public static int retornarMaior(int qtdValores){
        int valorMaior = 0;
        for (int i = 1; i <= qtdValores; i++) {
            int numero = lerInt("Informe um valor para ser comparado:");
            if (numero > valorMaior) {
                valorMaior = numero;
            }
        }
        return valorMaior;
    }

    public static boolean isPar(int numero) {
        if (numero % 2 == 0){
            System.out.println("O número é par");
            return true;
        } else {
            System.out.println("O número é impar");
            return false;
        }
    }

    public static boolean isPrimo(int numero){
        if (numero < 1) {
            System.out.println("O número é inválido.");
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                System.out.println("O número não é primo.");
                return false;
            }
        }
        return true;
    }

    public static int lerInt(String msg) {
        System.out.println(msg);
        return new Scanner(System.in).nextInt();
    }

    public static void printResultado(int resultado) {
        System.out.println("O resultado da operação é: " + resultado);
    }

}
