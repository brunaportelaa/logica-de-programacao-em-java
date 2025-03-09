import java.util.Scanner;

public class exercicio78 {
    public static void main(String[] args) {
        int i = lerInt("Informe um valor para I (1, 2, ou 3)");
        int a = lerInt("Informe um valor para A");
        int b = lerInt("Informe um valor para B");
        int c = lerInt("Informe um valor para C");

        switch (i) {
            case 1:
                exibirCrescente(a, b, c);
                break;
            case 2:
                exibirDecrescente(a, b, c);
                break;
            case 3:
                exibirMaiorAoCentro(a, b, c);
                break;
            default:
                System.out.println("Por favor, insira um valor válido para I (1, 2, ou 3)");
                break;
        }
    }

    public static void exibirDecrescente( int a, int b, int c ){
        if (a > b && a > c) {
            // A é o maior
            if ( b > c ) {
                // B é o segundo maior
                System.out.println(a + ", " + b + ", " + c);
            } else {
                // C é o segundo maior
                System.out.println(a + ", " + c + ", " + b);
            }

        } else {
            if (b > a && b > c) {
                // B é o maior
                if ( c > a ) {
                    // C é o segundo maior
                    System.out.println(b + ", " + c + ", " + a);
                } else {
                    // A é o segundo maior
                    System.out.println(b + ", " + a + ", " + c);
                }

            } else {
                // C é o maior
                if ( b > a ) {
                    // B é o segundo maior
                    System.out.println(c + ", " + b + ", " + a);
                } else {
                    // A é o segundo maior
                    System.out.println(c + ", " + a + ", " + b);
                }

            }
        }
    }

    public static void exibirCrescente( int a, int b, int c ){
        if (a < b && a < c) {
            // A é o menor
            if ( b < c ) {
                // B é o segundo menor
                System.out.println(a + ", " + b + ", " + c);
            } else {
                // C é o segundo menor
                System.out.println(a + ", " + c + ", " + b);
            }

        } else {
            if (b < a && b < c) {
                // B é o menor
                if ( c < a ) {
                    // C é o segundo menor
                    System.out.println(b + ", " + c + ", " + a);
                } else {
                    // A é o segundo menor
                    System.out.println(b + ", " + a + ", " + c);
                }

            } else {
                // C é o menor
                if ( b < a ) {
                    // B é o segundo menor
                    System.out.println(c + ", " + b + ", " + a);
                } else {
                    // A é o segundo menor
                    System.out.println(c + ", " + a + ", " + b);
                }

            }
        }

    }

    public static void exibirMaiorAoCentro( int a, int b, int c ){
        if (a > b && a > c) {
            // A é o maior
            System.out.println(b + ", " + a + ", " + c);
        } else {
            if (b > a && b > c) {
                // B é o maior
                System.out.println(c + ", " + b + ", " + a);
            } else {
                // C é o maior
                System.out.println(b + ", " + c + ", " + a);
            }
        }
    }

    public static int lerInt(String msg) {
        System.out.println(msg);
        return lerInt();
    }

    public static int lerInt() {
        return new Scanner(System.in).nextInt();
    }
}
