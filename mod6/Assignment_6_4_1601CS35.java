import java.util.Scanner;
import java.lang.Math;

class Rectangle{
    float width,length,area;
    String color;
    
    void set_length(){
    
        System.out.print("Enter the lenth of Rectangle: ");
        Scanner sc = new Scanner(System.in);
        length = sc.nextFloat();
    }
    
    void set_width(){
    
        System.out.print("Enter the width of Rectangle: ");
        Scanner sc = new Scanner(System.in);
        width = sc.nextFloat();
    }
    
    void set_color(){
    
        System.out.print("Enter the color of Rectangle: ");
        Scanner sc = new Scanner(System.in);
        color = sc.nextLine();
    }
    
    void set_area(){
        area = length*width;
    }
    
    Rectangle(){
        set_length();
        set_width();
        set_color();
        set_area();
    }
    
    void compare(Rectangle r){
        if(r.area == this.area && r.color.equals(this.color)) System.out.println("Matching Rectangles");
        else System.out.println("Non-Matching Rectangles");
    }
    
}

public class Assignment_6_4_1601CS35{
    public static void main(String args []){
        System.out.print("For  R1:  ");
        Rectangle R1 = new Rectangle();
        System.out.print("For  R2:  ");
        Rectangle R2 = new Rectangle();
        System.out.print("For  R3:  ");
        Rectangle R3 = new Rectangle();
        
        System.out.print("Comparing R1,R2:  ");R1.compare(R2);
        System.out.print("Comparing R1,R3:  ");R1.compare(R3);
    }
    
    
}


