package Shapes;

public class Square extends Quadrilateral {

    public Square(int side) {
        super(side, side);
    }

    public double getPerimeter() {
        return (this.length * 2) + (this.width * 2);
    }

    public double getArea() {
        return this.length * this.width;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }




//    public int side;
//
//    public Square(int side){
//        super(side,side);
//        this.side = side;
//    }
//
//    public int getPerimeter(){
//        System.out.println("sqaure");
//        return this.side * 4;
//    }
//
//    public int getArea(){
//        System.out.println("square");
//        return this.side * this.side;
//    }

}
