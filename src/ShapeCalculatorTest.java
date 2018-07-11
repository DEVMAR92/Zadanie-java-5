class ShapeCalculatorTest {
    public static void main(String[] args) {

        Square square = new Square(4);
        Rectangle rectangle = new Rectangle(4, 5);
        Circle circle = new Circle(2);
        Triangle triangle = new Triangle(4, 4, 5 );

        ShapeCalculator shapeCalculator = new ShapeCalculator();

        double circleAreaResult = shapeCalculator.circleArea(circle);
        double squareAreaResult = shapeCalculator.squareArea(square);
        double trianglePerimeterResult = shapeCalculator.trianglePerimeter(triangle);
        double rectPerimeterResult = shapeCalculator.rectPerimeter(rectangle);

        System.out.println(circleAreaResult);
        System.out.println(squareAreaResult);
        System.out.println(trianglePerimeterResult);
        System.out.println(rectPerimeterResult);

    }
}
