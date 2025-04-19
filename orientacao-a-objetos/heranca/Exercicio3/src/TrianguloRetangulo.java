public class TrianguloRetangulo extends Poligono{

    public TrianguloRetangulo(double base, double altura){
        super(base, altura);
    }

    @Override
    public double calcularArea(){
        return super.calcularArea() / 2;
    }

    public double calcularHipotenusa() {
        return (getBase()*getBase()) + (getAltura()*getAltura());
    }


}
