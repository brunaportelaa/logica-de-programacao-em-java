public class Legislador {

    public final static int DEPT_ESTADUAL = 3;
    public final static int DEPT_FEDERAL = 2;
    public final static int SENADOR = 1;

    private int cargo;
    private String nome;
    private int codigo;
    private boolean reeleito;
    private Partido partido;
    private Estado estado;


    public Legislador(int cargo, String nome, int codigo, boolean reeleito, Partido partido, Estado estado) {
        setCargo(cargo);
        setNome(nome);
        setCodigo(codigo);
        setReeleito(reeleito);
        setPartido(partido);
        setEstado(estado);
    }

    public int getCargo() {
        return cargo;
    }

    public String getCargoDescricao() {
        String cargo = "";
        if (this.getCargo() == SENADOR) {
            cargo = "Senador";
        } else {
            if (this.getCargo() == DEPT_FEDERAL) {
                cargo = "Deputado Federal";
            }
        }
        return cargo;
    }

    public void setCargo(int cargo) {
        this.cargo = cargo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public boolean isReeleito() {
        return reeleito;
    }

    public void setReeleito(boolean reeleito) {
        this.reeleito = reeleito;
    }

    public Partido getPartido() {
        return partido;
    }

    public void setPartido(Partido partido) {
        this.partido = partido;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public String toString() {
        String string = this.getNome() +
                "\nCargo: " + this.getCargoDescricao() +
                "\nPartido: " + this.getPartido().getNome() + " - " + this.getPartido().getSigla() +
                "\nEstado: " + this.getEstado().getNome() +
                "\nFoi reeleito? " + (this.isReeleito() ? "Sim" : "Não") +
                "\n\n-----------------\n\n";
        return string;
    }
}
