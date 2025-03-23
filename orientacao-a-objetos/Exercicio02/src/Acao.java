public class Acao {
    int id;
    String descricao;
    int mes;
    int ano;

    public void gerarId(){
        this.id = (int)Math.random() * 10000;
    }

    public int getTrimestre(){
        int trimestre = 0;
        switch (mes) {
            case 1:
            case 2:
            case 3:
                trimestre = 1;
                break;
            case 4:
            case 5:
            case 6:
                trimestre = 2;
                break;
            case 7:
            case 8:
            case 9:
                trimestre = 3;
                break;
            case 10:
            case 11:
            case 12:
                trimestre = 4;
                break;
        }
        return trimestre;
    }

    public boolean getPrioridade(){
        boolean isPrioritaria;
        if (ano <= 2016) {
            isPrioritaria = true;
        } else {
            isPrioritaria = false;
        }
        return isPrioritaria;
    }

    public String toString(){
        String string = "Descrição: " + this.descricao +
                "\nMês: " + this.mes +
                "\nAno: " + this.ano +
                "\nPrioridade: " + (this.getPrioridade() ? "PRIORITÁRIA" : "NÃO PRIORITÁRIA");
        return string.toLowerCase();
    }
}
