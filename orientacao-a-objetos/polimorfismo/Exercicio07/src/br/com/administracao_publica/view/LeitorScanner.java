package br.com.administracao_publica.view;

import java.util.Scanner;

public class LeitorScanner implements Leitor {

    public int lerInt() {
        return new Scanner(System.in).nextInt();
    }


    public int lerInt(String msg) {
        System.out.println(msg);
        return lerInt();
    }

    public int lerInt(String msg, int min, int max, String msgErro) {
        int valor;
        do {
            valor = lerInt(msg);
            if (valor < min || valor > max ) {
                System.out.println(msgErro);
            }
        } while (valor < min || valor > max);
        return valor;
    }

    public int lerInt(String msg, int min, int max) {
        int valor;
        do {
            valor = lerInt(msg);
            if (valor < min || valor > max ) {
                System.out.println("Valor Inválido");
            }
        } while (valor < min || valor > max);
        return valor;
    }

    public int lerInt(String msg, int min) {
        int valor;
        do {
            valor = lerInt(msg);
            if (valor < min) {
                System.out.println("Valor Inválido");
            }
        } while (valor < min);
        return valor;
    }

    public double lerDouble(String msg, double min){
        double valor;
        do {
            valor = lerDouble(msg);
            if(valor < min){
                System.out.println("Valor inválido.");
            }
        } while (valor < min);
        return valor;
    }

    public double lerDouble(){
        return new Scanner(System.in).nextDouble();
    }

    public double lerDouble(String msg){
        System.out.println(msg);
        return lerDouble();
    }

    public String lerString(){
        return new Scanner(System.in).nextLine();
    }

    public String lerString(String msg){
        System.out.println(msg);
        return lerString();
    }
}
