//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){

        Circle c = new Circle();
        c.radius=5;
        Rectangle r = new Rectangle();
        r.length=12;
        r.breadth=14;
        AreaCalculator Area = new AreaCalculator();
        System.out.println(Area.calculateArea(c));
        System.out.println(Area.calculateArea(r));

    }
    }
