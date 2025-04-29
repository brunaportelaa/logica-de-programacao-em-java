import java.lang.reflect.Field;
import java.util.ArrayList;

public class DatabasePartidos {
    // Escala de Ideologias:
    // 1 = Extrema-direita | 2 = Direita | 3 = Centro-direita
    // 4 = Centro | 5 = Esquerda | 6 = Extrema-esquerda

    // --- Sem Partido ---
    public static final Partido SEM_PARTIDO = new Partido("Sem Partido", "SP", Ideologia.NULO, 00);

    // --- Direita e Extrema-Direita ---
    public static final Partido PL = new Partido("Partido Liberal", "PL", Ideologia.DIREITA, 22);
    public static final Partido REPUBLICANOS = new Partido("Republicanos", "REP", Ideologia.DIREITA, 10);
    public static final Partido NOVO = new Partido("Partido Novo", "NOVO", Ideologia.DIREITA, 30);
    public static final Partido PSC = new Partido("Partido Social Cristão", "PSC", Ideologia.EXTREMA_DIREITA, 20);
    public static final Partido PATRIOTA = new Partido("Patriota", "PATRI", Ideologia.DIREITA, 51);
    public static final Partido PP = new Partido("Partido Progressista", "PP", Ideologia.DIREITA, 11);
    public static final Partido PTB = new Partido("Partido Trabalhista Brasileiro", "PTB", Ideologia.DIREITA, 14);

    // --- Centro-Direita ---
    public static final Partido UNIAO = new Partido("União Brasil", "UNIÃO", Ideologia.CENTRO_DIREITA, 44);
    public static final Partido PSD = new Partido("Partido Social Democrático", "PSD", Ideologia.CENTRO_DIREITA, 55);
    public static final Partido PSDB = new Partido("Partido da Social Democracia Brasileira", "PSDB", Ideologia.CENTRO_DIREITA, 45);

    // --- Centro ---
    public static final Partido MDB = new Partido("Movimento Democrático Brasileiro", "MDB", Ideologia.CENTRO, 15);
    public static final Partido CIDADANIA = new Partido("Cidadania", "CID", Ideologia.CENTRO, 23);
    public static final Partido PODE = new Partido("Podemos", "PODE", Ideologia.CENTRO, 19);
    public static final Partido PMN = new Partido("Partido da Mobilização Nacional", "PMN", Ideologia.CENTRO, 33);
    public static final Partido PROS = new Partido("Partido Republicano da Ordem Social", "PROS", Ideologia.CENTRO, 90);
    public static final Partido AVANTE = new Partido("Avante", "AVANTE", Ideologia.CENTRO, 70);
    public static final Partido PV = new Partido("Partido Verde", "PV", Ideologia.CENTRO, 43);
    public static final Partido PSB = new Partido("Partido Socialista Brasileiro", "PSB", Ideologia.CENTRO, 40);

    // --- Esquerda ---
    public static final Partido PT = new Partido("Partido dos Trabalhadores", "PT", Ideologia.CENTRO_ESQUERDA, 13);
    public static final Partido PDT = new Partido("Partido Democrático Trabalhista", "PDT", Ideologia.CENTRO_ESQUERDA, 12);
    public static final Partido SOLIDARIEDADE = new Partido("Solidariedade", "SOLID", Ideologia.CENTRO_ESQUERDA, 77);
    public static final Partido REDE = new Partido("Rede Sustentabilidade", "REDE", Ideologia.CENTRO_ESQUERDA, 18);

    // --- Extrema-Esquerda ---
    public static final Partido PSOL = new Partido("Partido Socialismo e Liberdade", "PSOL", Ideologia.ESQUERDA, 50);
    public static final Partido PCDOB = new Partido("Partido Comunista do Brasil", "PCdoB", Ideologia.ESQUERDA, 65);
    public static final Partido UP = new Partido("Unidade Popular", "UP", Ideologia.ESQUERDA, 80);
    public static final Partido PSTU = new Partido("Partido Socialista dos Trabalhadores Unificado", "PSTU", Ideologia.ESQUERDA, 16);
    public static final Partido PCO = new Partido("Partido da Causa Operária", "PCO", Ideologia.ESQUERDA, 29);

    public ArrayList<Partido> getAllPartidos(){
        ArrayList<Partido> partidos = new ArrayList<>();
        for (Field field : this.getClass().getDeclaredFields()) {
            try {
                Partido partido = (Partido) field.get(this);
                partidos.add(partido);
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }
        return partidos;
    }

    public Partido getPartidoPorCodigo(int codigo) {
        ArrayList<Partido> partidos = this.getAllPartidos();
        for (Partido partido : partidos) {
            if (partido.getCodigo() == codigo) {
                return partido;
            }
        }
        return null;
    }

    public Partido getPartidoPorSigla(String sigla) {
        ArrayList<Partido> partidos = this.getAllPartidos();
        for (Partido partido : partidos) {
            if (partido.getSigla().equalsIgnoreCase(sigla)) {
                return partido;
            }
        }
        return null;
    }

}