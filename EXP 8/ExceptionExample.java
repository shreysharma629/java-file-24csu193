public class ExceptionExample {
    public static void main(String[] args) {
        System.out.println("24csu116");

        try {
            throw new Exception("This is my custom exception message!");
        }

        catch (Exception e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }

        finally {
            System.out.println("Inside finally block – program ended gracefully.");
        }
    }
}