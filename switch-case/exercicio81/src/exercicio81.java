import java.util.Scanner;

public class exercicio81 {

    public static void main(String[] args) {
        char letra = lerChar("Informe uma letra do alfabeto");
        if (validarEntrada(letra)) {
            informarCategoria(Character.toUpperCase(letra));
        } else {
            System.out.println("Por favor, insira uma letra válida.");
        }


    }

    public static void informarCategoria(char letra) {
        switch (letra){
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("A letra é uma VOGAL");
                break;
            default:
                System.out.println("A letra é uma CONSOANTE.");
        }


    }

    public static boolean validarEntrada(char entrada) {
        if (Character.isLetter(entrada)) {
            return true;
        } else {
            return false;
        }
    }

    public static char lerChar(String msg) {
        System.out.println(msg);
        return lerChar();
    }

    public static char lerChar() {
        return new Scanner(System.in).next().charAt(0);
    }
}
