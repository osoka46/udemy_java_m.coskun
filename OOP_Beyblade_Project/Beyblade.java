package OOP_Beyblade_Project;

public class Beyblade {
    private String beyBladeci;
    private int donusHizi;
    private int saldiriGucu;

    public Beyblade(String beyBladeci, int donusHizi, int saldiriGucu) {
        this.beyBladeci = beyBladeci;
        this.donusHizi = donusHizi;
        this.saldiriGucu = saldiriGucu;
    }

    public String getBeyBladeci() {
        return beyBladeci;
    }

    public void setBeyBladeci(String beyBladeci) {
        this.beyBladeci = beyBladeci;
    }

    public int getDonusHizi() {
        return donusHizi;
    }

    public void setDonusHizi(int donusHizi) {
        this.donusHizi = donusHizi;
    }

    public int getSaldiriGucu() {
        return saldiriGucu;
    }

    public void setSaldiriGucu(int saldiriGucu) {
        this.saldiriGucu = saldiriGucu;
    }
    public void saldir()
    {
        System.out.println(beyBladeci+" "+ saldiriGucu+" ve "+ donusHizi+ "ile saldiriyor");

    }
    public void canavariOrtayaCikar()
    {
        System.out.println("kutsal canavar bulunmuyor");

    }
    public void bilgileriGoster()
    {
        System.out.println("beylabedeci: "+beyBladeci);
        System.out.println("saldiri gucu: "+saldiriGucu);
        System.out.println("donus hizi: "+donusHizi);
    }
}
