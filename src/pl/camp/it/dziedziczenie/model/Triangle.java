public class Triangle extends Figure{

    private Kind kind;

    public Triangle(int numOfSides, int[] sides, Kind kind) {
        super(numOfSides, sides);
        this.kind = kind;
    }

    @Override
    public double field() {
        double p=(getA()+getB()+getC())/2.0;
        return Math.sqrt(p*(p-getA())*(p-getB())*(p-getC()));
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

}
