import java.util.Scanner;

public class KDVTutariHesaplayanProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double tutar, kdv_orani_18 = 0.18, kdv_orani_8 = 0.8, kdv, kdvli_tutar;

        System.out.print("Ürünün tutarını giriniz: ");
        tutar = input.nextDouble();

        if (tutar > 1000) {
            kdv = tutar * kdv_orani_8;
            kdvli_tutar = tutar + kdv;
            System.out.println("KDV'siz Tutar: " + tutar);
            System.out.println("KDV Oranı: " + kdv_orani_8);
            System.out.println("KDV Tutarı: " + kdv);
            System.out.println("KDV'li Tutar: " + kdvli_tutar);
        } else {
            kdv = tutar * kdv_orani_18;
            kdvli_tutar = tutar + kdv;
            System.out.println("KDV'siz Tutar: " + tutar);
            System.out.println("KDV Oranı: " + kdv_orani_18);
            System.out.println("KDV Tutarı: " + kdv);
            System.out.println("KDV'li Tutar: " + kdvli_tutar);
        }
    }
}
