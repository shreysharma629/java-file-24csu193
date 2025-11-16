import java.io.*;

public class StudentFileBuffered {
    public static void main(String[] args) {
        System.out.println("Shrey sharma 24csu193");

        String filename = "students.txt";

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(filename));

            // Writing some sample data
            bw.write("S.No\tName\tCGPA\tGrade\n");
            bw.write("1\tPoorab\t8.9\tA\n");
            bw.write("2\tRiya\t9.1\tA+\n");
            bw.write("3\tKaran\t7.8\tB+\n");
            bw.close();

            System.out.println("Student data written successfully to " + filename);

            // Reading and displaying file contents
            BufferedReader br = new BufferedReader(new FileReader(filename));
            String line;
            System.out.println("\nContents of " + filename + ":");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
