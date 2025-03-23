import java.util.ArrayList;

public class View {
    public static UnidadeAdministrativa lerUnidadeAdministrativa(UnidadeAdministrativa unidade){
        System.out.println("CADASTRO DE UNIDADE ADMINISTRATIVA");
        unidade.nome = Leitor.lerString("nome: ");
        unidade.setAcoes(Leitor.lerInt("Quantas ações deseja incluir?"));
        return unidade;
    }


    public static Acao lerAcao(Acao acao) {
        acao.descricao = Leitor.lerString("Descrição: ");
        acao.ano = Leitor.lerInt("Ano: ", "Ano Inválido, por favor informe um entre 2015 e 2020", 2015, 2020);
        acao.mes = Leitor.lerInt("Mês: ", "Mês inválido, por favor informe um número entre 1 e 12", 1, 12);
        return acao;
    }
}
