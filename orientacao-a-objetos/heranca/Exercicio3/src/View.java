public class View {
    public static Retangulo cadastrarRetangulo() {
        double base = Leitor.lerDouble("Informe a base:");
        double altura = Leitor.lerDouble("Informe a altura:");
        Retangulo retangulo = new Retangulo(base, altura);
        return retangulo;
    }

    public static TrianguloRetangulo cadastrarTrianguloRetangulo(){
        double base = Leitor.lerDouble("Informe a base:");
        double altura = Leitor.lerDouble("Informe a altura:");
        TrianguloRetangulo trianguloRetangulo = new TrianguloRetangulo(base, altura);
        return trianguloRetangulo;
    }
}
