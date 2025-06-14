import java.util.Scanner;

public class GirilenSayilardanMinveMaxDegerleriniBulmaProgrami {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, sayi, enBuyuk = Integer.MIN_VALUE, enKucuk = Integer.MAX_VALUE;

        System.out.print("Kaç tane sayı gireceksiniz: ");
        n = input.nextInt();

        if (n <= 0) {
            System.out.println("Geçerli bir sayı adedi giriniz.");
            return;
        }

        for (int i = 1; i <= n; i++) {
            System.out.print(i + ". sayıyı giriniz: ");
            sayi = input.nextInt();

            if (sayi > enBuyuk) {
                enBuyuk = sayi;
            }

            if (sayi < enKucuk) {
                enKucuk = sayi;
            }
        }

        System.out.println("En büyük sayı: " + enBuyuk);
        System.out.println("En küçük sayı: " + enKucuk);
    }
}
