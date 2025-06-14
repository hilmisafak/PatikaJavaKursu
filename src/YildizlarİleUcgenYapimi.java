import java.util.Scanner;

public class YildizlarİleUcgenYapimi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, yarisi;
        System.out.print("Elmasın yüksekliğini (tek sayı) giriniz: ");
        n = scanner.nextInt();
        if (n % 2 == 0) {
            System.out.println("Lütfen tek bir sayı giriniz.");
        } else {
            yarisi = n / 2;

            for (int i = 0; i <= yarisi; i++) {
                for (int j = 0; j < yarisi - i; j++) {
                    System.out.print(" ");
                }

                for (int k = 0; k < (2 * i + 1); k++) {
                    System.out.print("*");
                }
                System.out.println();
            }

            for (int i = yarisi - 1; i >= 0; i--) {
                for (int j = 0; j < yarisi - i; j++) {
                    System.out.print(" ");
                }

                for (int k = 0; k < (2 * i + 1); k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
