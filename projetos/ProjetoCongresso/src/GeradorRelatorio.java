import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class GeradorRelatorio {

    public static void salvarRelatorio(String titulo, String conteudo) {
        String nomeArquivo = gerarNomeArquivo(titulo);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nomeArquivo))) {
            writer.write(conteudo);
            System.out.println("Relatório salvo em: " + nomeArquivo);
        } catch (IOException e) {
            System.out.println("Erro ao salvar o relatório: " + e.getMessage());
        }
    }

    private static String gerarNomeArquivo(String titulo) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd_HH-mm-ss");
        String timestamp = dtf.format(LocalDateTime.now());
        return "relatorio_" + titulo.replaceAll(" ", "_") + "_" + timestamp + ".txt";
    }

    public static String concatenarConteudoRelatorio(ArrayList<Legislador> legisladores) {
        StringBuilder conteudo = new StringBuilder();
        for (Legislador legislador : legisladores) {
            conteudo.append(legislador.toString());
        }
        return conteudo.toString();
    }
}
