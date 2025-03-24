public class Acao {
    final int PRAZO_MIN_PRIORIDADE = 2015;
    final int PRAZO_MAX_PRIORIDADE = 2016;
    int id;
    String descricao;
    int mes;
    int ano;

    public void gerarId(){
        this.id = (int)Math.random() * 10000;
    }

    public int getTrimestre(){
        switch (mes) {
            case 1:
            case 2:
            case 3:
                return 1;
            case 4:
            case 5:
            case 6:
                return 2;
            case 7:
            case 8:
            case 9:
                return 3;
            case 10:
            case 11:
            case 12:
                return 4;
            default:
                return 0;
        }
    }

    public boolean isPrioritaria(){
        if (ano >= PRAZO_MIN_PRIORIDADE && ano <= PRAZO_MAX_PRIORIDADE) {
            return true;
        } else {
            return false;
        }
    }

    public String toString(){
        String string = "Descrição: " + this.descricao +
                "\nMês: " + this.mes +
                "\nAno: " + this.ano +
                "\nPrioridade: " + (this.isPrioritaria() ? "PRIORITÁRIA" : "NÃO PRIORITÁRIA");
        return string.toLowerCase();
    }
}
