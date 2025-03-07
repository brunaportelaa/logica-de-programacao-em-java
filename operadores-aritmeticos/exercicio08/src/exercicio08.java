import java.util.Scanner;

public class exercicio08 {

    public static void main(String args[]) {
        double base = lerDouble("Forneça a base do triângulo:");
        double altura = lerDouble("Forneça a altura do triângulo:");
        double area = calcularArea(base, altura);

        System.out.println("A área do triângulo é: " + area);

    }

    public static double calcularArea(double base, double altura) {
        return ( base * altura ) / 2;
    }

    public static double lerDouble(String msg) {
        System.out.println(msg);
        return lerDouble();
    }

    public static double lerDouble() {
        return new Scanner(System.in).nextDouble();
    }

}
