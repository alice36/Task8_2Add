public class CalculatorTest extends ShapeCalculator {
    public static void main(String[] args) {
        ShapeCalculator shapeCalculator = new ShapeCalculator();
        Shape[] shapes = new Shape[5];

        shapes[0] = new Line2D(2,2,5,5);
        shapes[1] = new Circle(8);
        shapes[2] = new Rectangle(11,12);
        shapes[3] = new Ball(3);
        shapes[4] = new Cube(21);

        for (int i = 0; i < shapes.length; i++) {

            if (shapes[i] instanceof Line2D) System.out.println("Odcinek wyznaczony przez współrzędne " + shapes[i].toString() + " ma długość " + lineLength(((Line2D) shapes[i])));
            if (shapes[i] instanceof Circle) System.out.println("Okrąg o promieniu " + shapes[i].toString() + " ma powierzchnię " + shapeCalculator.shapeArea(((Circle) shapes[i])));
            if (shapes[i] instanceof Ball) System.out.println("Kula o promieniu " + shapes[i].toString() + " ma pojemność " + shapeCalculator.shapeVolume(((Ball) shapes[i])));
            if (shapes[i] instanceof Rectangle) System.out.println("Prostokąt o długościach boków " + shapes[i].toString() + " ma pole, które wynosi " + shapeCalculator.shapeArea(((Rectangle) shapes[i])));
            if (shapes[i] instanceof Cube) System.out.println("Sześcian o długości krawędzi wynoszącej " + shapes[i].toString() + " ma pojemność " + shapeCalculator.shapeVolume(((Cube) shapes[i])));
        }
    }
}
