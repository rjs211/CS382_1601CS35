import java.util.Scanner;
import java.lang.Math;



abstract class Shape{
    String color;
    boolean filled;
    
    Shape(){
        this.color = new String("NULL");
        this.filled = false;
    }
    Shape(String color, boolean filled){
        
        this.filled = filled;
        this.color  = color;
    }
    String getColor(){
        return color;
    }
    boolean isFilled(){
        return filled;
    }
    void setFilled(boolean filled){
        this.filled  = filled;
    }
    
    void setColor(String color){
        this.color = color;
    }
    abstract double getArea();
    abstract double getPerimeter();
    public String toString(){
        return "";
    }

    
}


class Circle extends Shape{
    double radius;
    Circle(){
        super();
        this.radius = 0.0;
        
    }
    
    Circle(double radius){
        super();
        this.radius = radius;
        
    }
    
    Circle(double radius, String color , boolean filled){
        super(color,filled);
        this.radius = radius;
    }
    
    void setRadius(double radius){
        this.radius = radius;
    }
    
    double getRadius(){
        return radius;
    }
    
    double getArea(){
        return 3.14*radius*radius;
    }
    
    double getPerimeter(){
        return 3.14*2.0*radius;
    }
    
    public String toString(){
        return "";
    }
    
    
    
}


class Rectangle extends Shape {
    double width;
    double length;
    
    Rectangle(){
        super();
        this.width = 0.0;
        this.length = 0.0;
        
    }
    
    Rectangle(double width,double length){
        super();
        this.width = width;
        this.length = length;
        
    }
    
    Rectangle(double width,double length,String color,boolean filled){
        super(color,filled);
        this.width = width;
        this.length = length;
        
    }
    double getWidth(){
        return this.width;
    }
    
    void setWidth(double width){
        this.width = width;
    }
    
    double getLength(){
        return this.length;
    }
    
    void setLength(double length){
        this.length = length;
    }
    
    double getArea(){
        return width*length;
    }
    double getPerimeter(){
        return 2*(width+length);
    }
    
    public String toString(){
        return "";
    }
}

class Square extends Rectangle{
    Square(){
        super();
    }
    Square(double side){
        super(side,side);
    }
    
    Square(double side,String color, boolean filled){
        super(side,side,color,filled);
    }
    
    double getSide(){
        return super.getLength();
    }
    
    void setSide(double side){
        super.setWidth(side);
    super.setLength(side);
        
    }
    
    void setWidth(double side){
        super.setWidth(side);
        super.setLength(side);
    }
    void setLength(double side){
        super.setWidth(side);
        super.setLength(side);
    }
    
    public String toString(){
        return "";
    }
    
}

public class Assignment_7_1_1601CS35{
    public static void main(String [] args){
        Shape c1 = new Circle(1.0,"Blue",true);
        System.out.printf("The circle has: Area: %.3f, Perimeter %.3f, Color: %s, Isfilled: %b .\n", c1.getArea(),c1.getPerimeter(),c1.getColor(), c1.isFilled());
        
        // System.out.printf("The circle has: Area: %.3f, Perimeter %.3f, Color: %s, Isfilled: %b .", ((Circle)c1).getArea(),((Circle)c1).getPerimeter(),((Circle)c1).getColor(), c1.isFilled());
        
        Circle c2 = (Circle) c1;
        System.out.printf("The circle has: Area: %.3f, Perimeter %.3f, Color: %s, Isfilled: %b .\n", c2.getArea(),c2.getPerimeter(),c2.getColor(), c2.isFilled());
        
        Shape r1 = new Rectangle(1.0,2.0,"Green",true);
        System.out.printf("The Rectangle has: Area: %.3f, Perimeter %.3f, Color: %s, Isfilled: %b .\n", r1.getArea(),r1.getPerimeter(),r1.getColor(), r1.isFilled());
        
        Rectangle r2 = (Rectangle) r1;
        System.out.printf("The Rectangle has: Area: %.3f, Perimeter %.3f, Color: %s, Isfilled: %b .\n", r2.getArea(),r2.getPerimeter(),r2.getColor(), r2.isFilled());
        
        Shape s1 = new Square(3.0,"Red",true);
        System.out.printf("The Square has: Area: %.3f, Perimeter %.3f, Color: %s, Isfilled: %b .\n", r1.getArea(),r1.getPerimeter(),r1.getColor(), r1.isFilled());
        
        Square s2 = (Square) s1;
        System.out.printf("The Square has: Area: %.3f, Perimeter %.3f, Color: %s, Isfilled: %b .\n", r2.getArea(),r2.getPerimeter(),r2.getColor(), r2.isFilled());
        
        Rectangle s3 = (Rectangle) s1;
        System.out.printf("The squre has: Area: %.3f, Perimeter %.3f, Color: %s, Isfilled: %b .\n", r2.getArea(),r2.getPerimeter(),r2.getColor(), r2.isFilled());
        
        
        
    }
    
    
}


