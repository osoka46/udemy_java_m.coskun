package Hafiza_Oyunu;

public class Kart {
    private char deger;
    private boolean tahmin;


    public Kart(char deger) {
        this.deger = deger;
    }
    public char getDeger() {
        return deger;
    }
    public void setDeger(char deger) {
        this.deger = deger;
    }
    public boolean isTahmin() {
        return tahmin;
    }
    public void setTahmin(boolean tahmin) {
        this.tahmin = tahmin;
    }
}
