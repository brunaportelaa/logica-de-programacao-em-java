public class Partido {

    public static final int EXTREMA_DIREITA = 1;
    public static final int DIREITA = 2;
    public static final int CENTRO_DIREITA = 3;
    public static final int CENTRO = 4;
    public static final int ESQUERDA = 5;
    public static final int EXTREMA_ESQUERDA = 6;

    private String nome;
    private String sigla;
    private int ideologia;
    private int codigo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public int getIdeologia() {
        return ideologia;
    }

    private void setIdeologia(int ideologia) {
        this.ideologia = ideologia;
    }

    public int getCodigo() {
        return codigo;
    }

    private void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Partido(String nome, String sigla, int ideologia, int codigo) {
        setNome(nome);
        setSigla(sigla);
        setIdeologia(ideologia);
        setCodigo(codigo);
    }
}
