public class Numero {
    int numero;

    public static int getFatorial(int numero){
        if (numero == 1) {
            return 1;
        } else {
            return numero * getFatorial(numero - 1);
        }
    }

    public int compararNumero(int numero){
        if (numero > this.numero) {
            return numero;
        } else {
            return this.numero;
        }
    }

    public boolean isPar() {
        if (this.numero % 2 == 0){
            System.out.println("O número é par");
            return true;
        } else {
            System.out.println("O número é impar");
            return false;
        }
    }

    public boolean isPrimo(){
        if (this.numero < 1) {
            System.out.println("O número é inválido.");
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (this.numero % i == 0) {
                System.out.println("O número não é primo.");
                return false;
            }
        }
        return true;
    }
}
