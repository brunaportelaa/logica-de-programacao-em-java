public class Printer {
     public static void print(Anatel anatel) {
         System.out.println("---------SISTEMA DE CONTROLE DE FRANQUIAS ANATEL---------");
         print(anatel.getFranquias());
     }

     public static void print(Franquia[] franquias) {
         for (Franquia franquia : franquias) {
             print(franquia);
             System.out.println("___");
         }
     }

     public static void print(Franquia franquia) {
         System.out.println(franquia.toString());
     }
}
