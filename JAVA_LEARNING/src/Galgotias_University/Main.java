/*Exp.8 Write a program input by user to create  an abstract class named Shape that contain 
two integers and an empty method name print Area().Provide three classes named Rectangle,
Triangle and Circle such that each one of the classes extends the classes shape.
Each one of the classes contains only the method print Area() that prints the area of the given shape*/

package Galgotias_University;

import java.util.Scanner;

abstract class Shape {
    int length;
    int breadth;
    
    public abstract void printArea();
}

class Rectangle extends Shape {
    
    public void printArea() {
        int area =  length* breadth;
        System.out.println("Area of Rectangle: " + area);
    }
}

class Triangle extends Shape {
   
    public void printArea() {
        int area = (length * breadth) / 2;
        System.out.println("Area of Triangle: " + area);
    }
}

class Circle extends Shape {
    
    public void printArea() {
        double area = Math.PI * length * length;
        System.out.println("Area of Circle: " + area);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length:");
        int dim1 = scanner.nextInt();
	  System.out.println("Enter the breadth:");
        int dim2 = scanner.nextInt();

        Rectangle rectangle = new Rectangle();
        rectangle.length = dim1;
        rectangle.breadth = dim2;
        rectangle.printArea();

        Triangle triangle = new Triangle();
        triangle.length = dim1;
        triangle.breadth = dim2;
        triangle.printArea();

        Circle circle = new Circle();
        circle.length = dim1;
        circle.printArea();

        scanner.close();
    }
}
