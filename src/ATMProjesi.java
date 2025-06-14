import java.util.Scanner;

public class ATMProjesi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userName, password;
        int right = 3, balance = 1500, select;

        while (right > 0) {
            System.out.print("Kullanıcı Adınız : ");
            userName = input.nextLine();

            System.out.print("Parolanız : ");
            password = input.nextLine();

            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz!");
                do {
                    System.out.println("\n1 - Para Yatırma");
                    System.out.println("2 - Para Çekme");
                    System.out.println("3 - Bakiye Sorgulama");
                    System.out.println("4 - Çıkış Yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                    select = input.nextInt();
                    switch (select) {
                        case 1:
                            System.out.print("Yatırmak istediğiniz miktar: ");
                            int yatirilan = input.nextInt();
                            balance += yatirilan;
                            System.out.println("Yeni bakiyeniz: " + balance + " TL");
                            break;

                        case 2:
                            System.out.print("Çekmek istediğiniz miktar: ");
                            int cekilen = input.nextInt();
                            if (cekilen > balance) {
                                System.out.println("Bakiye yetersiz.");
                            } else {
                                balance -= cekilen;
                                System.out.println("Yeni bakiyeniz: " + balance + " TL");
                            }
                            break;

                        case 3:
                            System.out.println("Bakiyeniz: " + balance + " TL");
                            break;

                        case 4:
                            System.out.println("Çıkış yapılıyor. Tekrar görüşmek üzere!");
                            break;

                        default:
                            System.out.println("Geçersiz bir işlem seçtiniz.");
                            break;
                    }
                } while (select != 4);
                break;
            } else {
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur. Lütfen banka ile iletişime geçiniz.");
                } else {
                    System.out.println("Kalan deneme hakkınız: " + right);
                }
            }
        }
    }
}
