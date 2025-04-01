import java.util.Arrays;

public class Anatel {
   Franquia []franquias;

   public Anatel() {
       this.franquias = new Franquia[0];
   }

    public void adicionar (Franquia franquia){
        Franquia [] franquiasTemp = Arrays.copyOf(this.franquias, this.franquias.length + 1);
        int i = 0;

        for(Franquia fran : franquias){
            franquiasTemp[i] = fran;
            i++;
        }
        franquiasTemp[i] = franquia;
        this.franquias = franquiasTemp;
    }

   public int countFranquiasByGB(int limite){
       int count = 0;
       for(Franquia franquia : franquias){
           if(franquia.quantidadeGB > limite){
               count++;
           }
       }
       return count;
   }

   public boolean validarFranquia(Franquia novaFranquia) {
       for (Franquia franquia : this.franquias) {
           if (franquia.codigo.equals(novaFranquia.codigo)) {
               return false;
           }
        }
       return true;
    }
}