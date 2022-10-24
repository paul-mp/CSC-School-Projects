public class Triangle extends GeometricObject {

    private double firstSide;
    private double secondSide;
    private double thirdSide;


    public Triangle() {

    }

    public Triangle(double firstSide, double secondSide, double thirdSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
    }


    public double getArea() {
        double sum = (firstSide + secondSide + thirdSide) / 2;
        return Math.sqrt(sum * (sum - firstSide) * (sum - secondSide) * (sum - thirdSide));
    }

    public double getPerimeter() {
        return firstSide + secondSide + thirdSide;
    }


    public double getFirstSide() {
        return firstSide;
    }

    public double getSecondSide() {
        return secondSide;
    }

    public double getThirdSide() {
        return thirdSide;
    }

    @Override
    public String toString() {
        return "Triangle: side1 = " + firstSide + " side2 = " + secondSide + " side3 = " + thirdSide;
    }




}
