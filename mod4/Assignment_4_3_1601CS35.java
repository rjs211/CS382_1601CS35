import java.lang.Math;
import java.util.Scanner;

class Calculator{
    void calculate(){
        System.out.print("In the Calculator's function\n");
    }
}

class Sum extends Calculator{
    void calculate(int a,int b,int c){
     System.out.println("In Sum class Result is: "+(a+b+c));   
    }
}

class Subtract extends Calculator{
    void calculate(int a,int b){
     System.out.println("In Subtract class Result is: "+(a-b));   
    }
}


class Division extends Calculator{
    void calculate(int a,int b){
     System.out.println("In division class Result is: "+( (float)a/(float)b));   
    }
}


public class Assignment_4_3_1601CS35{
    public static void main(String[] args){
        
        Sum su = new Sum();
        su.calculate();
        su.calculate(1,2,3);
        
        
        Subtract sub = new Subtract();
        sub.calculate();
        sub.calculate(1,2);
        
        Division div = new Division();
        div.calculate();
        div.calculate(1,2);
        
        
    }
    
    
}

