import java.util.Scanner;

class SumOfDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Shrey Sharma 24csu193");

        System.out.print("Enter a 3-digit number: ");
        int num = scan.nextInt();

        int d1 = num / 100;          // first digit
        int d2 = (num / 10) % 10;    // second digit
        int d3 = num % 10;           // third digit

        int sum = d1 + d2 + d3;

        System.out.println("Sum of digits = " + sum);

        scan.close();
    }
}