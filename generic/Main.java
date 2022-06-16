package generic;

public class Main {
    public static void main(String[] args) {
        sayisal ogrenci1=new sayisal(1,5);
        sayisal ogrenci2=new sayisal(2,5);
        sozel ogrenci3=new sozel(1,5);
        sozel ogrenci4=new sozel(2,3);

        System.out.println(birinci(ogrenci1,ogrenci3));
        System.out.println(birinci(ogrenci3,ogrenci4));

    }
    public static <E extends Aday>E birinci(E ogrenci1,E ogrenci2)
    {
      return ogrenci1.puanhesapla()> ogrenci2.puanhesapla()?ogrenci1:ogrenci2;
    }
}
class sayisal extends Aday{
    private int fizik;
    private int kimya;
    private String ogrenci="Sayisalogrenci";

    public sayisal(int fizik, int kimya) {
        this.fizik = fizik;
        this.kimya = kimya;
    }

    @Override
    public int puanhesapla() {
        return fizik*kimya;
    }

    @Override
    public String toString() {
        return ogrenci;
    }
}

class sozel extends Aday{
    private int turkce;
    private int edebiyat;
    private String ogrenci="Sozelogrenci";

    public sozel(int turkce, int edebiyat) {
        this.turkce = turkce;
        this.edebiyat = edebiyat;

    }

    @Override
    public int puanhesapla() {
        return turkce*edebiyat;
    }
    @Override
    public String toString() {
        return ogrenci;
    }
}
