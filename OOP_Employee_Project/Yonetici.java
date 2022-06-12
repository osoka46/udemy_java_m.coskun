package OOP_Employee_Project;

public class Yonetici extends Calisan{
    private int sorumluKisisayisi;

    public Yonetici(String ad, String soyAd, int id, int sorumluKisisayisi) {
        super(ad, soyAd, id);
        this.sorumluKisisayisi = sorumluKisisayisi;
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("sorumlu oldugu kisi sayisi: "+sorumluKisisayisi);
    }

}
