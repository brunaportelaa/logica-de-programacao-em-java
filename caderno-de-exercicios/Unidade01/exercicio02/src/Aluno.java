public class Aluno {

    final double NOTA_DE_CORTE = 7.0;
    String nome;
    double notaPortugues;
    double notaMatematica;

    public static double getMedia(Aluno aluno){
        return (aluno.notaMatematica + aluno.notaPortugues) / 2;
    }

    public static boolean isAprovado(Aluno aluno){
        if (getMedia(aluno) > aluno.NOTA_DE_CORTE) {
            return true;
        } else {
            return false;
        }
    }
}
