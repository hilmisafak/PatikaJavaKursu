import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        int number1, number2, select;
        Scanner input = new Scanner(System.in);
        System.out.print("1. sayıyı giriniz: ");
        number1 = input.nextInt();

        System.out.print("2. sayıyı giriniz: ");
        number2 = input.nextInt();

        System.out.print("""
                1. sayıyla girilen 2. sayıyla hangi işlemi yapmak istediğiniz işlemi seçiniz:\s
                1-Toplama
                2-Çıkarma
                3-Çarpma
                4-Bölme
                """);
        System.out.print("Seçiminiz : ");
        select = input.nextInt();


        switch (select) {
            case 1:
                System.out.println("Toplama işlemi sonucu: " + (number1 + number2));
                break;
            case 2:
                System.out.println("Çıkarma işlemi sonucu: " + (number1 - number2));
                break;
            case 3:
                System.out.println("Çarpma işlemi sonucu: " + (number1 * number2));
                break;
            case 4:
                System.out.println("Bölme işlemi sonucu: " + (number1 / number2));
                break;
            default:
                System.out.println("Lütfen geçerli bir işlem seçiniz...");
        }
    }
}
