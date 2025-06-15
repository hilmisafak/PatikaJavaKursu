public class BirveYuzArasindakiAsalSayilariBulanProgram {
    public static void main(String[] args) {
        boolean asalMi = true;
        int sayi, i;
        System.out.println("1 - 100 arasındaki asal sayılar:");

        for (sayi = 2; sayi <= 100; sayi++) {

            for (i = 2; i <= Math.sqrt(sayi); i++) {
                if (sayi % i == 0) {
                    asalMi = false;
                    break;
                }
            }

            if (asalMi) {
                System.out.print(sayi + " ");
            }
        }
    }
}
