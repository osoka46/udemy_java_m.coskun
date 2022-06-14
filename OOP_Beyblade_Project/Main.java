package OOP_Beyblade_Project;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("hosgeldiniz.");
        String secim;

        while (true) {

            System.out.println("uretmek istediginiz beyblade yi seciniz.\ndragon\ndranza\ndrayga\ndraciel\nq exit\n ");

            secim = input.nextLine();
            if (secim == "q") {
                System.out.println("cikis yaptiniz");
                break;
            } else {
                BeybladeFabrikasi beybladeFabrikasi = new BeybladeFabrikasi();

                Beyblade beyblade = beybladeFabrikasi.beybladeUret(secim);
                if (beyblade == null) {
                    System.out.println("gecersiz secim yaptiniz");
                } else {
                    beyblade.bilgileriGoster();
                }


            }
        }
    }
}