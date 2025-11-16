import java.io.File;

public class ChangeFilePermissions {
    public static void main(String[] args) {
        System.out.println("Shrey sharma 24csu193");

        File file = new File("permissions.txt");

        try {
            if (!file.exists()) {
                file.createNewFile();
                System.out.println("File 'permissions.txt' created.");
            }

            // Change permissions
            file.setReadable(true);
            file.setWritable(true);
            file.setExecutable(false);

            System.out.println("Permissions updated successfully!");
            System.out.println("Readable: " + file.canRead());
            System.out.println("Writable: " + file.canWrite());
            System.out.println("Executable: " + file.canExecute());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
