import java.util.Scanner;

public class HavaSicakliginaGoreEtkinlikOnerenProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double heat;

        System.out.print("Sıcaklık Giriniz: ");
        heat = input.nextDouble();

        if (heat <= 5) {
            System.out.println("Kayak yapabilirsiniz.");
        }
        else if (heat <= 15) {
            System.out.println("Sinemaya gidebilirsiniz.");
        }
        else if (heat <= 25) {
            System.out.println("Pikniğe gidebilirsiniz.");
        }
        else {
            System.out.println("Yüzmeye gidebilirsiniz.");
        }
    }
}