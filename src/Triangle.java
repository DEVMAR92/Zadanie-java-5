class Triangle {
    double firstSide;
    double secondSide;
    double thirtSide;

    Triangle(double firstSide, double secondSide, double thirtSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirtSide = thirtSide;
    }
    double calculatePerimeter(){
        return firstSide + secondSide + thirtSide;
    }
}
