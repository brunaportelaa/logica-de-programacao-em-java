import java.lang.reflect.Field;
import java.util.ArrayList;

public class DatabaseEstados {
    public static final Estado ACRE = new Estado("Acre", 1, "AC");
    public static final Estado ALAGOAS = new Estado("Alagoas", 2, "AL");
    public static final Estado AMAPA = new Estado("Amapá", 3, "AP");
    public static final Estado AMAZONAS = new Estado("Amazonas", 4, "AM");
    public static final Estado BAHIA = new Estado("Bahia", 5, "BA");
    public static final Estado CEARA = new Estado("Ceará", 6, "CE");
    public static final Estado DISTRITO_FEDERAL = new Estado("Distrito Federal", 7, "DF");
    public static final Estado ESPIRITO_SANTO = new Estado("Espírito Santo", 8, "ES");
    public static final Estado GOIAS = new Estado("Goiás", 9, "GO");
    public static final Estado MARANHAO = new Estado("Maranhão", 10, "MA");
    public static final Estado MATO_GROSSO = new Estado("Mato Grosso", 11, "MG");
    public static final Estado MATO_GROSSO_DO_SUL = new Estado("Mato Grosso do Sul", 12, "MS");
    public static final Estado MINAS_GERAIS = new Estado("Minas Gerais", 13, "MG");
    public static final Estado PARA = new Estado("Pará", 14, "PA");
    public static final Estado PARAIBA = new Estado("Paraíba", 15, "PB");
    public static final Estado PARANA = new Estado("Paraná", 16, "PR");
    public static final Estado PERNAMBUCO = new Estado("Pernambuco", 17, "PE");
    public static final Estado PIAUI = new Estado("Piauí", 18, "PI");
    public static final Estado RIO_DE_JANEIRO = new Estado("Rio de Janeiro", 19, "RJ");
    public static final Estado RIO_GRANDE_DO_NORTE = new Estado("Rio Grande do Norte", 20, "RN");
    public static final Estado RIO_GRANDE_DO_SUL = new Estado("Rio Grande do Sul", 21, "RS");
    public static final Estado RONDONIA = new Estado("Rondônia", 22, "RO");
    public static final Estado RORAIMA = new Estado("Roraima", 23, "RR");
    public static final Estado SANTA_CATARINA = new Estado("Santa Catarina", 24, "SC");
    public static final Estado SAO_PAULO = new Estado("São Paulo", 25, "SP");
    public static final Estado SERGIPE = new Estado("Sergipe", 26, "SE");
    public static final Estado TOCANTINS = new Estado("Tocantins", 27, "TO");

    public ArrayList<Estado> getAllEstados(){
        ArrayList<Estado> estados = new ArrayList<>();
        for (Field field : this.getClass().getDeclaredFields()) {
            try {
                Estado estado = (Estado) field.get(this);
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }
        return estados;
    }
}
