// This is example of Open closed principle
public interface Shape {
    public double shapeArea();
}
class Circle implements Shape {
    public double radius;
    public double shapeArea(){
        return 3.14*radius*radius;
    }
}
class Rectangle implements Shape {
    public double length;
    public double breadth;
    @Override
    public double shapeArea(){
        return length*breadth;
    }
}

class AreaCalculator {
    public double calculateArea(Shape shape){
        return shape.shapeArea();
    }

}
