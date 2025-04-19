public class App {
    public static void main(String[] args) {

        Retangulo retangulo = View.cadastrarRetangulo();
        TrianguloRetangulo trianguloRetangulo = View.cadastrarTrianguloRetangulo();

        System.out.println("A área do retângulo é: " + retangulo.calcularArea());
        System.out.println("A área do triângulo retângulo é: " + trianguloRetangulo.calcularArea());
        System.out.println("A hipotenusa do triângulo retângulo é: " + trianguloRetangulo.calcularArea());

    }
}
