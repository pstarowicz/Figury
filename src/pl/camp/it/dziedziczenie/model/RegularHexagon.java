package pl.camp.it.dziedziczenie.model;

public class RegularHexagon extends Hexagon{

    private double a;
    public RegularHexagon(int numOfSides, int[] sides) {
        super(numOfSides, sides);
        this.a=sides[0];
    }
    @Override
    public double field() {
        return 3.0*a*a*Math.sqrt(3)/2.0;
    }

    @Override
    public String toString() {
        return new StringBuilder().append("Sześciokąt foremny")
                .append(resultWithField())
                .toString();
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }
}
