package pl.camp.it.dziedziczenie.model;

public abstract class Figure {
    private int numOfSides;
    private int[] sides;
    private double perimeter;
    private double field;

    public Figure(int numOfSides, int[] sides) {
        this(sides);
        this.numOfSides = numOfSides;
        this.sides = sides;
        this.perimeter= countPerimeter();
    }

    public Figure(int[] sides) {

    }

    public abstract double countField();

    public double countPerimeter(){
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
                .append(this.perimeter)
                .toString();
    }

    public String resultWithField(){
        return new StringBuilder().append(resultWithoutField())
                .append(" - pole= ")
                .append(this.field)
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

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public double getField() {
        return field;
    }

    public void setField(double field) {
        this.field = field;
    }
}
