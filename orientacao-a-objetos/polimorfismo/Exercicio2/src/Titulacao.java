public enum Titulacao {
   MESTRE(1), DOUTOR(2), LICENCIADO(3), POS_GRADUADO(4);

   private final int titulacaoCodigo;

   Titulacao(int titulacaoCodigo){
       this.titulacaoCodigo = titulacaoCodigo;
   }

    public int getTitulacaoCodigo() {
       return this.titulacaoCodigo;
    }

    public static Titulacao getTitulacaoByCodigo(int codigo) {
       switch (codigo) {
           case 1:
               return MESTRE;
           case 2:
               return DOUTOR;
           case 3:
               return LICENCIADO;
           case 4:
               return POS_GRADUADO;
           default:
               return null;
       }
    }
}
