public class Circle extends Figure{

    public Circle(int[] sides) {
        super(sides);
    }

    @Override
    public double field() {
        return (Math.PI)*getA()*getA();
    }

    @Override
    public double perimeter() {
        return 2.0*(Math.PI)*getA();
    }

    @Override
    public String toString() {
        return new StringBuilder().append("Koło o promieniu: ")
                .append(getA()).append(" - obwód= ")
                .append(perimeter())
                .append(" - pole=")
                .append(field())
                .toString();
    }
}
