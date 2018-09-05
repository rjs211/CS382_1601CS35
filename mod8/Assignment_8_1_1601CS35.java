import java.util.Scanner;
import java.lang.Math;

class Employee{
    String fname,lname,ssn;
    Employee(String s1,String s2,String s3){
        this.fname = s1;
        this.lname = s2;
        this.ssn = s3;
    }
    
    public String toString(){
        return "Employee name: "+this.fname+" "+this.lname+ " ssn: "+this.ssn+". \n";
    }
}

class PieceWorker extends Employee{
    int piecemember = 25;
    
    PieceWorker(String s1,String s2,String s3, int p){
        super(s1,s2,s3);
        piecemember  = p;
    }
    
    public String toString(){
        return "Pieceworker: "+ this.piecemember+" "+ super.toString();
    }
}

public class Assignment_8_1_1601CS35{
    public static void main(String [] args){
     PieceWorker p1 = new PieceWorker("Srivatsa", "R J", "1601CS35", 20);
     System.out.println(p1.toString());
    }
}

