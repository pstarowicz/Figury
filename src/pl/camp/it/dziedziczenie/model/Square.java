package pl.camp.it.dziedziczenie.model;

public class Square extends Quadrangle{

    private int a;

    public Square(int numOfSides, int[] sides) {
        super(numOfSides, sides);
        this.a=sides[0];
        this.setField(countField());
    }

    @Override
    public double countField() {
        return a*a;
    }

    @Override
    public String toString() {
        return new StringBuilder().append("Kwadrat")
                .append(resultWithField())
                .toString();
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
}
