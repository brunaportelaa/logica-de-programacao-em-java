public class Profissional {
    String nome;
    int matricula;
    String cargo;

    public void setCargo(int cargo) {
        if (cargo == 1) {
            this.cargo = "TÉCNICO";
        } else {
            this.cargo = "ANALISTA";
        }
    }

    public String toString(){
        return "Nome: " + this.nome +
                "\nMatrícula: " + this.matricula +
                "\nCargo: " + this.cargo;
    }
}
