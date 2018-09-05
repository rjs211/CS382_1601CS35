import java.util.Scanner;
import java.lang.Math;



class Rupees{
    float value;
    float cnvtRate;
    Rupees(){
        this.value = 0.0f;
        this.cnvtRate = 55.0f;
    }
    
    Rupees(float value){
        this.value = value;
        this.cnvtRate = 55.0f;
    }
    
    Rupees(float value,float cnvtRate){
        this.value = value;
        this.cnvtRate = cnvtRate;
    }
    
    
    
    
    float cnvt(){
        return value/cnvtRate;
    }
    
    void display(){
        System.out.printf("The amount is : Rs. %.2f /-\n",this.cnvt());
    }
    
    
}

class Dollars{
    float value;
    float cnvtRate;
    Dollars(){
        this.value = 0.0f;
        this.cnvtRate = 1.0f/55.0f;
    }
    
    Dollars(float value){
        this.value = value;
        this.cnvtRate = 1.0f/55.0f;
    }
    
    Dollars(float value,float cnvtRate){
        this.value = value;
        this.cnvtRate = cnvtRate;
    }
    
    
    
    
    float cnvt(){
        //Scanner sc = new Scanner(System.in);
        
        return value/cnvtRate;
    }
    
    void display(){
        System.out.printf("The amount is : $. %.2f /-\n",this.cnvt());
    }
    
    
}



public class Assignment_6_1_1601CS35{
    public static void main(String [] args){
        System.out.print("Enter the Value in dollars: ");
        float val;
        Scanner sc = new Scanner(System.in);
        val = sc.nextFloat();
        Dollars d = new Dollars(val);
        System.out.printf("The converted value is:Rs.  %.2f /-\n",d.cnvt());
        
        System.out.print("Enter the Value in rupees: ");
        // float val;
        // Scanner sc = new Scanner(System.in);
        val = sc.nextFloat();
        Rupees e = new Rupees(val);
        System.out.printf("The converted value is:Rs.  %.2f /-\n",e.cnvt());

    }
}


