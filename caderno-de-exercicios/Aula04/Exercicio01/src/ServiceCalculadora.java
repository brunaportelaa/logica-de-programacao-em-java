public class ServiceCalculadora {
    public static double adicionar() {
        double parcelaUm = Leitor.lerDouble("Informe um valor para a primeira parcela:");
        double parcelaDois  = Leitor.lerDouble("Informe um valor para a segunda parcela:");
        return parcelaUm + parcelaDois;
    }

    public static double subtrair() {
        double aditivo = Leitor.lerDouble("Informe um valor para o termo aditivo:");
        double subtrativo  = Leitor.lerDouble("Informe um valor para o termo subtrativo:");
        return aditivo - subtrativo;
    }

    public static double multiplicar() {
        double fatorUm = Leitor.lerDouble("Informe um valor para o primeiro fator:");
        double fatorDois  = Leitor.lerDouble("Informe um valor para o segundo fator:");
        return fatorUm * fatorDois;
    }

    public static double dividir() {
        double dividendo = Leitor.lerDouble("Informe um valor para o dividendo:");
        double divisor  = Leitor.lerDouble("Informe um valor para o divisor:");
        return dividendo / divisor;
    }

}
