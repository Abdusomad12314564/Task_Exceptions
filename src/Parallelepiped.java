public class Parallelepiped {
    private double length; //узундугу
    private double width; //кенендиги
    private double height;//бийиктиги

    public Parallelepiped(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void area() {
        System.out.println("Аянты: " + 2 * ((height * length) + (length * width) + (height * width)));
    }

    public void volume() {
        System.out.println("Көлөмү: " + (length * width * height));
    }
}
