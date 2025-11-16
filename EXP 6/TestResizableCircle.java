public class TestResizableCircle {
    public static void main(String[] args) {
        System.out.println("shrey sharma 24csu193");

        ResizableCircle rc = new ResizableCircle(10.0);

        System.out.println("Original radius: " + rc.radius);
        System.out.println("Original area: " + rc.getArea());
        System.out.println("Original perimeter: " + rc.getPerimeter());

        rc.resize(50);

        System.out.println("\nAfter resizing by 50%:");
        System.out.println("New radius: " + rc.radius);
        System.out.println("New area: " + rc.getArea());
        System.out.println("New perimeter: " + rc.getPerimeter());
    }
}
