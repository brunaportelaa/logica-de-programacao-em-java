public class ManipulaString {

    private final int GRANDE = 30;
    private final int MEDIA = 10;


    private String frase;


    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public ManipulaString(String frase) {
        setFrase(frase);
    }

    public int contarLetra (char letra) {
        int counter = 0;
        char[] fraseEmCaracteres = this.getFrase().toCharArray();
        for (char caractere : fraseEmCaracteres){
            if (caractere == letra) {
                counter++;
            }
        }
        return counter;
    }

    public int getLength() {
        return this.getFrase().length();
    }


    public String getQualificacao() {
        if (this.getFrase().length() < MEDIA) {
            return "PEQUENA";
        } else {
            if (this.getFrase().length() >= MEDIA && this.getFrase().length() <= GRANDE) {
                return "MEDIA";
            } else {
                return "GRANDE";
            }
        }
    }

    public int countPalavras() {
        String[] palavras = this.getFrase().split(" ");
        return palavras.length;
    }

    public String toUpperCase() {
        return this.getFrase().toUpperCase();
    }



}
