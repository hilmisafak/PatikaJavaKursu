import java.util.Scanner;

public class VucutKitleIndeksiHesaplayanProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double kilo, boy, VKI;

        System.out.print("Kilonuzu giriniz: ");
        kilo = input.nextDouble();

        System.out.print("Boyunuzu (metre cinsinden) giriniz: ");
        boy = input.nextDouble();

        VKI = kilo / (boy * boy);

        System.out.println("Vücut Kitle İndeksiniz: " + VKI);
    }
}
