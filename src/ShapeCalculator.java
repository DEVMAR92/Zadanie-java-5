class ShapeCalculator {

    double squareArea(Square square) {
        return square.side * square.side;
    }

    double circleArea(Circle circle) {
        return Math.PI * circle.radius * circle.radius;
    }

    double trianglePerimeter(Triangle triangle) {
        return triangle.firstSide + triangle.secondSide + triangle.thirtSide;
    }

    double rectPerimeter(Rectangle rectangle) {
        return (rectangle.firstSide * 2) + (rectangle.secondSide * 2);
    }

}
