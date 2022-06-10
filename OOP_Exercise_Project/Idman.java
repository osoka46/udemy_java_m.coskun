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

    public void burpeYap(int sayi) {
        if (burpetSayisi == 0) {
            System.out.println("yapacak burpee kalmadi");
            kalanlar();
        }
        if(burpetSayisi-sayi<0)
        {
            System.out.println("hedefledigin sayiyi gectin tebrikler");
            burpetSayisi=0;
            System.out.println("kalan burpee sayi: "+ burpetSayisi);
            kalanlar();
        }else {
            burpetSayisi-=sayi;
            System.out.println("kalan burpee sayisi: "+burpetSayisi);
            kalanlar();
        }
    }
    public void pushUpYap(int sayi) {
        if (pushUpSayisi == 0) {
            System.out.println("yapacak pushup kalmadi");
            kalanlar();
        }
        if(pushUpSayisi-sayi<0)
        {
            System.out.println("hedefledigin sayiyi gectin tebrikler");
            pushUpSayisi=0;
            System.out.println("kalan pushup sayi: "+ pushUpSayisi);
            kalanlar();
        }else {
            pushUpSayisi-=sayi;
            System.out.println("kalan pushup: "+pushUpSayisi);
            kalanlar();
        }
    }
    public void sitUpYap(int sayi) {
        if (sitUpSayisi == 0) {
            System.out.println("yapacak situp kalmadi");
            kalanlar();
        }
        if(sitUpSayisi-sayi<0)
        {
            System.out.println("hedefledigin sayiyi gectin tebrikler");
            sitUpSayisi=0;
            System.out.println("kalan situp sayi: "+ sitUpSayisi);
            kalanlar();
        }else {
            sitUpSayisi-=sayi;
            System.out.println("kalan situp: "+sitUpSayisi);
            kalanlar();
        }
    }
    public void squatYap(int sayi) {
        if (squatSayisi == 0) {
            System.out.println("yapacak squat kalmadi");
            kalanlar();
        }
        if(squatSayisi-sayi<0)
        {
            System.out.println("hedefledigin sayiyi gectin tebrikler");
            squatSayisi=0;
            System.out.println("kalan squat sayi: "+ squatSayisi);
            kalanlar();
        }else {
            squatSayisi-=sayi;
            System.out.println("kalan squat: "+squatSayisi);
            kalanlar();
        }
    }
    public void kalanlar()
    {
        System.out.printf("kalan adet:\n pushup: %d\n situp: %d\n squat: %d\n burpee: %d\n  ",pushUpSayisi,sitUpSayisi,squatSayisi,burpetSayisi);
    }
    public boolean bittimi()
    {
        return (squatSayisi==0&&sitUpSayisi==0)&&(pushUpSayisi==0&&burpetSayisi==0);
    }

}
