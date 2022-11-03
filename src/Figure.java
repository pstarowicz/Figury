import java.util.Arrays;

public abstract class Figure {
    private int numOfSides;
    private int[] sides = new int[6];

    private double a;
    private double b;
    private double c;
    private double d;
    private double e;
    private double f;

    public Figure(int numOfSides, int[] sides) {
        this.numOfSides = numOfSides;
        this.sides = sides;
        this.a=sides[0];
        this.b=sides[1];
        this.c=sides[2];
        this.d=sides[3];
        this.e=sides[4];
        this.f=sides[5];
    }

    public Figure(int[] sides) {
        this.sides = sides;
        this.a=sides[0];
    }

    public abstract double field();

    public double perimeter(){
        int per=0;
        for(int i=0; i<numOfSides; i++){
            per+=sides[i];
        }
        return per;
    }

    public String showSides(){
        StringBuilder sides = new StringBuilder();
        for(int i=0; i<getNumOfSides(); i++){
            sides.append(this.sides[i]).append(" ");
        }
        return sides.toString();
    }

    public String resultWithoutField(){
        return new StringBuilder().append(" - boki: ")
                .append(showSides())
                .append("- obwód= ")
                .append(perimeter())
                .toString();
    }

    public String resultWithField(){
        return new StringBuilder().append(resultWithoutField())
                .append(" - pole= ")
                .append(field())
                .toString();
    }

    public int getNumOfSides() {
        return numOfSides;
    }

    public void setNumOfSides(int numOfSides) {
        this.numOfSides = numOfSides;
    }

    public int[] getSides() {
        return sides;
    }

    public void setSides(int[] sides) {
        this.sides = sides;
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

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }

    public double getE() {
        return e;
    }

    public void setE(double e) {
        this.e = e;
    }

    public double getF() {
        return f;
    }

    public void setF(double f) {
        this.f = f;
    }
}
