package OOP_ATM_Project;

import java.util.Scanner;

public class ATM {
    public void calis(Hesap hesap) {
        int girisHakki = 3;
        Login login = new Login();

        Scanner scanner = new Scanner(System.in);
        System.out.println("bankaya hosgeldiniz\n");

        while (true) {
            if (login.login(hesap)) {
                System.out.println("basarili");
                break;
            } else {
                System.out.println("basarisiz");
                girisHakki--;
                System.out.println("kalan giris hakkiniz: " + girisHakki);
            }
            if (girisHakki == 0) {
                System.out.println("giris hakkiniz bitti");
                return;
            }
        }

        String islemler = "1. bakiye goruntule " +
                "2. para yatirma " +
                "3. para cekme " +
                "cikis icin q ya basiniz.";
        System.out.println(islemler);

        while (true) {
            System.out.println("islem seciniz");
            String islem = scanner.nextLine();
            if (islem.equals("q")) {
                break;
            } else if (islem.equals("1")) {
                System.out.println("bakiyeniz: " + hesap.getBakiye());

            } else if (islem.equals("2")) {
                System.out.println("yatiracaginiz miktar: ");
                int miktar = scanner.nextInt();
                scanner.nextLine();
                if (miktar < 0) {
                    System.out.println("yatirilacak miktar 0 a esit yada kucuk olamaz");
                } else {
                    hesap.paraYatir(miktar);
                    System.out.println("yeni bakiyeniz: " + hesap.getBakiye());
                }
            } else if (islem.equals("3")) {
                System.out.println("cekeceginiz miktar");
                int miktar = scanner.nextInt();
                scanner.nextLine();
                if (miktar < 0) {
                    System.out.println("0 dan kucuk sayi giremezsiniz");
                } else {
                    hesap.paraCek(miktar);
                }
            } else {
                System.out.println("gecersiz secim");
            }
        }
    }
}
