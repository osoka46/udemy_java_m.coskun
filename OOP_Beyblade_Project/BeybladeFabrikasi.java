package OOP_Beyblade_Project;

public class BeybladeFabrikasi {

    public Beyblade beybladeUret(String turu) {
        if (turu.equals("dragon")) {
            return new Dragon("takao", "mavi ejderha", 800, 300);
        } else if (turu.equals("dranza")) {
            return new Dranza("kai", "anka kusu", 600, 400);
        } else if (turu.equals("drayga")) {
            return new Drayga("rei", " beyaz kaplan", 600, 200);
        } else if (turu.equals("draciel")) {
            return new Draciel("kai", "anka kusu", 600, 400);
        }
        return null;
    }
}
