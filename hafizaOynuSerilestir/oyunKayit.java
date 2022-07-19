package hafizaOynuSerilestir;

import java.io.*;

public class oyunKayit {
    public static void oyunKaydet(Kart[][]karts)
    {
        try(ObjectOutputStream stream=new ObjectOutputStream(new FileOutputStream("kartoyunu.bin"))) {
            System.out.println("oyun kayit ediliyor");
            stream.writeObject(karts);
        } catch (FileNotFoundException e) {
            System.out.println("okunurken hata");
        } catch (IOException e) {
            System.out.println("bir hata olustu");
        }

    }
    public static Kart[][] kayittanAl()
    {

        try(ObjectInputStream stream=new ObjectInputStream(new FileInputStream("kartoyunu.bin"))) {
            Kart[][]karts= (Kart[][]) stream.readObject();
           return karts;

        } catch (FileNotFoundException e) {
            System.out.println("okunurken hata");
        } catch (IOException e) {
            System.out.println("bir hata olustu");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

}
