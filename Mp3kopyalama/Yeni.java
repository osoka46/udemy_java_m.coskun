package Mp3kopyalama;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Yeni {
    private ArrayList<Integer> icerik = new ArrayList<Integer>();

    public void oku() {
        try( FileReader in = new FileReader("Yiruma.mp3")) {
            int sayi;
            while ((sayi = in.read()) != -1) {
                icerik.add(sayi);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void kopyala(String isim) {

        try (  FileWriter out = new FileWriter(isim)){

            for (int deger : icerik) {
                out.write(deger);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
