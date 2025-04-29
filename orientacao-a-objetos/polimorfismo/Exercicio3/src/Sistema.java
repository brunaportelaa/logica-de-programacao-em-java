public class Sistema {
    private boolean fullTime;
    private String name;
    private Funcionario funcionarioResponsavel;

    public Sistema(boolean fullTime, String name, Funcionario funcionarioResponsavel) {
        this.fullTime = fullTime;
        this.name = name;
        this.funcionarioResponsavel = funcionarioResponsavel;
    }

    public Sistema() {

    }

    public boolean isFullTime() {
        return fullTime;
    }

    public void setFullTime(boolean fullTime) {
        this.fullTime = fullTime;
    }

    public void setFullTime(int isFullTime){
        if (isFullTime == 1) {
            this.setFullTime(true);
        } else {
            this.setFullTime(false);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Funcionario getFuncionarioResponsavel() {
        return funcionarioResponsavel;
    }

    public void setFuncionarioResponsavel(Funcionario funcionarioResponsavel) {
        this.funcionarioResponsavel = funcionarioResponsavel;
    }

    public int getTotalFuncionarios() {
        return 1;
    }

    @Override
    public String toString(){
        String string = this.getName();
        string += "\nFuncionário responsável:" + this.getFuncionarioResponsavel();
        string += "\nÉ full time? " + (this.isFullTime() ? "SIM" : "NÃO");
        string += "\nTotal funcionários: " + this.getTotalFuncionarios();
        return string;
    }
}
