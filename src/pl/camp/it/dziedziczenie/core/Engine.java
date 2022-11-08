import java.util.Scanner;

public class Engine {
    public static void start(){
        Scanner scanner = new Scanner(System.in);
        FigureDB figureDB;
        boolean isWorking = true;

        while(isWorking){
            GUI.showMenu();
            switch(scanner.nextLine()){
                case "1":
                    figureDB=GUI.createFigures();
                    if(figureDB!=null) {
                        GUI.showResult(figureDB);
                    }
                    break;
                case  "2":
                    isWorking=false;
                    break;
                default:
                    System.out.println("Podano zły numer!");
                    break;
            }
        }
    }
}
