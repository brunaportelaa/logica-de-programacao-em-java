import java.util.ArrayList;

public class Universidade {
    String nome;
    Laboratorio[] laboratorios;

    public int countByResponsavel(int cargoResponsavel) {
        int counter = 0;
        for (Laboratorio laboratorio : this.laboratorios) {
            if (laboratorio.responsavel.cargo == cargoResponsavel) {
                counter++;
            }
        }
        return counter;
    }

    public Laboratorio[] sortByResponsavel(int qtdLaboratorios, int cargoResponsavel){
        Laboratorio[] selecionados = new Laboratorio[qtdLaboratorios];
        int j = 0;
        for (Laboratorio laboratorio : this.laboratorios) {
            if (laboratorio.responsavel.cargo == cargoResponsavel) {
                selecionados[j] = laboratorio;
                j++;
            }
        }
        return selecionados;
    }

    public double somarCusto(){
        int custoTotal = 0;
        for (Laboratorio laboratorio : this.laboratorios) {
            custoTotal += somarCusto();
        }
        return custoTotal;
    }
}

