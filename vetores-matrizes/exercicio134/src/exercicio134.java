public class exercicio134 {

    public static void main(String[] args) {

        int[][] matriz = {
                {1, 2, 3, 4},
                {4, 1, 2, 3},
                {3, 4, 1, 2},
                {2, 3, 4, 1}
        };

        int soma = somarElementos(matriz);
        printInt(soma);
    }

    public static int somarElementos(int[][] matriz){
        int soma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (j == i - 1){
                    soma += matriz[i][j];
                }
            }
        }
        return soma;
    }

    public static void printInt(int inteiro){
        System.out.println(inteiro);
    }

}
