public class Aplicacao {

    public static void main(String[] args) {

        Vetor vetor = new Vetor();
        vetor.vetor = View.lerVetor(5);
        Printer.print(vetor.vetor);
        System.out.println("A média dos componentes do array é: " + vetor.getMedia());
        System.out.println("A quantidade de números ímpares é de: " + vetor.countByImpar(vetor.vetor));
        System.out.println("Os números ímpares são:");
        Printer.print(vetor.sortByImpar(vetor.vetor));
    }






}