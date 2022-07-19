package Radyo;

public class Main {
    public static void main(String[] args) {
        String []arr={"A","B","C","D","E","F","G","F"};

        Radyo radyo=new Radyo(arr);

        for (String temp:radyo)
        {
            System.out.println(temp);
        }

    }
}