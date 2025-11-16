
class BaseException extends Exception {
    BaseException(String message) {
        super(message);
    }
}

class LevelTwoException extends BaseException {
    LevelTwoException(String message) {
        super(message);
    }
}

class LevelThreeException extends LevelTwoException {
    LevelThreeException(String message) {
        super(message);
    }
}

class A {
    void display() throws BaseException {
        throw new BaseException("Exception from class A");
    }
}

class C extends A {
    @Override
    void display() throws LevelThreeException {
        throw new LevelThreeException("Exception from class C");
    }
}

public class ExceptionHierarchyExample {
    public static void main(String[] args) {
        System.out.println("shrey  sharma 24csu193");
        A obj = new C();

        try {
            obj.display();
        } 
        catch (LevelThreeException e) {
            System.out.println("Caught: " + e.getMessage());
        } 
        catch (LevelTwoException e) {
            System.out.println("Caught: " + e.getMessage());
        } 
        catch (BaseException e) {
            System.out.println("Caught: " + e.getMessage());
        } 
        finally {
            System.out.println("Program ended – finally block executed.");
        }
    }
}
