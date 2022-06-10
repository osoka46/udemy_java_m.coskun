package OOP_Exercise_Project;

public class Idman {
    private int burpetSayisi;
    private int pushUpSayisi;
    private int squatSayisi;
    private int sitUpSayisi;

    public Idman(int burpetSayisi, int pushUpSayisi, int squatSayisi, int sitUpSayisi) {
        this.burpetSayisi = burpetSayisi;
        this.pushUpSayisi = pushUpSayisi;
        this.squatSayisi = squatSayisi;
        this.sitUpSayisi = sitUpSayisi;
    }

    public int getBurpetSayisi() {
        return burpetSayisi;
    }

    public void setBurpetSayisi(int burpetSayisi) {
        this.burpetSayisi = burpetSayisi;
    }

    public int getPushUpSayisi() {
        return pushUpSayisi;
    }

    public void setPushUpSayisi(int pushUpSayisi) {
        this.pushUpSayisi = pushUpSayisi;
    }

    public int getSquatSayisi() {
        return squatSayisi;
    }

    public void setSquatSayisi(int squatSayisi) {
        this.squatSayisi = squatSayisi;
    }

    public int getSitUpSayisi() {
        return sitUpSayisi;
    }

    public void setSitUpSayisi(int sitUpSayisi) {
        this.sitUpSayisi = sitUpSayisi;
    }

    public void hareketYap(String hareketTuru, int sayi) {
        if (hareketTuru.equals("burpee")) {
            burpeYap(sayi);
        } else if (hareketTuru.equals("pushup")) {
            pushUpYap(sayi);
        } else if (hareketTuru.equals("situp")) {
            sitUpYap(sayi);

        } else if (hareketTuru.equals("squat")) {
            squatYap(sayi);
        } else {
            System.out.println("gecersiz hareket");
        }
    }

    public void squatYap(int sayi) {
        if (squatSayisi < 0) {
            System.out.println("yapacak squat kalmadi");
        }
        if (squatSayisi-sayi<0)
        {
            System.out.println();
        }
    }

    public void sitUpYap(int sayi) {
        if (sitUpSayisi <= 0) {
            System.out.println("yapacak situp kalmadi");
        }
    }

    public void pushUpYap(int sayi) {
        if (pushUpSayisi <= 0) {
            System.out.println("yapacak pushup kalmadi");
        }
    }

    public void burpeYap(int sayi) {
        if (burpetSayisi <= 0) {
            System.out.println("yapacak burpee kalmadi");
        }
    }

}
