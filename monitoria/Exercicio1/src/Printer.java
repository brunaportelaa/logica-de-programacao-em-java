public class Printer {
     public static void print(Anatel anatel) {
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
