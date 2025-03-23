import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Aplicacao {
    public static void main(String[] args) {

        Universidade universidade = View.lerUniversidade();

        int tipoRelatorio = Leitor.lerInt("Qual relatório deseja gerar? \n1 - Geral\n2 - Por tipo de responsável\n3 Relatório de itens - Por tipo de item\n4 - Relatório de custos\n5 - Localidade e quantitativo de itens");

        switch (tipoRelatorio) {
            case 1:
                break;
            case 2:
                // relatório por responsável
                break;
            case 3:
                //Itens por tipo de item
                break;
            case 4:
                //Custo total
                break;
            case 5:
                //Localidade e quantitativo de itens geral
                break;
            default:
                //Mensagem de erro
        }
    }
}
