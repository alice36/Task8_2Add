public class ShapeCalculator extends LineCalc implements Calc2D, Calc3D{
    @Override
    public  double shapeVolume(Shape3D shape){
        double volume=0;
        if (shape instanceof Ball) volume =  4/3*PI*Math.pow(((Ball) shape).getRadius(),3);
        if (shape instanceof Cube) volume = Math.pow(((Cube) shape).getDiagonal(),3);

        return volume;
    }


    @Override
    public double shapeArea(GeometricShape shape){
        double area=0;
        if (shape instanceof Circle) area = PI*Math.pow(((Circle) shape).getRadius(),2);
        if (shape instanceof Rectangle) area = ((Rectangle) shape).getShortSide()*((Rectangle) shape).getLongSide();

        return area;
    }

}
