public class Aluno {
    String nome;
    long matricula;
    double notaUm;
    double notaDois;
    boolean bolsista;// regular - bolsista

    public double getMedia(){
        return (notaUm * 0.3 + notaDois * 0.7);
    }

    public boolean isAprovado(){
        return getMedia() > 7;
    }
}
