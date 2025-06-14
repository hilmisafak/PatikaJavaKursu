import java.util.Scanner;

public class GirilenSayiyaKadarOlanCiftSayilariBulanProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sayi, toplam = 0, adet = 0;
        double ortalama;

        System.out.print("Bir sayı giriniz: ");
        sayi = scanner.nextInt();

        for (int i = 0; i <= sayi; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                toplam += i;
                adet++;
            }
        }

        if (adet > 0) {
            ortalama = (double) toplam / adet;
            System.out.println("3 ve 4'e tam bölünen sayıların ortalaması: " + ortalama);
        } else {
            System.out.println("3 ve 4'e tam bölünen herhangi bir sayı bulunamadı.");
        }
    }
}
