package pl.camp.it.dziedziczenie.model;

import java.util.Arrays;

public abstract class Figure {
    private int numOfSides;
    private int[] sides = new int[6];

    public Figure(int numOfSides, int[] sides) {
        this.numOfSides = numOfSides;
        this.sides = sides;
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

}
