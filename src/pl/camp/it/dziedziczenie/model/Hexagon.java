package pl.camp.it.dziedziczenie.model;

public class Hexagon extends Figure{

    public Hexagon(int numOfSides, int[] sides) {
        super(numOfSides, sides);
    }

    @Override
    public double field() {
        return 0.0;
    }

    @Override
    public String toString() {
        return new StringBuilder().append("Sześciokąt")
                .append(resultWithoutField())
                .toString();
    }
}
