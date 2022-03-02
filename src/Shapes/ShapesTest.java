package Shapes;

public class ShapesTest {
    public static void main(String[] args) {

//        Rectangle box1 = new Rectangle(4,5);
//        System.out.println(box1.getPerimeter());
//        System.out.println(box1.getArea());
//
//        Square box2 = new Square(5);
//        System.out.println(box2.getPerimeter());
//        System.out.println(box2.getArea());

        Measurable myShape;

        myShape = new Square(5);

        System.out.println(myShape.getArea());

        myShape = new Rectangle(4,3);

        System.out.println(myShape.getPerimeter());

        System.out.println(myShape.getPerimeter());

    }
}
