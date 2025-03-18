public class Printer {
    public static void print(Aluno aluno){
        System.out.println("O nome do aluno é: " + aluno.nome);
        System.out.println("A nota de Português foi: " + aluno.notaPortugues);
        System.out.println("A nota de Matemática foi: " + aluno.notaMatematica);
        System.out.println("A média do aluno foi de: " + aluno.getMedia(aluno));
        System.out.println("A situação do aluno é: " + (aluno.isAprovado(aluno) ? "APROVADO" : "REPROVADO"));
    }
}
