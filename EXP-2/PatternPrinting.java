import java.util.Scanner;

class PatternPrinting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Shrey Sharma 24csu193");

        char choice;

        do {
            System.out.print("Enter number of lines: ");
            int n = sc.nextInt();

            System.out.println("a. RHOMBUS");
            System.out.println("b. PYRAMID");
            System.out.println("c. LEFT TRIANGLE");
            System.out.println("d. RIGHT TRIANGLE");
            System.out.print("ENTER YOUR CHOICE: ");

            char ch = sc.next().charAt(0);

            switch (ch) {
                case 'b':   // Pyramid
                    System.out.println("\nPyramid:");
                    for (int i = 1; i <= n; i++) {
                        for (int s = 1; s <= n - i; s++) System.out.print(" ");
                        for (int k = 1; k <= (2 * i - 1); k++) System.out.print("*");
                        System.out.println();
                    }
                    break;

                case 'c':   // Left Triangle
                    System.out.println("\nLeft Triangle:");
                    for (int i = 1; i <= n; i++) {
                        for (int j = 1; j <= i; j++) System.out.print("*");
                        System.out.println();
                    }
                    break;

                case 'd':   // Right Triangle
                    System.out.println("\nRight Triangle:");
                    for (int i = 1; i <= n; i++) {
                        for (int s = 1; s <= n - i; s++) System.out.print(" ");
                        for (int j = 1; j <= i; j++) System.out.print("*");
                        System.out.println();
                    }
                    break;

                case 'a':   // Rhombus
                    System.out.println("\nRhombus:");
                    for (int i = 1; i <= n; i++) {
                        for (int s = 1; s <= n - i; s++) System.out.print(" ");
                        for (int j = 1; j <= n; j++) System.out.print("*");
                        System.out.println();
                    }
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

            System.out.print("\nDo you want to try again? (Press N to exit): ");
            choice = sc.next().charAt(0);

        } while (choice != 'N' && choice != 'n');

        System.out.println("Program exited.");
        sc.close();
    }
}