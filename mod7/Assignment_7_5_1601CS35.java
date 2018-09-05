import java.util.Scanner;
import java.lang.Math;

class Account {
    String name;
    int acNo;
    String Atype;
    double balance;
    
    Account(String name, int acno, String Atype,double balance){
        this.name = name;
        this.acNo = acno;
        this.Atype = Atype;
        this.balance = balance;
    } 
    
    void deposit(double inc){
        balance = balance+ inc;
    }
    
    void displayBalance(){
        System.out.printf("The Available balance in %s Account is: %.2f\n", Atype,balance);
    }
    
    void withdraw(double rem){
        if(balance > rem){
            balance-=rem;
            // return true;
            System.out.println("Withdrawn Amount: "+rem );
            return;
        }
        System.out.println("Insufficient Balance.");
        
    }
    
    
}

class CA extends Account{
    static double minBal = 500.0; 
    
    CA(String name, int acno, double balance){
        super(name, acno,"Current",balance);
    }
    
    void checkPenalize(){
        if(balance < CA.minBal) {
            balance = balance*0.95;
            System.out.print("Penalized.");
            displayBalance();
        }
        else System.out.print("not penalized. Balance above minimum.\n");
    }
}

class SA extends Account{
    static double roi = 0.08; // rate per year;
    
    SA(String name, int acno, double balance){
        super(name, acno,"Savings",balance);
    }
    
    void depositInterest(){ //int years
        // double prod = Math.pow(1.+roi, (double) years);
        balance = balance*(1+roi);
        System.out.print("Interest Addes.\n");
    }
    
    
}


public class Assignment_7_5_1601CS35{
    public static void main(String[] args){
        
        CA cur = new CA("Srivatsa",1234,1000);
        cur.displayBalance();
        cur.checkPenalize();
        cur.withdraw(600.0);
        cur.checkPenalize();
        
        
        SA sav = new SA("Srivatsa",1234,1000);
        sav.displayBalance();
        sav.depositInterest();
        sav.displayBalance();
        sav.withdraw(400.0);
        sav.displayBalance();
        
        
        
        
    }
}