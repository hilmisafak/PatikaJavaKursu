import java.util.Scanner;

public class UcakBiletiFiyatiHesaplayanProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double mesafe, mesafeBasinaUcret = 0.10, toplamTutar, indirimliTutar;
        int yas, yolculukTipi;

        System.out.print("Mesafeyi km türünden giriniz: ");
        mesafe = scanner.nextDouble();

        System.out.print("Yaşınızı giriniz: ");
        yas = scanner.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön, 2 => Gidiş Dönüş): ");
        yolculukTipi = scanner.nextInt();

        if (mesafe > 0 && yas > 0 && (yolculukTipi == 1 || yolculukTipi == 2)) {
            toplamTutar = mesafe * mesafeBasinaUcret;
            if (yas < 12) {
                indirimliTutar = (toplamTutar * 50) / 100;
                toplamTutar -= indirimliTutar;
                if (yolculukTipi == 2) {
                    indirimliTutar = (toplamTutar * 20) / 100;
                    toplamTutar -= indirimliTutar;
                    toplamTutar *= 2;
                }
            } else if (yas <= 24) {
                indirimliTutar = (toplamTutar * 10) / 100;
                toplamTutar -= indirimliTutar;
                if (yolculukTipi == 2) {
                    indirimliTutar = (toplamTutar * 20) / 100;
                    toplamTutar -= indirimliTutar;
                    toplamTutar *= 2;
                }
            } else if (yas >= 65) {
                indirimliTutar = (toplamTutar * 30) / 100;
                toplamTutar -= indirimliTutar;
                if (yolculukTipi == 2) {
                    indirimliTutar = (toplamTutar * 20) / 100;
                    toplamTutar -= indirimliTutar;
                    toplamTutar *= 2;
                }
            }
        } else {
            System.out.println("Hatalı Veri Girdiniz !");
            return;
        }

        System.out.println("Toplam Tutar = " + toplamTutar + " TL");
    }
}