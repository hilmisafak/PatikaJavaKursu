import java.util.Scanner;

public class FaktoriyelHesaplayanProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, r;
        long kombinasyon;


        System.out.print("n değerini giriniz: ");
        n = scanner.nextInt();

        System.out.print("r değerini giriniz: ");
        r = scanner.nextInt();

        if (r > n || n < 0 || r < 0) {
            System.out.println("Hatalı giriş! n >= r ve her iki değer >= 0 olmalıdır.");
        } else {
            kombinasyon = faktoriyel(n) / (faktoriyel(r) * faktoriyel(n - r));
            System.out.println("C(" + n + ", " + r + ") = " + kombinasyon);
        }
    }

    public static long faktoriyel(int sayi) {
        long sonuc = 1;
        for (int i = 2; i <= sayi; i++) {
            sonuc *= i;
        }
        return sonuc;
    }
}
