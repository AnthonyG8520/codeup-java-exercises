package Shapes;

public class Square extends Rectangle {
    public int side;

    public Square(int side){
        super(side,side);
        this.side = side;
    }

    public int getPerimeter(){
        System.out.println("sqaure");
        return this.side * 4;
    }

    public int getArea(){
        System.out.println("square");
        return this.side * this.side;
    }

}
