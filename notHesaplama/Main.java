package notHesaplama;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static String harfnotu(String isim, int vize1, int vize2, int finalnotu) {
        String cikti = "";
        double toplamnot = (vize1 * 3 / 10.0) + (vize2 * 3 / 10.0) + (finalnotu * 6 / 10.0);

        if (toplamnot >= 90) {
            cikti = isim + " bu dersten AA aldi";

        } else if (toplamnot >= 85) {
            cikti = isim + " bu dersten BA aldi";
        } else if (toplamnot >= 80) {
            cikti = isim + " bu dersten BB aldi";
        } else if (toplamnot >= 70) {
            cikti = isim + " bu dersten C aldi";
        } else if (toplamnot >= 50) {
            cikti = isim + " bu dersten D aldi";
        } else {
            cikti = isim + " bu dersten FF aldi";
        }
        return cikti;
    }

    public static void yazdir() {
        try (FileWriter writer = new FileWriter("notlar.txt");
             Scanner input = new Scanner(new FileReader("deneme.txt"))) {

            while (input.hasNextLine()) {
                String ogrencibilgileri = input.nextLine();
                String[] arr = ogrencibilgileri.split(",");
                int vize1 = Integer.valueOf(arr[1]);
                int vize2 = Integer.valueOf(arr[2]);
                int vize3 = Integer.valueOf(arr[3]);
                String cikti = harfnotu(arr[0], vize1, vize2, vize3);
                writer.write(cikti+"\n");
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        yazdir();
    }
}
