package CityGame;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args)  {
        boolean c=true;
        while (c){
            String command=scanner.nextLine();
            switch (command){
                case "exit":
                    c=false;
                    System.out.println("Bye");
                    break;
                case "start":
                    beginTheGame();
                    break;
            }
        }

    }

    public static void beginTheGame() {
        System.out.println("Welcome to game. Enter the name of city, please: ");
        for (int i=0; i<3; i++){
            String input = scanner.nextLine();
            Constructors con = new Constructors(input);
            con.setInput(input);}



    }
}
