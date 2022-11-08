public class Square extends Quadrangle{

    public Square(int numOfSides, int[] sides) {
        super(numOfSides, sides);
    }

    @Override
    public double field() {
        return getA()*getA();
    }

    @Override
    public String toString() {
        return new StringBuilder().append("Kwadrat")
                .append(resultWithField())
                .toString();
    }
}
