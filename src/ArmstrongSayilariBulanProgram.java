import java.util.Scanner;

public class ArmstrongSayilariBulanProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sayi, basamak, toplam = 0;

        System.out.print("Bir sayı giriniz: ");
        sayi = scanner.nextInt();

        sayi = Math.abs(sayi); //Sayıyı pozitife çeviriyor.

        while (sayi != 0) {
            basamak = sayi % 10;
            toplam += basamak;
            sayi /= 10;
        }

        System.out.println("Basamakların toplamı: " + toplam);
    }
}
