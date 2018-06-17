public class Cube extends Shape3D {
    private double diagonal;

    public Cube(double diagonal) {
        this.diagonal = diagonal;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }

    @Override
    public String toString() {
        return  diagonal + "";
    }
}
