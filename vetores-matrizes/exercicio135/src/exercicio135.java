import java.util.Scanner;

public class exercicio135 {

    public static void main(String[] args) {

        int[][] matriz = {
                {5, 2, 3, 9},
                {4, 1, 3, 2},
                {9, 7, 1, 3},
                {6, 3, 4, 4}
        };

        int operacao = lerInt("Informe a operação que deseja realizar (1, 2, 3 ou 4):");

        int soma = 0;

        if(operacao == 1) {
            soma = somarLinha(matriz);
        } else {
            if (operacao == 2) {
                soma = somarColuna(matriz);
            } else {
                if (operacao == 3) {
                    soma = somarDiagonalPrimaria(matriz);
                } else  {
                    if (operacao == 4) {
                        soma = somarDiagonalSecundaria(matriz);
                    } else {
                        System.out.println("Por favor, insira uma operação válida.");
                    }
                }
            }
        }

        printInt(soma);

    }

    public static int somarLinha(int[][] matriz){
        int soma = 0;
        for (int i = 0; i < matriz[3].length; i++) {
            soma += matriz[3][i];
        }
        return soma;
    }

    public static int somarColuna(int[][] matriz){
        int soma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (j == 1) {
                    soma += matriz[i][j];
                }
            }
        }
        return soma;
    }

    public static int somarDiagonalPrimaria(int[][] matriz){
        int soma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == j) {
                    soma += matriz[i][j];
                }
            }
        }
        return soma;
    }

    public static int somarDiagonalSecundaria(int[][] matriz){
        int soma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i + j == 3) {
                    soma += matriz[i][j];
                }
            }
        }
        return soma;
    }



    public static void printInt(int inteiro){
        System.out.println(inteiro);
    }

    public static int lerInt(String msg) {
        System.out.println(msg);
        return lerInt();
    }

    public static int lerInt() {
        return new Scanner(System.in).nextInt();
    }

}
