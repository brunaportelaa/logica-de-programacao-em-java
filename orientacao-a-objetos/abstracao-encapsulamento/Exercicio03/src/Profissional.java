public class Profissional {
    String nome;
    int matricula;
    int cargo;

    public String getCargo() {
        if (cargo == 1) {
            return "TÉCNICO";
        } else {
            return "ANALISTA";
        }
    }

    public String toString(){
        return "Nome: " + this.nome +
                "\nMatrícula: " + this.matricula +
                "\nCargo: " + getCargo();
    }
}
