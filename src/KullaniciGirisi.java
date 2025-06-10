import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userName, password, newPassword;
        final String correctUserName = "patika";
        final String correctPassword = "PASSWORD";

        System.out.print("Kullanıcı Adınızı Giriniz: ");
        userName = input.nextLine();

        System.out.print("Şifrenizi Giriniz: ");
        password = input.nextLine();

        if (userName.equals(correctUserName) && password.equals(correctPassword)) {
            System.out.println("Giriş Başarılı!");
        } else if (userName.equals(correctUserName)) {
            System.out.println("Şifreniz Yanlış!");

            System.out.print("Şifrenizi sıfırlamak ister misiniz? (Evet/Hayır): ");
            String cevap = input.nextLine();

            if (cevap.equalsIgnoreCase("Evet")) {
                System.out.print("Yeni şifrenizi giriniz: ");
                newPassword = input.nextLine();

                if (newPassword.equals(password) || newPassword.equals(correctPassword)) {
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                } else {
                    System.out.println("Şifre oluşturuldu.");
                }
            } else {
                System.out.println("Şifre sıfırlama işlemi iptal edildi.");
            }
        } else {
            System.out.println("Giriş Başarısız!");
        }

        input.close();
    }
}
