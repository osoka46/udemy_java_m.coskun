package OOP_Exercise_Project;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int burpe,pushup,situp,squat;
        Scanner input=new Scanner(System.in);

        System.out.println("hosgeldiniz\n idmanlar \n1. burpee\n2.pushup\n3.situp\n4.squat ");

        System.out.println("hedeflerinizi giriniz. burpee: ");
        burpe=input.nextInt();
        System.out.println("hedeflerinizi giriniz. pushup: ");
        pushup=input.nextInt();
        System.out.println("hedeflerinizi giriniz. situp: ");
        situp=input.nextInt();
        System.out.println("hedeflerinizi giriniz. squat: ");
        squat=input.nextInt();
        input.nextLine();


        Idman nesne=new Idman(burpe,pushup,squat,situp);
        System.out.println("idman basliyor.");
        while (!nesne.bittimi())
        {
            System.out.println("hareket turunu gir");
            String hareketturu=input.nextLine();
            System.out.println("sayiyi gir");
            int sayi=input.nextInt();
            input.nextLine();
            nesne.hareketYap(hareketturu,sayi);
        }
        System.out.println("tebrikler");
    }
}
