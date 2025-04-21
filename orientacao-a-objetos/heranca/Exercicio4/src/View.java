public class View {
    public static Pessoa cadastrarPessoa() {
        System.out.println("-----CADASTRO DE PESSOA-----");
        String nome = Leitor.lerString("Nome:");
        int codigo = Leitor.lerInt("Código: ", 0);
        double salario = Leitor.lerDouble("Salário: ", 0);
        Pessoa pessoa = new Pessoa(nome, codigo, salario);
        return pessoa;
    }
}
