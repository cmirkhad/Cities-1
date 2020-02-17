package CityGame;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class TextList {
    private ArrayList<String> mainText = new ArrayList<String>();
    ArrayList<String> copylist;
    private void copy() {
        try (BufferedReader br = new BufferedReader(new FileReader("C://Users//User//IdeaProjects//Khjf//src//Cities//cities.txt"))) {
            String sCurrentLine;
            while ((sCurrentLine = br.readLine()) != null) {
                mainText.add(sCurrentLine);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        Collections.sort(mainText);
        copylist = new ArrayList<>(mainText);

    }

    public void show(){
        copy();


    }


}



