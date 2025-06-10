import java.util.Scanner;

public class SinifiGecmeDurumunuHesaplayanProgram {
    public static void main(String[] args) {
        int matematik, turkce, kimya, muzik, fizik;
        int toplam = 0;
        int dersSayisi = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik sınav notunuzu giriniz: ");
        matematik = input.nextInt();
        if (matematik >= 0 && matematik <= 100) {
            toplam += matematik;
            dersSayisi++;
        }

        System.out.print("Türkçe sınav notunuzu giriniz: ");
        turkce = input.nextInt();
        if (turkce >= 0 && turkce <= 100) {
            toplam += turkce;
            dersSayisi++;
        }

        System.out.print("Fizik sınav notunuzu giriniz: ");
        fizik = input.nextInt();
        if (fizik >= 0 && fizik <= 100) {
            toplam += fizik;
            dersSayisi++;
        }

        System.out.print("Kimya sınav notunuzu giriniz: ");
        kimya = input.nextInt();
        if (kimya >= 0 && kimya <= 100) {
            toplam += kimya;
            dersSayisi++;
        }

        System.out.print("Müzik sınav notunuzu giriniz: ");
        muzik = input.nextInt();
        if (muzik >= 0 && muzik <= 100) {
            toplam += muzik;
            dersSayisi++;
        }

        if (dersSayisi == 0) {
            System.out.println("Geçerli bir not girmediniz. Ortalama hesaplanamadı.");
        } else {
            double ortalama = (double) toplam / 5;
            System.out.println("Ortalamanız: " + ortalama);

            if (ortalama < 55) {
                System.out.println("Sınıfta kaldınız, seneye tekrar görüşmek üzere!");
            } else {
                System.out.println("Tebrikler, sınıfı geçtiniz!");
            }
        }
    }
}