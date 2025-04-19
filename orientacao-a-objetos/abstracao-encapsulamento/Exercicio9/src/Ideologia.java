public class Ideologia {
    public static final int NULO = 0;
    public static final int EXTREMA_DIREITA = 1;
    public static final int DIREITA = 2;
    public static final int CENTRO_DIREITA = 3;
    public static final int CENTRO = 4;
    public static final int CENTRO_ESQUERDA = 5;
    public static final int ESQUERDA = 6;

    private Ideologia() {}

    public static String getTitulo(int codigo) {
        switch (codigo) {
            case 1:
                return "Extrema Direita";
            case 2:
                return "Direita";
            case 3:
                return "Centro-Direita";
            case 4:
                return "Centro";
            case 5:
                return "Centro-Esquerda";
            case 6:
                return "Esquerda";
            default:
                return "";
        }
    }
}