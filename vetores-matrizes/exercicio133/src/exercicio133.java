import java.util.Scanner;

public class exercicio133 {
    public static void main(String[] args) {

        int[][] matriz = {
                {1, 2},
                {4, 5},
                {7, 8}
        };

        int soma = calcularSoma(matriz);
        printInt(soma);
    }


    public static int calcularSoma(int[][] matriz){
        int soma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                soma += matriz[i][j];
            }
        }
        return soma;
    }

    public static void printInt(int inteiro){
        System.out.println(inteiro);
    }
}
