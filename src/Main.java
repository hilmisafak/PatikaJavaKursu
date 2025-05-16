import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name, surname, phone_number;
        int age;

        System.out.print("Enter your name: ");
        name = input.nextLine();

        System.out.print("Enter your surname: ");
        surname = input.nextLine();

        System.out.print("Enter your phone number: ");
        phone_number = input.nextLine();

        System.out.print("Enter your age: ");
        age = input.nextInt();

        System.out.println("WELCOME: "+name+" "+surname);
        System.out.println("Your age: "+age);
        System.out.println("Your phone number: "+phone_number);
    }
}