package Task5;

public class Umnozhenie extends Operaciy {
    public Umnozhenie(double a, double b, int oper) {
        super(a, b, oper);
    }
    public double doUmn() {
        return getA() * getB();
    }
    @Override
    public String toString() {
        return "Произведение = " + doUmn();
    }
}