import java.util.Scanner;

public class GUI {
    public static void showMenu(){
        System.out.println();
        System.out.println("1. Wczytaj boki");
        System.out.println("2. Wyjdź");
    }

    public static FigureDB createFigures(){
        Scanner scanner = new Scanner(System.in);
        FigureDB figureDB = new FigureDB();
        System.out.println("Podaj liczbę zestawów do wpisania:");
        int liczFigur=Integer.parseInt(scanner.nextLine());
        if(liczFigur<=0){
            System.out.println("Podano niedodatnią liczbę");
            return null;
        }
        System.out.println("Podaj długości (1 lub 3-6 wymiary):");
        for(int j=0; j<liczFigur; j++) {
            String a = scanner.nextLine();
            String[] nums = a.split(" ");
            if (nums.length > 6) {
                System.out.println("Podano za dużą liczbę boków!");
                return null;
            } else if (nums.length < 3 && nums.length!=1) {
                System.out.println("Podano niewłaściwą liczbę boków!");
                return null;
            } else {
                int[] sides = new int[6];
                for (int i = 0; i < nums.length; i++) {
                    sides[i] = Integer.parseInt(nums[i]);
                    if (sides[i] <= 0) {
                        System.out.println("Podano niedodatnią długość!");
                        return null;
                    }
                }
                createFigure(sides,nums.length,figureDB);
            }
        }
        return figureDB;
    }

    public static void showResult(FigureDB figureDB){
        for(Figure figure: figureDB.getFigures()){
            System.out.println(figure);
        }
    }

    private static void createFigure(int[] sides,int countOfSides,FigureDB figureDB){
        if(checkIfFigureCanBeMade(sides) || countOfSides==1) {
            int b1=sides[0];
            int b2=sides[1];
            int b3=sides[2];
            int b4=sides[3];
            int b5=sides[4];
            int b6=sides[5];
            switch(countOfSides){
                case 1:
                    figureDB.addFigure(new Circle(sides));
                    break;
                case 3:
                    if(checkIfRegular(sides,countOfSides)){
                        figureDB.addFigure(new Triangle(countOfSides,sides,Triangle.Kind.ROWNOBOCZNY));
                    }
                    else if(b1==b2 || b1==b3 || b2==b3){
                        figureDB.addFigure(new Triangle(countOfSides,sides,Triangle.Kind.ROWNORAMIENNY));
                    }
                    else {
                        figureDB.addFigure(new Triangle(countOfSides,sides,Triangle.Kind.ROZNOBOCZNY));
                    }
                    break;
                case 4:
                    if(checkIfRegular(sides,countOfSides)){
                        figureDB.addFigure(new Square(countOfSides,sides));
                    }
                    else if(b1==b3 && b2==b4){
                        figureDB.addFigure(new Rectangle(countOfSides,sides));
                    }
                    else {
                        figureDB.addFigure(new Quadrangle(countOfSides,sides));
                    }
                    break;
                case 5:
                    if(checkIfRegular(sides,countOfSides)){
                        figureDB.addFigure(new RegularPentagon(countOfSides,sides));
                    }
                    else{
                        figureDB.addFigure(new Pentagon(countOfSides,sides));
                    }
                    break;
                case 6:
                    if(checkIfRegular(sides,countOfSides)) {
                        figureDB.addFigure(new RegularHexagon(countOfSides,sides));
                    }
                    else {
                        figureDB.addFigure(new Hexagon(countOfSides,sides));
                    }
                    break;
                default:
                    System.out.println("Cos poszło nie tak..");
                    break;
            }
        }
        else{
            figureDB.addFigure(new NotFigure(countOfSides,sides));
        }
    }

    private static boolean checkIfRegular(int[] sides, int countOfSides){
        int a=sides[0];
        for(int i=1; i<countOfSides;i++){
            if(sides[i]!=a) return false;
        }
        return true;
    }

    private static boolean checkIfFigureCanBeMade(int[] sides){
        // największy bok musi być mniejszy niż suma pozostałych
        int max=sides[0];
        int sum=sides[0];
        for(int i=1; i<sides.length; i++){
            if(sides[i]>max) max=sides[i];
            sum+=sides[i];
        }
        return (sum-2*max)>0;
    }
}
