package OOP_Beyblade_Project;

public class Drayga extends Beyblade{
    private String kutsalCanavar;

    public Drayga(String beyBladeci,String kutsalCanavar,int donusHizi, int saldiriGucu) {
        super(beyBladeci, donusHizi, saldiriGucu);
        this.kutsalCanavar=kutsalCanavar;
    }
    @Override
    public void canavariOrtayaCikar() {

        System.out.printf("%s, %s'i ortaya cikariyor. ",super.getBeyBladeci(),this.kutsalCanavar);
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("kutsal canavar: "+kutsalCanavar);
    }
}