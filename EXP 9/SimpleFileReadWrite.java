import java.io.*;

public class SimpleFileReadWrite {
    public static void main(String[] args) {
        System.out.println("Shrey sharma 24csu193");
        String filename = "data.txt";

        try {
            // Write some sample data
            FileWriter writer = new FileWriter(filename);
            writer.write("Hello! This file was created and written automatically.\n");
            writer.write("This is a test of file writing and reading in Java.\n");
            writer.close();
            System.out.println("Data written successfully to " + filename);

            // Read the data back
            BufferedReader br = new BufferedReader(new FileReader(filename));
            String line;
            System.out.println("\nFile contents:");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
