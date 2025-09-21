import java.util.Scanner;

class Area {
    private int length;
    private int breadth;

    public Area(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength() { return length; }
    public void setLength(int length) { this.length = length; }

    public int getBreadth() { return breadth; }
    public void setBreadth(int breadth) { this.breadth = breadth; }

    public int returnArea() {
        return length * breadth;
    }

    public void display() {
        System.out.println("Length: " + length);
        System.out.println("Breadth: " + breadth);
        System.out.println("Area: " + returnArea());
    }
}

class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Shrey Sharma 24csu193");

        System.out.print("Enter length of rectangle: ");
        int length = sc.nextInt();

        System.out.print("Enter breadth of rectangle: ");
        int breadth = sc.nextInt();

        Area rect = new Area(length, breadth);
        rect.display();
    }
}
