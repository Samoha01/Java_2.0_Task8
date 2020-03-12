package Task5;

public class Slozhenie extends Operaciy {
    public Slozhenie(double a, double b, int oper) {
        super(a, b, oper);
    }
    public double doSum() {
        return getA() + getB();
    }
    @Override
    public String toString() {
        return "Сумма = " + doSum();
    }
}