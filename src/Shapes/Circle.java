package Shapes;

public class Circle {
    private double radius;

    public Circle(double inputradius){
        this.radius = inputradius;
    }

    public double getArea(){
        return Math.PI * (this.radius * 2);
    }

    public double getCircumference(){
        return 2 * Math.PI * this.radius;
    }

}
