import java.util.ArrayList;

public class Printer {
     public static void print(Usuario usuario) {
         System.out.println("---------DADOS DO USUÁRIO---------");
         System.out.println("ID: " + usuario.id + "\n");
         System.out.println("FRANQUIAS: ");
         print(usuario.franquias);
     }

     public static void print(ArrayList<Franquia> franquias) {
         for (Franquia franquia : franquias) {
             print(franquia);
         }
     }

     public static void print(Franquia franquia) {
         System.out.println("Empresa: " + franquia.nomeEmpresa);
         System.out.println("Quantidade de GB: "+ franquia.qtdGB);
         System.out.println("Preço: " + franquia.preco);
         System.out.println("Data de expiração: " + franquia.diaExpiracao);
         System.out.println("________\n");
     }
}
