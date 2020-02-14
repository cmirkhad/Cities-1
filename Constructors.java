package CityGame;

import java.util.ArrayList;

public class Constructors {
    private String input;

    public Constructors(String input) {
        this.input=input;
    }

    public String getInput() {
        return input;
    }
    ArrayList<String> bothinput= new ArrayList<String>();
    public void setInput(String input) {
        this.input = input;
        if (input.length()>20){
            System.out.println("Incorrect city!");
        }

        if (bothinput.contains(input)){
            System.out.println("It was used!");
        }else{

            bothinput.add(input);}

        System.out.println(bothinput);
    }
}
