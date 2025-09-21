import java.util.Scanner;

class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() { return x; }
    public void setX(double x) { this.x = x; }

    public double getY() { return y; }
    public void setY(double y) { this.y = y; }

    public static double distance(Point p1, Point p2) {
        return Math.sqrt(Math.pow(p2.x - p1.x, 2) + Math.pow(p2.y - p1.y, 2));
    }

    public void display() {
        System.out.printf("(%.2f, %.2f)%n", x, y);
    }
}

class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Shrey Sharma 24csu193");

        System.out.print("Enter x-coordinate of first point: ");
        double x1 = sc.nextDouble();
        System.out.print("Enter y-coordinate of first point: ");
        double y1 = sc.nextDouble();
        Point p1 = new Point(x1, y1);

        System.out.print("Enter x-coordinate of second point: ");
        double x2 = sc.nextDouble();
        System.out.print("Enter y-coordinate of second point: ");
        double y2 = sc.nextDouble();
        Point p2 = new Point(x2, y2);

        System.out.print("First Point: ");
        p1.display();
        System.out.print("Second Point: ");
        p2.display();

        double dist = Point.distance(p1, p2);
        System.out.printf("Distance between points: %.2f%n", dist);
    }
}
