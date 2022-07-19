package Mp3kopyalama;

import java.io.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Yeni nesne = new Yeni();
        nesne.oku();
        long baslangic=System.currentTimeMillis();
        Thread th1=new Thread(new Runnable() {
            @Override
            public void run() {
                nesne.kopyala("1.mp3");
            }
        });
        Thread th2=new Thread(new Runnable() {
            @Override
            public void run() {
                nesne.kopyala("2.mp3");
            }
        });
        Thread th3=new Thread(new Runnable() {
            @Override
            public void run() {
                nesne.kopyala("3.mp3");
            }
        });
        th1.start();
        th2.start();
        th3.start();

        try {
            th1.join();
            th2.join();
            th3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long bitis=System.currentTimeMillis();
        System.out.println("isimiz bitti. sny: "+(bitis-baslangic));
    }

}