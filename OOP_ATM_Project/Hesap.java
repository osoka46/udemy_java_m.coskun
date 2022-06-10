package OOP_ATM_Project;

public class Hesap {
    private String kullaniciAdi;
    private String parola;
    private int bakiye;

    public Hesap(String kullaniciAdi, String parola, int bakiye) {
        this.kullaniciAdi = kullaniciAdi;
        this.parola = parola;
        this.bakiye = bakiye;
    }

    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    public String getParola() {
        return parola;
    }

    public int getBakiye() {
        return bakiye;
    }

    public void paraYatir(int tutar) {
        bakiye += tutar;
    }

    public void paraCek(int tutar) {
        if (bakiye - tutar < 0) {
            System.out.println("bakiyeniz yeterli degil");
        } else {
            bakiye -= tutar;
            System.out.println("yeni bakiyeniz: " + bakiye);
        }
    }
}
