import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        String dosyaYolu = "sayilar.txt";
        int toplam = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(dosyaYolu))) {
            String satir;
            while ((satir = br.readLine()) != null) {
                toplam += Integer.parseInt(satir);
            }
            System.out.println("Dosyadaki sayıların toplamı: " + toplam);
        } catch (IOException e) {
            System.err.println("Dosya okuma hatası: " + e.getMessage());
        }
    }
}