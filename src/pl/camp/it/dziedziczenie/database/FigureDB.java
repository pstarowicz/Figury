public class FigureDB {
    private Figure[] figures = new Figure[0];

    public void addFigure(Figure figure){
        Figure[] figures1 = new Figure[this.figures.length+1];
        for(int i=0; i<this.figures.length; i++){
            figures1[i]=this.figures[i];
        }
        figures1[figures1.length-1]=figure;
        this.figures=figures1;
    }

    public Figure[] getFigures() {
        return figures;
    }

    public void setFigures(Figure[] figures) {
        this.figures = figures;
    }
}
