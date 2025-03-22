public class Acao {
    String descricao;
    int mes;
    int ano;

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
}
