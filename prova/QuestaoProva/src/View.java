public class View {

    public static Armazenamento cadastrarArmazenamento() {
        Armazenamento armazenamento = new Armazenamento();
        boolean continuar = true;
        do {
            armazenamento.adicionar(cadastrarPasta());
            int opcao = Leitor.lerInt("Gostaria de cadastrar mais uma pasta?\n[1] - Sim\n[2] - Não", "Valor inválido", 1, 2);
            if (opcao == 2) {
                continuar = false;
            }
        } while (continuar);
        return armazenamento;
    }

    public static Pasta cadastrarPasta() {
        boolean continuar = true;
        int ano = Leitor.lerInt("Insira o ano da pasta", "Valor inválido", 1900);
        Pasta pasta = new Pasta(ano);
        do {
            pasta.adicionar(cadastrarDocumento());
            int opcao = Leitor.lerInt("Gostaria de cadastrar mais um documento?\n[1] - Sim\n[2] - Não", "Valor inválido", 1, 2);
            if (opcao == 2) {
                continuar = false;
            }
        } while (continuar);
        return pasta;
    }

    public static Documento cadastrarDocumento() {
        Documento documento = new Documento();
        documento.setNome(Leitor.lerString("Informe o título do documento: "));
        documento.setTamanho(Leitor.lerInt("Informe o tamanho em bytes do documento: ", "Por favor, insira um tamanho válido para o documento", 1));
        documento.setExtensao(Leitor.lerInt("Informe a extensão do documento:\n[1] - .png\n[2] - .pdf\n[3] - .jpeg\n[4] - .jpg", "Valor inválido", 1, 4));
        return documento;
    }


}
