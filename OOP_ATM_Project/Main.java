package OOP_ATM_Project;
public class Main {
    public static void main(String[] args) {
        ATM nesne=new ATM();
        Hesap hesap=new Hesap("osman","123",2000);


        nesne.calis(hesap);
        System.out.println("cikis yaptiniz");

    }
}
