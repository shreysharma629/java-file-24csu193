interface A {
    void show();
}

interface B extends A {
    void display();
}

class Demo implements B {
    public void show() {
        System.out.println("Show from A");
    }

    public void display() {
        System.out.println("Display from B");
    }
}

public class InterfaceExtend {
    public static void main(String[] args) {
        System.out.println("Shrey Sharma 24csu193");
        Demo d = new Demo();
        d.show();
        d.display();
    }
}
