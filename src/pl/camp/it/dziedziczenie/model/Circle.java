package pl.camp.it.dziedziczenie.model;

public class Circle extends Figure{

    private double r;

    public Circle(int numOfSides, int[] sides) {
        super(numOfSides, sides);
        this.r=sides[0];
    }

    @Override
    public double field() {
        return (Math.PI)*r*r;
    }

    @Override
    public double perimeter() {
        return 2.0*(Math.PI)*r;
    }

    @Override
    public String toString() {
        return new StringBuilder().append("Koło o promieniu: ")
                .append(r).append(" - obwód= ")
                .append(perimeter())
                .append(" - pole=")
                .append(field())
                .toString();
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
}
