import java.util.ArrayList;

public class Printer {
     public static void print(Usuario usuario) {
         System.out.println("---------DADOS DO USUÁRIO---------");
         System.out.println(usuario.toString());
         print(usuario.franquias);
     }

     public static void print(ArrayList<Franquia> franquias) {
         for (Franquia franquia : franquias) {
             print(franquia);
         }
     }

     public static void print(Franquia franquia) {
         System.out.println(franquia.toString());
     }
}
