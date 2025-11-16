import java.io.File;
import java.util.Scanner;

public class FileCheck {
    public static void main(String[] args) {
        System.out.println("Shrey Sharma 24csu193");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the path of file or directory: ");
        String path = sc.nextLine();

        File file = new File(path);

        if (file.exists()) {
            if (file.isFile()) {
                System.out.println("It is a file.");
            } else if (file.isDirectory()) {
                System.out.println("It is a directory.");
            }
        } else {
            System.out.println("File or directory does not exist.");
        }

        sc.close();
    }
}
 