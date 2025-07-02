package br.com.administracao_publica.view;

import javax.swing.*;
import java.util.Scanner;


public class LeitorJOptionPane implements Leitor {

    public int lerInt(String msg) {
        return Integer.parseInt(JOptionPane.showInputDialog(null, msg));
    }

    public int lerInt(String msg, int min, int max, String msgErro) {
        int valor;
        do {
            valor = Integer.parseInt(JOptionPane.showInputDialog(msg));
            if (valor < min || valor > max ) {
                System.out.println(msgErro);
            }
        } while (valor < min || valor > max);
        return valor;
    }

    public int lerInt(String msg, int min, int max) {
        int valor;
        do {
            valor = Integer.parseInt(JOptionPane.showInputDialog(msg));
            if (valor < min || valor > max ) {
                System.out.println("Valor Inválido");
            }
        } while (valor < min || valor > max);
        return valor;
    }

    public int lerInt(String msg, int min) {
        int valor;
        do {
            valor = Integer.parseInt(JOptionPane.showInputDialog(msg));
            if (valor < min) {
                System.out.println("Valor Inválido");
            }
        } while (valor < min);
        return valor;
    }

    public double lerDouble(String msg, double min){
        double valor;
        do {
            valor = Double.parseDouble(JOptionPane.showInputDialog(msg));
            if(valor < min){
                System.out.println("Valor inválido.");
            }
        } while (valor < min);
        return valor;
    }

    public double lerDouble(String msg){
        return Double.parseDouble(JOptionPane.showInputDialog(msg));
    }

    public String lerString(String msg){
        return JOptionPane.showInputDialog(msg);
    }
}
