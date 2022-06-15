package Hafiza_Oyunu;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Kart[][] kartlar = new Kart[4][4];

    public static void creatArr() {
        kartlar[0][0] = new Kart('A');
        kartlar[0][1] = new Kart('A');
        kartlar[0][2] = new Kart('B');
        kartlar[0][3] = new Kart('B');
        kartlar[1][0] = new Kart('C');
        kartlar[1][1] = new Kart('C');
        kartlar[1][2] = new Kart('D');
        kartlar[1][3] = new Kart('D');
        kartlar[2][0] = new Kart('E');
        kartlar[2][1] = new Kart('E');
        kartlar[2][2] = new Kart('F');
        kartlar[2][3] = new Kart('F');
        kartlar[3][0] = new Kart('G');
        kartlar[3][1] = new Kart('G');
        kartlar[3][2] = new Kart('H');
        kartlar[3][3] = new Kart('H');
    }

    public static void createTable() {
        for (Kart[] arr : kartlar) {
            for (Kart items : arr) {
                if (items.isTahmin()) {
                    System.out.print(" |" + items.getDeger() + " |");
                } else {
                    System.out.print(" |" + " |");
                }
            }
            System.out.println();
        }
    }

    public static void tahminEt() {
        Scanner input = new Scanner(System.in);
        int x1, x2, y1, y2;
        System.out.println("arada bosluk birakarak ilk kordinati 0-3 arasi 2 adet sayi giriniz: \n");
        x1 = input.nextInt();
        y1 = input.nextInt();
        kartlar[x1][y1].setTahmin(true);
        createTable();
        System.out.println("arada bosluk birakarak ikinci kordinati 0-3 arasi 2 adet sayi giriniz: \n");
        x2 = input.nextInt();
        y2 = input.nextInt();
        if (kartlar[x1][y1].getDeger() == kartlar[x2][y2].getDeger()) {
            System.out.println("dogru tahmin");
            kartlar[x1][y1].setTahmin(true);
            kartlar[x2][y2].setTahmin(true);
        } else {
            System.out.println("yanlis tahmin");
            kartlar[x1][y1].setTahmin(false);
        }
    }
    public static boolean oyunBittimi()
    {
        for (Kart[] arr : kartlar) {
            for (Kart items : arr) {
                if (!items.isTahmin()) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        creatArr();
        while (!oyunBittimi())
        {
            createTable();
            tahminEt();
        }
    }
}
