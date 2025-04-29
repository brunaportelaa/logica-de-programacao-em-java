public class Administrativo extends Sistema{
    private int usuariosSimultaneos;

    public Administrativo(Sistema sistema) {
        super(sistema.isFullTime(), sistema.getName(), sistema.getFuncionarioResponsavel());
    }

    public int getUsuariosSimultaneos() {
        return usuariosSimultaneos;
    }

    public void setUsuariosSimultaneos(int usuariosSimultaneos) {
        this.usuariosSimultaneos = usuariosSimultaneos;
    }

    @Override
    public int getTotalFuncionarios() {
        if (this.getUsuariosSimultaneos() > 200) {
            return super.getTotalFuncionarios() + 2;
        }
        return super.getTotalFuncionarios();
    }

    @Override
    public String toString(){
        String string = super.toString();
        string += "\nUsuários simultâneos: " + this.getUsuariosSimultaneos();
        return string;
    }
}
