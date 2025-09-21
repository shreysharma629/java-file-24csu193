import java.util.Scanner;

class Temperature {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Shrey Sharma 24csu193");
        System.out.println("convert from: 1) Celsius to Fahrenheit 2) Fahrenheit to Celsius (1 or 2)? ");
        int choice = scan.nextInt();
        if (choice == 1) {
            System.out.println("enter temperature in Celsius:");
            float c = scan.nextFloat();
            float f = (c * 9 / 5) + 32;
            System.out.println("temp in Fahrenheit is: " + f);
        } else if (choice == 2) {
            System.out.println("enter temperature in Fahrenheit:");
            float f = scan.nextFloat();
            float c = (f - 32) * 5 / 9;
            System.out.println("temp in Celsius is: " + c);
        } else {
            System.out.println("wrong choice!!");
        }
    }
}
