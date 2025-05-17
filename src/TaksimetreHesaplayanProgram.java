import java.util.Scanner;

public class TaksimetreHesaplayanProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double km, total_price, start_price = 10, km_price = 2.20;

        System.out.print("Mesafeyi giriniz: ");
        km = input.nextDouble();

        total_price = (km * km_price) + start_price;

        if (total_price < 20) {
            total_price = 20;
            System.out.println("Taksimetre tutarı: " + total_price);
        } else {
            System.out.println("Taksimetre tutarı: " + total_price);
        }
    }
}
