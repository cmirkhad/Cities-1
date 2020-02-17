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
        Constructors con = new Constructors();
        while(con.getResult()!="I am done"){
            String input = scanner.nextLine();
            con.setInput(input);
            //con.usercitiesinfo();
        }



    }
}

