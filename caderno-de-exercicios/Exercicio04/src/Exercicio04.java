import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double celsius = lerDouble("Informe a temperatura em graus Celsius.", scanner);
        double fahrenheit = farenheit(celsius);
        System.out.println("A temperatura convertida em Fahrenheit: " + fahrenheit);
        scanner.close();
    }

    public static double farenheit(double celsius){
        return ((9 * celsius) + 160) / 5;
    }

    public static double lerDouble(String msg, Scanner scanner) {
        System.out.println(msg);
        return scanner.nextDouble();
    }
}
