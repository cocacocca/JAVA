package Review;
class Shape {
    protected double perimeter;
    protected double area;

    public void printPerimeterAndArea() {
        System.out.println("周长：" + perimeter);
        System.out.println("面积：" + area);
    }
}

public class Prog04 extends Shape {
    private double side1;
    private double side2;
    private double side3;

    public Prog04(double side1, double side2, double side3) {
        if (isValidTriangle(side1, side2, side3)) {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;

            calculatePerimeter();
            calculateArea();
        } else {
            System.out.println("输入的三边无法构成三角形");
        }
    }

    private boolean isValidTriangle(double a, double b, double c) {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }

    private void calculatePerimeter() {
        perimeter = side1 + side2 + side3;
    }

    private void calculateArea() {
        double s = (side1 + side2 + side3) / 2;
        area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public static void main(String[] args) {
        Prog04 triangle = new Prog04(3, 4, 5);
        triangle.printPerimeterAndArea();
    }
}
