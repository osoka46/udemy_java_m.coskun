package ramazanPidesi;

import javax.xml.transform.Source;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random=new Random();
        int pidesayisi=random.nextInt(10);

        Queue<String>queue=new LinkedList<String>();
        queue.offer("A");
        queue.offer("B");
        queue.offer("C");
        queue.offer("D");
        queue.offer("E");
        queue.offer("F");
        queue.offer("G");
        queue.offer("H");
        queue.offer("I");

        System.out.println("pideler cikiyor");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        while (pidesayisi>0)
        {
            System.out.println(queue.peek());
            queue.poll();
            pidesayisi--;
        }
        System.out.println("pide aldilar");



    }
}