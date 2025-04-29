import java.util.ArrayList;

public class View {
    public static DataCenter cadastrarDatacenter() {
        DataCenter dataCenter = new DataCenter();
        boolean continuar = true;
        while (continuar) {
            Sistema sistema;
            int tipoSistema = Leitor.lerInt("Qual tipo de sistema deseja cadastrar?\n[1] - ADMINISTRATIVO\n[2] - CORPORATIVO", 1 , 2);
            if (tipoSistema == 1) {
                sistema = cadastrarSistemaAdministrativo();
            } else {
                sistema = cadastrarSistemaCorporativo();
            }
            ArrayList sistemas = dataCenter.getSistemas();
            sistemas.add(sistema);
            dataCenter.setSistemas(sistemas);
            int opcao = Leitor.lerInt("Deseja continuar adicionando sistemas?\n[1] - SIM\n[2] - NÃ0", 1, 2);
            if (opcao == 2) {
                continuar = false;
            }
        }
        return dataCenter;
    }

    public static Sistema cadastrarSistema() {
        System.out.println("---NOVO CADASTRO DE SISTEMA---");
        Sistema sistema = new Sistema();
        sistema.setName(Leitor.lerString("Nome: "));
        sistema.setFullTime(Leitor.lerInt("O sistema será full time?\n[1] - SIM\n[2] - NÃ0", 1, 2));
        sistema.setFuncionarioResponsavel(cadastrarFuncionario());
        return sistema;
    }

    public static Funcionario cadastrarFuncionario() {
        Funcionario funcionario = new Funcionario();
        System.out.println("---CADASTRO DE FUNCIONARIO---");
        funcionario.setNome(Leitor.lerString("Nome:"));
        funcionario.setTelefone(Leitor.lerString("Telefone:"));
        return funcionario;
    }

    public static Administrativo cadastrarSistemaAdministrativo(){
        Administrativo administrativo = new Administrativo(cadastrarSistema());
        administrativo.setUsuariosSimultaneos(Leitor.lerInt("Quantos usuários simultâneos o sistema deve aceitar?"));
        return administrativo;
    }

    public static Corporativo cadastrarSistemaCorporativo(){
        Corporativo corporativo = new Corporativo(cadastrarSistema());
        corporativo.setAcessosPorMinuto(Leitor.lerInt("Quantos acessos por minuto o sistema deve suportar?"));
        return corporativo;
    }
}
