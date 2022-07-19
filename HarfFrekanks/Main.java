package HarfFrekanks;

import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("type a text");
        String text=input.nextLine();
        TreeMap<Character,Integer>frekans=new TreeMap<Character,Integer>();

        for (int i =0; i<text.length(); i++) {
            char c=text.charAt(i);

            if(frekans.containsKey(c))
            {
                frekans.replace(c,frekans.get(c)+1);
            }
            else {
                frekans.put(c,1);
            }
        }

        System.out.println(frekans.entrySet());


    }
}