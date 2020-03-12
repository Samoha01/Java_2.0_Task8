package Task5;

public class Vichitanie extends Operaciy {
    public Vichitanie(double a, double b, int oper) {
        super(a, b, oper);
    }
    public double doVich() {
        return getA() - getB();
    }
    @Override
    public String toString() {
        return "Разница = " + doVich();
    }
}