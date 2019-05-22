public class Cylinder extends Circle {
    private double height = 1;

    public Cylinder() {
    }

    public Cylinder(int radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "A cylinder with height = "
                + getHeight()
                +", which is a subclass of "
                + super.toString();
    }

}
