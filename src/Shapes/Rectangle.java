package Shapes;

public class Rectangle extends Quadrilateral{

    public Rectangle(int l, int w) {
        super(l, w);
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







//    protected int width;
//    protected int length;
//
//    public Rectangle(int l, int w){
//        this.width = w;
//        this.length = l;
//    }
//
//    public int getPerimeter(){
//        return (this.length * 2) + (this.width * 2);
//    }
//
//    public int getArea(){
//        return this.length * this.width;
//    }

}
