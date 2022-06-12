package OOP_Employee_Project;

public class Yazilimci extends Calisan{
    private String diller;



    public Yazilimci(String ad, String soyAd, int id, String diller) {
        super(ad, soyAd, id);
        this.diller = diller;
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("bilidigi diller: "+diller);
    }
}
