public class Rectangle extends GeometricShape {
    private double shortSide;
    private double longSide;

    public Rectangle(double shortSide, double longSide) {
        this.shortSide = shortSide;
        this.longSide = longSide;
    }

    public double getShortSide() {
        return shortSide;
    }

    public void setShortSide(double shortSide) {
        this.shortSide = shortSide;
    }

    public double getLongSide() {
        return longSide;
    }

    public void setLongSide(double longSide) {
        this.longSide = longSide;
    }
}
