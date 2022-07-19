package acilServis;

public class Hasta implements Comparable<Hasta> {
    private String name;
    private String lastName;
    private int hastalik;
    private String hastalikText;
    private int age;


    public Hasta(String name, String lastName, int age, int hastalik) {
        this.name = name;
        this.lastName = lastName;
        this.hastalik = hastalik;
        this.age = age;
    }

    @Override
    public int compareTo(Hasta o) {
        if (o.hastalik > this.hastalik) {
            return 1;
        } else if (o.hastalik < this.hastalik) {
            return -1;
        }
        return 0;
    }

    @Override
    public String toString() {
        switch (hastalik) {
            case 1:
                hastalikText = "Bas agrisi";
                break;
            case 2:
                hastalikText = "Apandist";
                break;
            case 3:
                hastalikText = "Grip";
                break;
        }
        String yazdir = "Hasta adi ve soyadi : " + name + " " + lastName + "\n" + "yasi: " + age + " " + " hastaligi: " + hastalikText;
        return yazdir;
    }
}
