public class Rectangle extends Quadrangle{

    public Rectangle(int numOfSides, int[] sides) {
        super(numOfSides, sides);
    }

    @Override
    public double field() {
        return getA()*getB();
    }

    @Override
    public String toString() {
        return new StringBuilder().append("Prostokąt")
                .append(resultWithField())
                .toString();
    }
}
