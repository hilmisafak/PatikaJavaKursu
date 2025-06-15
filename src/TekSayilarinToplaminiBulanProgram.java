import java.util.Scanner;

public class TekSayilarinToplaminiBulanProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long sayi, toplam = 0;

        do {
            System.out.print("Bir sayı giriniz (tek sayı girilince program bitecek): ");
            sayi = scanner.nextInt();

            if (sayi % 4 == 0) {
                toplam += sayi;
            }

        } while (sayi % 2 == 0);

        System.out.println("Girilen çift ve 4'ün katı olan sayıların toplamı: " + toplam);
    }
}
