package PalindromSayilar;

import java.util.ListIterator;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static boolean check(Stack<Character>characters,String text)
    {
        for (int i=0;i<text.length();i++)
        {
            if (text.charAt(i)!=characters.peek())
            {
               return false;
            }
            characters.pop();
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("type a word");
        String text= input.nextLine();

        Stack<Character>strings=new Stack<Character>();
        for (int i=0;i<text.length();i++)
        {
            char c=text.charAt(i);
            strings.push(c);
        }
        if(check(strings,text))
        {
            System.out.println("polindromdur");
        }else {
            System.out.println("polindrom degildir");
        }
    }
}