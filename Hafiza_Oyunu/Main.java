package Hafiza_Oyunu;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static Kart kartlar[][] = new Kart[4][4];


    public static void oyunTahtasi() {

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (kartlar[i][j].isTahmin()) {
                    System.out.print(kartlar[i][j].getDeger() + "  ");
                }
            }
            System.out.println();
            System.out.println();
        }
    }

    public static void creatArr() {
        char deger = 'A';
        for (int i = 0; i < kartlar.length; i++) {
            for (int j = 0; j < kartlar[i].length; j++) {
                kartlar[i][j] = new Kart(deger++);
            }
        }
    }

    public static boolean oyunBittimi() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (!kartlar[i][j].isTahmin())
                    return false;
            }
        }
        return true;
    }
    public static void tahminEt()
    {
        Scanner input=new Scanner(System.in);
        System.out.println("tahmin et: x ve y degerlerini 1 bosluk ile girin: \n");
        int i1= input.nextInt();
        int j1= input.nextInt();
        kartlar[i1][j1].setTahmin(true);
        oyunTahtasi();
        System.out.println("tahmin et: x ve y degerlerini 1 bosluk ile girin:\n");
        int i2= input.nextInt();
        int j2= input.nextInt();

        if (kartlar[i1][j1].getDeger()==kartlar[i2][j2].getDeger())
        {
            kartlar[i1][j2].setTahmin(true);

        }else {
            kartlar[i1][j1].setTahmin(false);
        }
    }

    public static void main(String[] args) {
        creatArr();
        while (!oyunBittimi())
        {
            oyunTahtasi();
            tahminEt();
        }

      //  oyunTahtasi();

    }
}

/*
for (Kart kart[]:kartlar)
        {
        for (Kart kart1:kart) {
        System.out.print(kart1.getDeger()+"  ");
        }
        System.out.println();
        System.out.println();
        }*/
