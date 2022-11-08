public class RegularHexagon extends Hexagon{
    public RegularHexagon(int numOfSides, int[] sides) {
        super(numOfSides, sides);
    }
    @Override
    public double field() {
        return 3*getA()*getA()*Math.sqrt(3)/2;
    }

    @Override
    public String toString() {
        return new StringBuilder().append("Sześciokąt foremny")
                .append(resultWithField())
                .toString();
    }
}
