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
}
