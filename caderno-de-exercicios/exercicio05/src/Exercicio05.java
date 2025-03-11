import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {
        int operacao = lerInt("Por favor, escolha uma operação: 1 - Adição, 2 - Subtração, 3 - Multiplicação, 4 - Divisão, 5 - Fatorial, 6 - Exponenciação");
        double resultado = 0;
        switch (operacao) {
            case 1:
                resultado = adicionar();
                System.out.println("O resultado da operação é: " + resultado);
                break;
            case 2:
                resultado = subtrair();
                System.out.println("O resultado da operação é: " + resultado);
                break;
            case 3:
                resultado = multiplicar();
                System.out.println("O resultado da operação é: " + resultado);
                break;
            case 4:
                resultado = dividir();
                System.out.println("O resultado da operação é: " + resultado);
                break;
            case 5:
                int numero = lerInt("Informe um valor para o número:");
                resultado = fatorial(numero);
                System.out.println("O resultado da operação é: " + resultado);
                break;
            case 6:
                resultado = exponenciacao();
                System.out.println("O resultado da operação é: " + resultado);
                break;
            default:
                System.out.println("Por favor, informe uma operação válida.");
        }
    }

    public static double adicionar() {
        double parcelaUm = lerDouble("Informe um valor para a primeira parcela:");
        double parcelaDois  = lerDouble("Informe um valor para a segunda parcela:");
        return parcelaUm + parcelaDois;
    }

    public static double subtrair() {
        double aditivo = lerDouble("Informe um valor para o termo aditivo:");
        double subtrativo  = lerDouble("Informe um valor para o termo subtrativo:");
        return aditivo - subtrativo;
    }

    public static double multiplicar() {
        double fatorUm = lerDouble("Informe um valor para o primeiro fator:");
        double fatorDois  = lerDouble("Informe um valor para o segundo fator:");
        return fatorUm * fatorDois;
    }

    public static double dividir() {
        double dividendo = lerDouble("Informe um valor para o dividendo:");
        double divisor  = lerDouble("Informe um valor para o divisor:");
        return dividendo / divisor;
    }

    public static int fatorial(int numero) {
        if (numero == 1) {
            return 1;
        } else {
            return numero * fatorial(numero - 1);
        }
    }

    public static int exponenciacao() {
        int base = lerInt("Informe um valor para a base");
        int expoente  = lerInt("Informe um valor para o expoente:");
        int resultado = base;
        for ( int i = expoente; i > 1; i--) {
            resultado *= base;
        }
        return resultado;
    }

    public static int lerInt(String msg) {
        System.out.println(msg);
        return new Scanner(System.in).nextInt();
    }

    public static double lerDouble(String msg) {
        System.out.println(msg);
        return new Scanner(System.in).nextDouble();
    }


}
