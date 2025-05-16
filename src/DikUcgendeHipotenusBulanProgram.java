import java.util.Scanner;

public class DikUcgendeHipotenusBulanProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a, b, c, cevre, yaricevre, alan;

        System.out.print("Dik kenar uzunluğunu giriniz: ");
        a = input.nextDouble();

        System.out.print("Kücük kenar uzunluğunu giriniz: ");
        b = input.nextDouble();

        System.out.print("Hipotenüs kenar uzunluğunu giriniz: ");
        c = input.nextDouble();


        if(a+b>c && a+c>b && b+c>a){
            cevre = a + b + c;
            yaricevre = (a + b + c) / 2;
            System.out.println("Üçgenin çevresi: " + cevre);

            alan = Math.sqrt(yaricevre * (yaricevre - a) * (yaricevre - b) * (yaricevre - c));
            System.out.println("Üçgenin alanı: " + alan);
        } else {
            System.out.println("Girilen değerleri tekrar gözden geçiriniz...");
        }
    }
}
