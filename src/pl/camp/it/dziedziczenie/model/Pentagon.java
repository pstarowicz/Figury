package pl.camp.it.dziedziczenie.model;

public class Pentagon extends Figure{

    public Pentagon(int numOfSides, int[] sides) {
        super(numOfSides, sides);
    }

    @Override
    public double countField() {
        return 0.0;
    }

    @Override
    public String toString() {
        return new StringBuilder().append("Pięciokąt")
                .append(resultWithoutField())
                .toString();
    }
}
