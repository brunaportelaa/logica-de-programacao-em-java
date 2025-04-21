import java.util.ArrayList;

public class View {
    public static Pessoa cadastrarPessoa() {
        System.out.println("-----CADASTRO DE PESSOA-----");
        String nome = Leitor.lerString("Nome:");
        int codigo = Leitor.lerInt("Código: ", 0);
        double salario = Leitor.lerDouble("Salário: ", 0);
        Pessoa pessoa = new Pessoa(nome, codigo, salario);
        return pessoa;
    }

    public static ListaPessoas cadastrarPessoas() {
        ListaPessoas pessoas = new ListaPessoas();
        boolean continuar = true;
        while (continuar) {
            Pessoa novaPessoa = cadastrarPessoa();

            while (!pessoas.add(novaPessoa)) {
                System.out.println("Pessoa com esse código já foi cadastrada");
                novaPessoa = cadastrarPessoa();
            }

            int opcao = Leitor.lerInt("Gostaria de continuar cadastrando pessoas? Digite 1 para continuar ou qualquer outro número para encerrar");
            if (opcao != 1) {
                continuar = false;
            }
        }
        return pessoas;
    }
}
