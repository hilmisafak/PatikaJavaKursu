import java.util.Scanner;

public class SayilariBuyuktenKucugeSiralayanProgram {
    public static void main(String[] args) {
        double a, b, c, min, mid, max;
        Scanner input = new Scanner(System.in);

        System.out.print("1. sayıyı giriniz: ");
        a = input.nextDouble();

        System.out.print("2. sayıyı giriniz: ");
        b = input.nextDouble();

        System.out.print("3. sayıyı giriniz: ");
        c = input.nextDouble();

        if (a <= b && a <= c) {
            min = a;
            if (b <= c) {
                mid = b;
                max = c;
            } else {
                mid = c;
                max = b;
            }
        } else if (b <= a && b <= c) {
            min = b;
            if (a <= c) {
                mid = a;
                max = c;
            } else {
                mid = c;
                max = a;
            }
        } else {
            min = c;
            if (a <= b) {
                mid = a;
                max = b;
            } else {
                mid = b;
                max = a;
            }
        }

        System.out.println("Sıralama: " + min + " < " + mid + " < " + max);
    }
}