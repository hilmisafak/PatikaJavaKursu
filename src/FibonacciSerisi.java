import java.util.Scanner;

public class FibonacciSerisi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int elemanSayisi, ilk = 0, ikinci = 1, i, sonraki;

        System.out.print("Kaç elemanlı Fibonacci serisi istiyorsunuz: ");
        elemanSayisi = input.nextInt();

        System.out.print(elemanSayisi + " Elemanlı Fibonacci Serisi: ");

        for (i = 1; i <= elemanSayisi; i++) {
            System.out.print(ilk + " ");
            sonraki = ilk + ikinci;
            ilk = ikinci;
            ikinci = sonraki;
        }
    }
}
