import java.util.Scanner;

class ReverseNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Shrey Sharma 24csu193");

        System.out.print("Enter a 3-digit number: ");
        int num = scan.nextInt();

        int d1 = num / 100;        // first digit
        int d2 = (num / 10) % 10;  // second digit
        int d3 = num % 10;         // third digit

        int rev = (d3 * 100) + (d2 * 10) + d1;

        System.out.println("Reversed number = " + rev);

        scan.close();
    }
}