package pl.camp.it.dziedziczenie;

import pl.camp.it.dziedziczenie.core.Engine;

import java.io.IOException;

public class App {
    public static void main(String[] args) {
        try {
            Engine.start();
        }
        catch (IOException e){
            System.out.println("Nie dziala wczytywanie z klawiatury");
        }
    }
}
