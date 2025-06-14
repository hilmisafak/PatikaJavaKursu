import java.util.Scanner;

public class GirilenSayidanKucuk2ninKuvvetleriniBulanProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;

        System.out.print("Bir sayı giriniz: ");
        number = scanner.nextInt();

        System.out.println("4'ün kuvvetleri:");
        for (int i = 0; i <= number; i += 4) {
            if (i == 0) {
                System.out.println("1");
                continue;
            }
            System.out.println(i);
        }

        System.out.println("\n5'in kuvvetleri:");
        for (int j = 0; j <= number; j += 5) {
            if (j == 0) {
                System.out.println("1");
                continue;
            }
            System.out.println(j);
        }
    }
}
