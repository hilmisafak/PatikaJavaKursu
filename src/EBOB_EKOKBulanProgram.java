import java.util.Scanner;

public class EBOB_EKOKBulanProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2, ebob = 1, i = 1;

        System.out.print("1. sayıyı giriniz: ");
        num1 = scanner.nextInt();

        System.out.print("2. sayıyı giriniz: ");
        num2 = scanner.nextInt();

        while (i <= num1 && i <= num2) {
            if (num1 % i == 0 && num2 % i == 0) {
                ebob = i;
            }
            i++;
        }

        int ekok = (num1 * num2) / ebob;

        System.out.println("EBOB: " + ebob);
        System.out.println("EKOK: " + ekok);
    }
}
