

public class Anatel {
   Franquia []franquias;

    public void adicionar (Franquia franquia){
        if(franquias == null){
            franquias = new Franquia[0];
        }
        Franquia [] franquiasTemp = new Franquia[franquias.length];
        int i = 0;
        for(Franquia fran : franquias){
            franquiasTemp[i++] = fran;
        }
        franquiasTemp[i] = franquia;
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
}