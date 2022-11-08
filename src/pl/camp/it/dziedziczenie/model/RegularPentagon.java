package pl.camp.it.dziedziczenie.model;

public class RegularPentagon extends Pentagon{

    public RegularPentagon(int numOfSides, int[] sides) {
        super(numOfSides, sides);
    }

    @Override
    public double field() {
        return (getA()*getA()/4.0)*(Math.sqrt(25+10*Math.sqrt(5)));
    }

    @Override
    public String toString() {
        return new StringBuilder().append("Pięciokąt foremny")
                .append(resultWithField())
                .toString();
    }
}
