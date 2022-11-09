package pl.camp.it.dziedziczenie.model;

public class NotFigure extends Figure{

    public NotFigure(int numOfSides, int[] sides) {
        super(numOfSides, sides);
    }

    @Override
    public double countPerimeter() {
        return 0.0;
    }

    @Override
    public double countField(){
        return 0.0;
    }

    @Override
    public String toString() {
        return new StringBuilder().append("Nie można stworzyć figury z podanych boków: ")
                .append(showSides())
                .toString();
    }

}
