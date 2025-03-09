import java.util.Scanner;

public class exercicio79 {
    public static void main(String[] args) {
        String estadoCivil = lerString("Informe S para solteiro, C para casado, V para viúvo, D para divorciado ou E para desquitado: ");
        exibirEstadoCivil(estadoCivil.toUpperCase());
    }

    public static void exibirEstadoCivil(String estadoCivil) {
        switch (estadoCivil) {
            case "S":
                System.out.println("Solteiro.");
                break;
            case "C":
                System.out.println("Casado.");
                break;
            case "V":
                System.out.println("Viúvo.");
                break;
            case "D":
                System.out.println("Divorciado.");
                break;
            case "E":
                System.out.println("Desquitado.");
                break;
            default:
                System.out.println("Por favor, informe um valor válido (S para solteiro, C para casado, V para viúvo, D para divorciado ou E para desquitado)");
                break;
        }
    }

    public static String lerString(String msg) {
        System.out.println(msg);
        return lerString();
    }

    public static String lerString() {
        return new Scanner(System.in).next();
    }
}
