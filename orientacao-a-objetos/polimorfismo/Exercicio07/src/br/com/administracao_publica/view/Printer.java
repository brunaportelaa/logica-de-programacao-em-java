package br.com.administracao_publica.view;
import br.com.administracao_publica.AgentePublico;
import br.com.administracao_publica.AtoAdministrativo;

import java.util.ArrayList;


public class Printer {


    public static void print(ArrayList<AtoAdministrativo> atosAdministrativos) {
        for (AtoAdministrativo atoAdministrativo : atosAdministrativos) {
            print(atoAdministrativo);
        }
    }

    public static void print(AtoAdministrativo atoAdministrativo){
        System.out.println(atoAdministrativo);
        System.out.println();
    }

    public static void printAgentesPublicos(ArrayList<AgentePublico> agentePublicos){
        for (AgentePublico agentePublico : agentePublicos){
            System.out.println(agentePublico);
            System.out.println();
        }
    }


}
