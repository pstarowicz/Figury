package pl.camp.it.dziedziczenie.model;

public class Rectangle extends Quadrangle{

    private int a;
    private int b;

    public Rectangle(int numOfSides, int[] sides) {
        super(numOfSides, sides);
        this.a=sides[0];
        this.b=sides[1];
        this.setField(countField());
    }

    @Override
    public double countField() {
        return a*b;
    }

    @Override
    public String toString() {
        return new StringBuilder().append("Prostokąt")
                .append(resultWithField())
                .toString();
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}
