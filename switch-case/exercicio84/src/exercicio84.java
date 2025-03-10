import java.util.Scanner;

public class exercicio84 {

    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        conta.id = 123;
        conta.nomeUsuario = "Bruna Portela";
        conta.saldo = 1000000;

        double valorTransacao = 0;

        int operacao = 0;

        while (operacao != 4) {
            operacao = lerInt("Informe qual operação gostaria de realizar: 1 - Exibir saldo, 2 - Depósito, 3 - Saque, 4 - Encerrar.");
;
            switch (operacao) {
                case 1:
                    conta.exibirSaldo();
                    break;
                case 2:
                    valorTransacao = lerDouble("Informe um valor para a transação:");
                    conta.depositar(valorTransacao);
                    break;
                case 3:
                    valorTransacao = lerDouble("Informe um valor para a transação:");
                    conta.sacar(valorTransacao);
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Por favor, insira um valor válido para a operação.");
            }

        }

    }

    public static int lerInt(String msg) {
        System.out.println(msg);
        return lerInt();
    }

    public static int lerInt() {
        return new Scanner(System.in).nextInt();
    }

    public static double lerDouble(String msg) {
        System.out.println(msg);
        return lerDouble();
    }

    public static double lerDouble() {
        return new Scanner(System.in).nextDouble();
    }


}


class ContaBancaria {
    int id;
    String nomeUsuario;
    double saldo;

    /**
     * Verifica se a transação tem um valor positivo e realiza o depósito e atualiza o valor do saldo da conta.
     * @param valorTransacao - valor positivo para a transação.
     */
    public void depositar( double valorTransacao) {
        if ( valorTransacao > 0 ) {
            saldo += valorTransacao;
            System.out.println("Depósito de R$" + valorTransacao + " realizado.");
            System.out.println("Seu novo saldo agora é de: R$" + saldo);
        } else {
            System.out.println("Informe um valor válido para depósito.");
        }
    }

    public void sacar( double valorTransacao) {
        if ( valorTransacao <= saldo && valorTransacao > 0) {
            saldo -= valorTransacao;
            System.out.println("Saque de R$" + valorTransacao + " realizado.");
            System.out.println("Seu novo saldo agora é de: R$" + saldo);
        } else {
            System.out.println("Informe um valor válido para saque.");
        }
    }

    public void exibirSaldo(){
        System.out.println("Saldo atual: R$" + saldo);
    }
}

