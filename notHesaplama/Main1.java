package notHesaplama;

import java.io.*;
import java.util.Scanner;

public class Main1 {
    public static void writer() {
        try (FileWriter writer = new FileWriter("deneme.txt")) {
            writer.write("osman bozdag, hukuk\n");
            writer.write("rabia bozdag, hukuk\n");
            writer.write("sukru cebeci, iktisat\n");
            writer.write("oguz kanks,bilgisayar");

        } catch (IOException e) {
            e.printStackTrace();
        }
        reader();
    }

    public static void reader() {

        try (Scanner input=new Scanner(new BufferedReader(new FileReader("deneme.txt")))) {
            while (input.hasNextLine())
            {
                System.out.println("okunan satirlar: "+input.nextLine());
            }

        } catch (FileNotFoundException e) {
            System.out.println("dosya bulunamadi");
        }
    }

    public static void main(String[] args) {

        writer();
    }
}