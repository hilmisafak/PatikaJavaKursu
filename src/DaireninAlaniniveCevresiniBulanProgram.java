import java.util.Scanner;

public class DaireninAlaniniveCevresiniBulanProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double yariCap, aci, alan;
        final double pi = 3.14;

        System.out.print("Yarıçapı giriniz: ");
        yariCap = input.nextDouble();

        System.out.print("Merkez açısını giriniz (derece cinsinden): ");
        aci = input.nextDouble();

        alan = pi * (yariCap * yariCap) * aci / 360;

        System.out.println("Dairenin alanı: " + alan);
    }
}
