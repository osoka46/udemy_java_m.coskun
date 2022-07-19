package acilServis;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Ekleme {
    Queue<Hasta> hastalar;
    Scanner input;

    Ekleme() {
        hastalar = new PriorityQueue<Hasta>();
        input = new Scanner(System.in);
    }

    public void run() {

        while (true) {
            int hastaSayisi=0;
            System.out.println("Hasta eklemek istiyorsaniz,'y' \nHasta siralamasini gormek istiyrsaniz 'p'\nCikmak istiyorsaniz 'q' basiniz ");
            String secenek = input.nextLine();
            if (secenek.equals("y")) {
                add();
                hastaSayisi++;
            } else if (secenek.equals("q")) {
                System.out.println("Cikis yapiliyor");
                break;
            } else if (secenek.equals("p")) {
                if(hastalar.isEmpty())
                {
                    System.out.println("Henuz hicbir hasta ekli degil. Oncelikle hasta ekleyiniz");
                }else
                {
                    while (!hastalar.isEmpty())
                    {
                        System.out.println(hastalar.peek());
                        hastalar.poll();
                    }
                    break;
                }
            } else {
                System.out.println("yanlis giris yaptiniz");
            }
        }
    }

    public Queue<Hasta> add() {
        System.out.println("Hasta ekleme ekranina hosgeldiniz.Yeni hasta eklemek icin bilgileri giriniz: ");
        String name, lastName;
        int age, choose;
        System.out.println("adiniz: ");
        name = input.nextLine();
        System.out.println("soy adiniz: ");
        lastName = input.nextLine();
        System.out.println("yasiniz: ");
        age = input.nextInt();
        System.out.println("hastaliginizi seciniz:\n1. Apandis" +
                "\n2. Grip" +
                "\n3. Bas Agrisi ");
        choose = input.nextInt();
        input.nextLine();

        hastalar.offer(new Hasta(name, lastName, age, choose));
        return hastalar;
    }
}
