public class Circle {
    private int radius = 1;
    private String color = "red";

    public Circle() {

    }

    public Circle(int radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return radius*radius*Math.PI;
    }

    public double getParemeter() {
        return 2*radius*Math.PI;
    }

    public String toString() {
        return "A circle is radius " +
                radius +
                " color " + color;
    }
}
