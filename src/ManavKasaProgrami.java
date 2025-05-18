import java.util.Scanner;

public class ManavKasaProgrami {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double armut, elma, domates, muz, patlican, total_price, armut_price = 2.14, elma_price = 3.67, domates_price = 1.11, muz_price = 0.95, patlican_price = 5;

        System.out.print("Armut kaç kilo ? : ");
        armut = input.nextDouble();

        System.out.print("Elma kaç kilo ? : ");
        elma = input.nextDouble();

        System.out.print("Domates kaç kilo ? : ");
        domates = input.nextDouble();

        System.out.print("Muz kaç kilo ? : ");
        muz = input.nextDouble();

        System.out.print("Patlıcan kaç kilo ? : ");
        patlican = input.nextDouble();

        total_price = (armut * armut_price) + (elma * elma_price) + (domates * domates_price) + (muz * muz_price) + (patlican * patlican_price);

        System.out.println("Toplam Tutar : " + total_price);
    }
}
