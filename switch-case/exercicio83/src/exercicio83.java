import java.util.Scanner;

public class exercicio83 {

    public static void main(String[] args) {
        int operacao = lerInt("Por favor, escolha uma operação: 1 - Adição, 2 - Subtração, 3 - Multiplicação, 4 - Divisão");
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
            default:
                System.out.println("Por favor, informe uma operação válida.");
        }
    }

    public static double adicionar() {
        double parcelaUm = lerDouble("Informe um valor para a primeira parcela:");
        double parcelaDois  = lerDouble("Informe um valor para a segunda parcela:");
        double soma = parcelaUm + parcelaDois;
        return soma;
    }

    public static double subtrair() {
        double aditivo = lerDouble("Informe um valor para o termo aditivo:");
        double subtrativo  = lerDouble("Informe um valor para o termo subtrativo:");
        double diferenca = aditivo - subtrativo;
        return diferenca;
    }

    public static double multiplicar() {
        double fatorUm = lerDouble("Informe um valor para o primeiro fator:");
        double fatorDois  = lerDouble("Informe um valor para o segundo fator:");
        double produto = fatorUm * fatorDois;
        return produto;
    }

    public static double dividir() {
        double dividendo = lerDouble("Informe um valor para o dividendo:");
        double divisor  = lerDouble("Informe um valor para o divisor:");
        double quociente = dividendo / divisor;
        return quociente;
    }

    public static int lerInt(String msg) {
        System.out.println(msg);
        return lerInt();
    }

    public static int lerInt() {
        return new Scanner(System.in).nextInt();
    }

    public static double lerDouble(String msg) {
        System.out.println(msg);
        return lerDouble();
    }

    public static double lerDouble() {
        return new Scanner(System.in).nextDouble();
    }

}
