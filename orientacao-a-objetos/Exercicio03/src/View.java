import java.util.ArrayList;

public class View {
    public static Universidade lerUniversidade(){
        System.out.println("CADASTRO DE UNIVERSIDADE - LOGÍSTICA DE LABORATÓRIOS");
        Universidade universidade = new Universidade();
        universidade.nome = Leitor.lerString("Informe o nome da universidade: ");
        universidade.laboratorios = lerLaboratorios(universidade);
        return universidade;
    }

    public static Laboratorio[] lerLaboratorios(Universidade universidade) {
        int qtdLaboratorios = Leitor.lerInt("Quantos laboratórios serão cadastrados para " + universidade.nome + "?");
        Laboratorio[] laboratorios = new Laboratorio[qtdLaboratorios];
        for (int i = 0; i < qtdLaboratorios; i++) {
            laboratorios[i] = lerLaboratorio();
        }
        return laboratorios;
    }

    public static Laboratorio lerLaboratorio() {
        Laboratorio laboratorio = new Laboratorio();
        laboratorio.nome = Leitor.lerString("Qual é o nome do laboratório?");
        laboratorio.responsavel = lerProfissional();
        laboratorio.local = Leitor.lerString("Informe o local do laboratório.");
        laboratorio.itens = lerItens(laboratorio);
        return laboratorio;
    }

    public static Profissional lerProfissional() {
        Profissional profissional = new Profissional();
        profissional.nome = Leitor.lerString("Informe o nome do profissional:");
        profissional.matricula = Leitor.lerInt("Informe a matrícula do profissional:");
        profissional.cargo = Leitor.lerInt("Informe 1 para cargo TÉCNICO e 2 para cargo ANALISTA","Valor inválido. Informe 1 para cargo TÉCNICO e 2 para cargo ANALISTA", 1, 2);
        return profissional;
    }

    public static Item[] lerItens(Laboratorio laboratorio) {
        int qtdItens = Leitor.lerInt("Quantos itens serão cadastrados para " + laboratorio.nome + "?");
        Item[] itens = new Item[qtdItens];
        for (int i = 0; i < qtdItens; i++) {
            itens[i] = lerItem();
        }
        return itens;
    }

    public static Item lerItem() {
        Item item = new Item();
        item.descricao = Leitor.lerString("Informe a descrição do item: ");
        item.codigo = Leitor.lerInt("Informe o código do item: ", 1);
        item.preco = Leitor.lerDouble("Informe o preço do item: ", 0);
        item.tipo = Leitor.lerInt("Informe 1 para cargo TECNOLOGIA e 2 para cargo OUTROS","Valor inválido. Informe 1 para cargo TECNOLOGIA e 2 para cargo OUTROS", 1, 2);
        return item;
    }

}
