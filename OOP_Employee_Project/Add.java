package OOP_Employee_Project;

import java.util.Arrays;
import java.util.Scanner;

public class Add {
    public void run() {
        Scanner input = new Scanner(System.in);
        Yazilimci[] yazilimcis;
        Yonetici[] yoneticis;
        Calisan[] calisans;
        String ad;
        String soyAd;
        String diller;
        int id, sorumluSayisi;

        String islemler = "islemler: \n" +
                "1. yazilimci ekle\n" +
                "2. yonetici ekle\n" +
                "3. calisan ekle \n" +
                "q. cikis yap\n";

        while (true) {
            System.out.println("secim yapiniz:\n"+islemler);
            String select = input.nextLine();
            switch (select) {
                case "1":
                    System.out.println("kac tane yazilimci eklemek istiyorsun");
                    int yazilimciSayisi = input.nextInt();
                    input.nextLine();
                    yazilimcis = new Yazilimci[yazilimciSayisi];

                    for (int a = 0; a < yazilimciSayisi; a++) {
                        System.out.println("ad: ");
                        ad = input.nextLine();
                        System.out.println("soyad: ");
                        soyAd = input.nextLine();
                        System.out.println("diller: ");
                        diller = input.nextLine();
                        System.out.println("id: ");
                        id = input.nextInt();
                        input.nextLine();
                        yazilimcis[a] = new Yazilimci(ad, soyAd, id, diller);
                    }
                    System.err.println("tum yazilimcilarin bilgileri");
                    for (Yazilimci a:yazilimcis)
                    {
                        a.bilgileriGoster();
                    }
                   break;
                case "2":
                    System.out.println("kac tane yonetici eklmek istiyorsun");
                    int yoneticiSayisi = input.nextInt();
                    input.nextLine();
                    yoneticis = new Yonetici[yoneticiSayisi];

                    for (int a = 0; a < yoneticiSayisi; a++) {
                        System.out.println("ad: ");
                        ad = input.nextLine();
                        System.out.println("soyad: ");
                        soyAd = input.nextLine();
                        System.out.println("id: ");
                        id = input.nextInt();
                        System.out.println("sorumlu kisi sayisi: ");
                        sorumluSayisi = input.nextInt();
                        input.nextLine();
                        yoneticis[a] = new Yonetici(ad, soyAd, id, sorumluSayisi);
                    }
                    System.err.println("tum yonetici bilgileri");
                    for (Yonetici a:yoneticis)
                    {
                        a.bilgileriGoster();
                    }
                    break;
                case "3": {
                    System.out.println("kac tane calisan eklmek istiyorsun");
                    int calisanSayisi = input.nextInt();
                    input.nextLine();
                    calisans = new Yonetici[calisanSayisi];
                    for (int a = 0; a < calisanSayisi; a++) {
                        System.out.println("ad: ");
                        ad = input.nextLine();
                        System.out.println("soyad: ");
                        soyAd = input.nextLine();
                        System.out.println("id: ");
                        id = input.nextInt();
                    }
                    System.err.println("tum calisan bilgileri");

                    for (Calisan a:calisans)
                    {
                        a.bilgileriGoster();
                    }
                    break;
                }
                case "q":
                {
                    System.out.println("cikis yaptiniz");
                    return;
                }
                default:
                    System.out.println("yanlis secim yaptiniz tekrar deneyinz");
            }
        }
    }
}
