package pl.camp.it.dziedziczenie.database;

import pl.camp.it.dziedziczenie.model.Figure;

import java.util.ArrayList;
import java.util.List;

public class FigureDB {
    private final List<Figure> figures = new ArrayList<>();

    public void addFigure(Figure figure){
        this.figures.add(figure);
    }

    public List<Figure> getFigures() {
        return figures;
    }
}
