import java.util.Scanner;

public class HarmonikSayilariBulanProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        double toplam = 0.0;

        System.out.print("Bir sayı giriniz: ");
        n = scanner.nextInt();


        for (int i = 1; i <= n; i++) {
            toplam += 1.0 / i;
        }

        System.out.println("Harmonik seri toplamı: " + toplam);
    }
}
