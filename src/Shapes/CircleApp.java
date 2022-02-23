package Shapes;
import java.util.Scanner;

import static util.Input.*;

public class CircleApp {

    public static void main(String[] args) {

        Circle circ1 = new Circle(getInt());

        System.out.println(circ1.getArea());

        System.out.println(circ1.getCircumference());


    }
}
