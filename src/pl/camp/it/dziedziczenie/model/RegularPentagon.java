package pl.camp.it.dziedziczenie.model;

public class RegularPentagon extends Pentagon{

    private double a;

    public RegularPentagon(int numOfSides, int[] sides) {
        super(numOfSides, sides);
        this.a=sides[0];
        this.setField(countField());
    }

    @Override
    public double countField() {
        return (a*a/4.0)*(Math.sqrt(25.0+10.0*Math.sqrt(5)));
    }

    @Override
    public String toString() {
        return new StringBuilder().append("Pięciokąt foremny")
                .append(resultWithField())
                .toString();
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }
}
