public class Printer {
     public static void print(SistemaControleFranquias anatel) {
         System.out.println("---------SISTEMA DE CONTROLE DE FRANQUIAS---------");
         System.out.println(anatel.toString());
         print(anatel.franquias);
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
