package Task5;

public class Delenie extends Operaciy {
    public Delenie(double a, double b, int oper) {
        super(a, b, oper);
    }
    public double doDel() {
        if (getB() == 0) throw new ArithmeticException();
        return getA() / getB();
    }
    @Override
    public String toString() {
        return "Частное = " + doDel();
    }
}
