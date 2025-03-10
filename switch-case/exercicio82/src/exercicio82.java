import java.util.Scanner;

public class exercicio82 {

    static final int CODIGO_SUL = 1;
    static final int CODIGO_NORTE = 2;
    static final int CODIGO_LESTE = 3;
    static final int CODIGO_OESTE = 4;
    static final int CODIGO_NORDESTE_MIN = 5;
    static final int CODIGO_NORDESTE_MAX = 6;
    static final int CODIGO_SUDESTE_MIN = 7;
    static final int CODIGO_SUDESTE_MAX = 9;
    static final int CODIGO_CENTROOESTE_MIN = 10;
    static final int CODIGO_CENTROOESTE_MAX = 20;
    static final int CODIGO_NOROESTE_MIN = 25;
    static final int CODIGO_NOROESTE_MAX = 35;

    public static void main(String[] args) {

        System.out.println("Informe o código da região: ");
        int codigoRegiao = lerInt();

        System.out.println("Informe o preço da compra: ");
        double preco = lerDouble();

        String regiao = identificarEstado(codigoRegiao);

        System.out.println("R$" + preco + " - " + regiao);

    }

    public static String identificarEstado(int codigoRegiao){
        String regiao = "";
        switch (codigoRegiao) {
            case CODIGO_SUL:
                regiao = "Sul";
                break;
            case CODIGO_NORTE:
                regiao = "Norte";
                break;
            case CODIGO_LESTE:
                regiao = "Leste";
                break;
            case CODIGO_OESTE:
                regiao = "Oeste";
                break;
            default:
                if ( codigoRegiao >= CODIGO_NORDESTE_MIN && codigoRegiao <= CODIGO_NORDESTE_MAX) {
                    regiao = "Nordeste";
                } else {
                    if ( codigoRegiao >= CODIGO_SUDESTE_MIN && codigoRegiao <= CODIGO_SUDESTE_MAX ){
                        regiao = "Sudeste";
                    } else {
                        if ( codigoRegiao >= CODIGO_CENTROOESTE_MIN && codigoRegiao <= CODIGO_CENTROOESTE_MAX) {
                            regiao = "Centro-Oeste";
                        } else {
                            if (codigoRegiao >= CODIGO_NOROESTE_MIN && codigoRegiao <= CODIGO_NOROESTE_MAX) {
                                regiao = "Noroeste";
                            } else {
                                System.out.println("Código inválido.");
                            }
                        }
                    }
                }
        }
        return regiao;
    }

    public static int lerInt() {
        return new Scanner(System.in).nextInt();
    }

    public static double lerDouble() {
        return new Scanner(System.in).nextDouble();
    }
}

