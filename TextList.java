package CityGame;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class TextList {
    /*public static void main(String[] args) throws FileNotFoundException {
        ArrayList<String> mainText=new ArrayList<String>();
        File file= new File("C:\\Users\\Наталья\\Desktop\\cities.txt");
        Scanner myReader=new Scanner(file);
        while (myReader.hasNextLine()){
            String words=myReader.nextLine();
            mainText.add(words);
        }
        myReader.close();*/
    private static void copy() {
        ArrayList<String> mainText = new ArrayList<String>();
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\\\Users\\\\Наталья\\\\Desktop\\\\cities.txt"))) {

            String sCurrentLine;

            while ((sCurrentLine = br.readLine()) != null) {
                mainText.add(sCurrentLine);

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        ArrayList<String> copyList = new ArrayList<String>(mainText);


        Collections.sort(mainText);

        ArrayList<String> copyText = new ArrayList<String>(mainText);
        System.out.println(copyText);
        ArrayList<Integer> indexes = new ArrayList();
        for (int j = 65; j < 91; j++) {
            for (int i = 0; i < 15494; i++) {
                String a = copyText.get(i);
                if (a.charAt(0) == j) {
                    int index = i;
                    System.out.println(index);
                    indexes.add(index);
                    break;
                }
            }
        }
    }


    }








