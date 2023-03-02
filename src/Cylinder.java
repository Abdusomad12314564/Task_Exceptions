public class Cylinder {
    private final double PI = 3.14;
    private double height;
    private double radius;

    public Cylinder(double height, double radius) {
        this.height = height;
        this.radius = radius;
    }

    public double getPI() {
        return PI;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void area() {
        System.out.println("Аянты: " + 2 * PI * radius * (height + radius));
    }

    public void volume() {
        System.out.println("Көлөмү: " + (PI * radius * radius * height));
    }
}
