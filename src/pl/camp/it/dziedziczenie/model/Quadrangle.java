package pl.camp.it.dziedziczenie.model;

public class Quadrangle extends Figure {

    public Quadrangle(int numOfSides, int[] sides) {
        super(numOfSides, sides);
    }

    @Override
    public double countField() {
        return 0.0;
    }

    @Override
    public String toString() {
        return new StringBuilder().append("Czworokąt")
                .append(resultWithoutField())
                .toString();
    }
}
