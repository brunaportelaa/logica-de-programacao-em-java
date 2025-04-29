public class Competidor {

    private int numero;
    private String nome;
    private int sexo;
    private int idade;

    public Competidor(int numero, String nome, int sexo, int idade) {
        setNumero(numero);
        setNome(nome);
        setSexo(sexo);
        setIdade(idade);
    }

    public Competidor() {

    }

    public Competidor(int numero) {
        setNumero(numero);
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getSexo() {
        return sexo;
    }

    public void setSexo(int sexo) {
        this.sexo = sexo;
    }

    public String getSexoDescricao() {
        if (this.getSexo() == 1 ) {
            return "Feminino";
        }
        return "Masculino";
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPagamento() {
        return 10.0;
    }

    @Override
    public boolean equals(Object obj) {
        Competidor competidor = (Competidor) obj;
        return competidor.getNumero() == this.getNumero();
    }

    @Override
    public String toString() {
        return "Nome: " + this.getNome() +
                "\nNúmero de Inscrição: " + this.getNumero() +
                "\nIdade: " + this.getIdade() +
                "\nSexo: " + this.getSexoDescricao() +
                "\nPagamento: " + this.getPagamento();
    }
}
