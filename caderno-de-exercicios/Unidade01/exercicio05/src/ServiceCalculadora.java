public class ServiceCalculadora {
    public static double adicionar(double parcelaUm, double parcelaDois) {
        return parcelaUm + parcelaDois;
    }

    public static double subtrair(double aditivo, double subtrativo) {
        return aditivo - subtrativo;
    }

    public static double multiplicar(double fatorUm, double fatorDois) {
        return fatorUm * fatorDois;
    }

    public static double dividir(double dividendo, double divisor) {
        return dividendo / divisor;
    }

    public static int fatorial(int numero) {
        if (numero == 1) {
            return 1;
        } else {
            return numero * fatorial(numero - 1);
        }
    }

    public static int exponenciacao(int base, int expoente) {
        int resultado = base;
        for ( int i = expoente; i > 1; i--) {
            resultado *= base;
        }
        return resultado;
    }
}
