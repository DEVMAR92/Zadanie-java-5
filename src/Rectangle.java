class Rectangle {
    double firstSide;
    double secondSide;

    Rectangle(double firstSide, double secondSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }
    double calculatePerimeter(){
        return firstSide + secondSide;
    }
}
