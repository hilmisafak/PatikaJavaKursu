import java.util.Scanner;

public class TersUcgenYapimi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int basamakSayisi;

        System.out.print("Basamak sayısını giriniz: ");
        basamakSayisi = input.nextInt();

        for (int i = basamakSayisi; i >= 1; i--) {
            for (int j = 0; j < (basamakSayisi - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
        }
    }
}
