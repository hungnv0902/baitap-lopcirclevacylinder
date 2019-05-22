public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle.toString());

        circle = new Circle(4,"blue");
        System.out.println(circle.toString());

        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);

        cylinder = new Cylinder(5,"blue",7);
        System.out.println(cylinder);
    }
}
