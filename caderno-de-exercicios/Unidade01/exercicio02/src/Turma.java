
import java.util.ArrayList;

public class Turma {
    ArrayList<Aluno> alunos = new ArrayList<Aluno>();

    public double getMedia(){
        double soma = 0;
        for (Aluno aluno : alunos) {
            soma += Aluno.getMedia(aluno);
        }
        return soma / alunos.size();
    }

}
