import java.util.Scanner;

public class UsluSayiHesaplayanProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, sonuc = 1;
        System.out.print("Taban değerini giriniz: ");
        a = scanner.nextInt();

        System.out.print("Üs değerini giriniz: ");
        b = scanner.nextInt();

        for (int i = 1; i <= b; i++) {
            sonuc *= a;
        }

        System.out.println(a + "^" + b + " = " + sonuc);
    }
}
