import java.util.Scanner;
import java.lang.Math;



class c1{
    int x = 100;
    int y = 150;
    
    class c2{
        int z=200;
        
        void accessc1(){
            System.out.printf("Accessing c1 from c2:\nValue of x: %d, value fo y: %d \n",x,y);
        }
    }
    
    c2 obj = new c2();
    
    void accessc2(){
        System.out.printf("Accessing c2-object from c1\nValue of z: %d.\n",obj.z);
    }
}


public class Assignment_6_2_1601CS35{
    public static void main(String [] args){
        c1 ob1 = new c1();
        ob1.accessc2();
        ob1.obj.accessc1();
    }
}