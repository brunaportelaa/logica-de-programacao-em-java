public class View {

    public static RegistroProgramas cadastrarRegistroProgramas(){
        RegistroProgramas registroProgramas = new RegistroProgramas();
        boolean continuar = true;
        while (continuar) {
            Programa programa = cadastrarPrograma();
            while (!registroProgramas.adicionar(programa)) {
                System.out.println("Já existe um programa com esse nome. Por favor cadastre outro.");
                programa = cadastrarPrograma();
            }
            registroProgramas.adicionar(programa);
            int desejaContinuar = Leitor.lerInt("Deseja continuar?\n[1] - SIM\n[2] - NÃO", 1, 2);
            if (desejaContinuar == 2) {
                continuar = false;
            }
        }
        return registroProgramas;
    }

    public static Programa cadastrarPrograma() {
        System.out.println("-----CADASTRO DE PROGRAMA-----");
        int opcao = Leitor.lerInt("Linguagem: \n[1] - C++\n[2] - .net", 1, 2);
        String nome = Leitor.lerString("Nome: ");
        int qtdLinhas = Leitor.lerInt("Quantidade de linhas: ", 1);
        if (opcao == 1) {
            ProgramaCMaisMais programa = new ProgramaCMaisMais(nome, qtdLinhas);
            cadastrarPrograma(programa);
            return programa;
        } else {
            ProgramaDotNet programa = new ProgramaDotNet(nome, qtdLinhas);
            cadastrarPrograma(programa);
            return programa;
        }
    }

    public static ProgramaCMaisMais cadastrarPrograma(ProgramaCMaisMais programa) {
        int qtdBibliotecas = Leitor.lerInt("Quantidade de bibliotecas: ");
        int qtdFuncoes = Leitor.lerInt("Quantidade de funções: ");
        programa.setQtdBibliotecas(qtdBibliotecas);
        programa.setQtdFuncoes(qtdFuncoes);
        return programa;
    }

    public static ProgramaDotNet cadastrarPrograma(ProgramaDotNet programa) {
        String pacote = Leitor.lerString("Pacote: ");
        int qtdMetodos = Leitor.lerInt("Quatidade de métodos: ");
        programa.setPacote(pacote);
        programa.setQtdMetodos(qtdMetodos);
        return programa;
    }
}
