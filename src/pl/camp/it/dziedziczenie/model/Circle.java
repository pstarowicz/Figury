package pl.camp.it.dziedziczenie.model;

public class Circle extends Figure{

    private double r;

    public Circle(int numOfSides, int[] sides) {
        super(numOfSides, sides);
        this.r=sides[0];
        this.setField(countField());
    }

    @Override
    public double countField() {
        return (Math.PI)*r*r;
    }

    @Override
    public double countPerimeter() {
        return 2.0*(Math.PI)*r;
    }

    @Override
    public String toString() {
        return new StringBuilder().append("Koło o promieniu: ")
                .append(r).append(" - obwód= ")
                .append(countPerimeter())
                .append(" - pole=")
                .append(countField())
                .toString();
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
}
