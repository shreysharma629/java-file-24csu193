class Triangle {
    private int a, b, c;

    public Triangle() {
        this.a = 3;
        this.b = 4;
        this.c = 5;
    }

    public int getA() { return a; }
    public int getB() { return b; }
    public int getC() { return c; }

    public int getPerimeter() {
        return a + b + c;
    }

    public double getArea() {
        double s = getPerimeter() / 2.0;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public void display() {
        System.out.println("Sides of Triangle: " + a + ", " + b + ", " + c);
        System.out.println("Perimeter: " + getPerimeter());
        System.out.printf("Area: %.2f%n", getArea());
    }
}

class MainApp {
    public static void main(String[] args) {
        System.out.println("Shubham Sharma 24csu199");

        Triangle t1 = new Triangle();
        t1.display();
    }
}
