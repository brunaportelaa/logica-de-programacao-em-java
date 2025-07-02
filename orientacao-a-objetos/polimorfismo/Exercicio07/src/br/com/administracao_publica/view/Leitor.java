package br.com.administracao_publica.view;

import java.util.Scanner;

public interface Leitor {

    public int lerInt(String msg);

    public int lerInt(String msg, int min, int max, String msgErro);

    public int lerInt(String msg, int min, int max);

    public int lerInt(String msg, int min);

    public double lerDouble(String msg, double min);

    public double lerDouble(String msg);

    public String lerString(String msg);

}
