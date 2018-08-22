import java.util.Scanner;



class Info{
    String addr;
    String Fname;
    String Lname;
    int age;
    Info(){
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the Fname:");
        // String fn = sc.nextLine();
        // System.out.println("Enter the Lname:");
        // String ln = sc.nextLine();
        // System.out.println("Enter the Address:");
        // String ad = sc.nextLine();
        // System.out.println("Enter the age:");
        // int ag = sc.nextInt();
        this(19);
        
        System.out.printf("Name: %s %s Age: %d Address: %s\n",this.Fname,this.Lname,this.age,this.addr);
    }
    Info(String fn,String ln){
        
        this.Fname = fn;
        this.Lname = ln;
    }
    Info(String address){
        this("FIRST","Last");
        this.addr = address;
    }
    Info(int age){
        this("MyAddr!!!@@@");
        this.age = age;
    }
}


class Main{
    Main(){
        Info mainInfo = new Info();
    }
}

public class Assignment_4_4_1601CS35{
    public static void main(String [] args){
        Main m1 = new Main();
    }
}