import java.sql.SQLOutput;
import java.util.ArrayList;

public class Printer {
    public static void print(Universidade universidade) {
        System.out.println("---RELATÓRIO DE LOGÍSTICA---");
        System.out.println(universidade.nome);
        print(universidade.laboratorios);
    }

    public static void print(Laboratorio[] laboratorios){
        for (Laboratorio laboratorio : laboratorios) {
            print(laboratorio);
        }
    }

    public static void print(Laboratorio laboratorio) {
        System.out.println(laboratorio.toString());
        System.out.println("ITENS:");
        print(laboratorio.itens);
    }

    public static void print(Item[] itens){
        for (Item item : itens) {
            print(item);
        }
    }

    public static void print(Item item) {
        System.out.println(item.toString());
    }


}
