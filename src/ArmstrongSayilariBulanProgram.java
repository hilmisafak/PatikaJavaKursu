import java.util.Scanner;

public class ArmstrongSayilariBulanProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sayi, basamak, toplam = 0;

        System.out.print("Bir sayı giriniz(Pozitif+): ");
        sayi = scanner.nextInt();

        if (sayi < 0) {
            System.out.println("Girdiğiniz sayı pozitif olmalıdır.");
        } else {
            while (sayi != 0) {
                basamak = sayi % 10;
                toplam += basamak;
                sayi /= 10;
            }

            System.out.println("Basamakların toplamı: " + toplam);
        }
    }
}