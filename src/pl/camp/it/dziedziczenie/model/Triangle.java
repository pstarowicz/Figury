package pl.camp.it.dziedziczenie.model;

public class Triangle extends Figure{

    private Kind kind;
    private double a;
    private double b;
    private double c;

    public Triangle(int numOfSides, int[] sides, Kind kind) {
        super(numOfSides, sides);
        this.kind = kind;
        this.a=sides[0];
        this.b=sides[1];
        this.c=sides[2];
        this.setField(countField());
    }

    @Override
    public double countField() {
        double p=(a+b+c)/2.0;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

    @Override
    public String toString() {
        return new StringBuilder().append("Trójkąt ")
                .append(kind)
                .append(resultWithField())
                .toString();
    }

    public enum Kind{
        ROWNOBOCZNY,
        ROWNORAMIENNY,
        ROZNOBOCZNY
    }

    public Kind getKind() {
        return kind;
    }

    public void setKind(Kind kind) {
        this.kind = kind;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
}
