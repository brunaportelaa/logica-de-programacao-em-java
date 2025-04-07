import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        boolean continuar = true;
        Armazenamento armazenamento = new Armazenamento();

        while (continuar) {
            int operacao = Leitor.lerInt("\n-----------\nQual operação deseja realizar?\n[1] - Cadastrar pastas\n[2] - Apresentar todas as pastas\n[3] - Apresentar todos os documentos de todas as pastas.\n[4] - Apresentar todos os documentos das pastas de um determinado ano.\n[5] - Exibir o tamanho em bytes de todo o armazenamento da empresa.\n[6] - Exibir todos os documentos de uma determinada extensão.\nDigite qualquer outro número para encerrar o programa.");

            switch (operacao) {
                case 1:
                    armazenamento = View.cadastrarArmazenamento();
                    break;
                case 2:
                    Printer.print(armazenamento);
                    break;
                case 3:
                    for (Pasta pasta : armazenamento.getPastas()) {
                        Printer.print(pasta.getDocumentos());
                    }
                    break;
                case 4:
                    int ano = Leitor.lerInt("Insira para o qual gostaria de exibir os documentos", "Valor inválido", 1900);
                    ArrayList<Pasta> pastasSelecionadas = armazenamento.sortPastasByAno(ano);
                    Printer.print(pastasSelecionadas);
                    break;
                case 5:
                    System.out.println("O armazenamento total da empresa é de: " + armazenamento.getTotalBytes() + " bytes");
                    break;
                case 6:
                    System.out.println("Para qual extensão gostaria de exibir os arquivos?");
                    int extensao = Leitor.lerInt("Informe a extensão para qual gostaria de exibir os documentos:\n[1] - .png\n[2] - .pdf\n[3] - .jpeg\n[4] - .jpg", "Valor inválido", 1, 4);
                    Printer.print(armazenamento.sortDocsByExtensao(extensao));
                    break;
                default:
                    System.out.println("Encerrando o programa.");
                    continuar = false;
            }
//
        }
    }
}
