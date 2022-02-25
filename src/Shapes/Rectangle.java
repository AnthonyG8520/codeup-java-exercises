package Shapes;

public class Rectangle {
    protected int width;
    protected int length;

    public Rectangle(int l, int w){
        this.width = w;
        this.length = l;
    }

    public int getPerimeter(){
        return (this.length * 2) + (this.width * 2);
    }

    public int getArea(){
        return this.length * this.width;
    }

}
