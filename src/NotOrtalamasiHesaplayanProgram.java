import java.util.Scanner;

public class NotOrtalamasiHesaplayanProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int maths, physical, chemical, turkish, history, music;
        float average;

        System.out.print("Matematik ders notunuzu giriniz: ");
        maths = input.nextInt();

        System.out.print("Fizik ders notunuzu giriniz: ");
        physical = input.nextInt();

        System.out.print("Kimya ders notunuzu giriniz: ");
        chemical = input.nextInt();

        System.out.print("Türkçe ders notunuzu giriniz: ");
        turkish = input.nextInt();

        System.out.print("Tarih ders notunuzu giriniz: ");
        history = input.nextInt();

        System.out.print("Müzik ders notunuzu giriniz: ");
        music = input.nextInt();

        average = (maths + physical + chemical + turkish + history + music) / 6;

        var passed_remained = average < 60 ? "Sınıfta Kaldı." : "Sınıfı Geçti.";

       System.out.println(passed_remained);
    }
}