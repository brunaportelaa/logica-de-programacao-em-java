public class ServiceTurma {

    public static void calcularBolsistas(Turma turma) {
        for ( int i = 0; i < turma.totalAlunos; i++){
            if (turma.alunos[i].bolsista) {
                turma.totalBolsistas++;
            } else {
                turma.totalRegulares++;
            }
        }
    }

    public static Aluno[] findBySituacao(Aluno[] alunos, boolean situacao){
        int qtdSituacao =  countBySituacao(alunos, situacao);
        Aluno[] alunoSituacao = new Aluno[qtdSituacao];
        for ( int i = 0, j = 0; i < alunos.length; i++){ //50 alunos
            if (alunos[i].bolsista == situacao) {
                alunoSituacao [j] = alunos[i];
                j++;
            }
        }
        return alunoSituacao;
    }

    public static int countBySituacao(Aluno[] alunos, boolean situacao) {
        int qtdSituacao = 0;
        for ( int i = 0; i < alunos.length; i++){
            if (alunos[i].bolsista == situacao) {
                qtdSituacao++;
            }
        }
        return  qtdSituacao;
    }

    public static double calcularMedia (double notaUm,double notaDois){

        return 0;
    }
    public static double calcularMedia(Aluno aluno){
        return 0;
    }

}
