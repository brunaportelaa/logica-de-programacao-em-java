public class ServiceStrings {
    public static String transformarCaixaAlta(String string){
        return string.toUpperCase();
    }

    public static String transformarCaixaBaixa(String string){
        return string.toLowerCase();
    }

    public static int contarCaracteres(String string){
        int qtdCaracteres = 0;
        for (int i = 0; i < string.length(); i++){
            qtdCaracteres++;
        }
        return qtdCaracteres;
    }

    public static boolean isEqualTo(String stringOriginal, String stringComparativa) {
        if (stringOriginal.equals(stringComparativa)) {
            return true;
        } else {
            return false;
        }
    }

    public static int contarPalavras(String string){
        int qtdPalavras = 0;
        String[] palavras = string.split(" ");
        for (String palavra : palavras) {
            qtdPalavras++;
        }

        return qtdPalavras;
    }

}
