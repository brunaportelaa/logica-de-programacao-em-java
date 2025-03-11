import java.util.Scanner;

public class exercicio03 {

    public static void main(String[] args) {
        int[] dadosUsuario = gerarArray(5);
        printArray(dadosUsuario);

        int media = calcularMedia(dadosUsuario);
        System.out.println("A média dos componentes do array é: " + media);

        int impares = contarImpares(dadosUsuario);
        System.out.println("A quantidade de números ímpares é de: "+ impares);

    }

    public static int calcularMedia(int[] array) {
        int soma = 0;
        for (int i = 0; i < array.length; i++) {
            soma += array[i];
        }
        return soma / array.length;
    }

    public static int contarImpares(int[] array) {
        int impares = 0;
        for (int i = 0; i < array.length; i++) {
            if ((array[i] % 2) != 0) {
                impares++;
            }
        }
        return impares;
    }


    public static int[] gerarArray(int length) {
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = lerInt("Por favor, insira um número inteiro para compor o array:");
        }
        return array;
    }


    public static void printArray(int[] array) {
        for (int k = 0; k < array.length; k++) {
            System.out.print(array[k] + " ");
        }
        System.out.println("");
    }

    public static int lerInt(String msg) {
        System.out.println(msg);
        return lerInt();
    }

    public static int lerInt() {
        return new Scanner(System.in).nextInt();
    }
}