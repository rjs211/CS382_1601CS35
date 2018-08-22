import java.util.Scanner;

class InsufBalanceException extends Exception{
    InsufBalanceException(String s){
        super(s);
    }
}
class totest{
    int bal;
    void withdraw(int wd) throws InsufBalanceException{
        if(wd>bal) throw new InsufBalanceException("Sorry, insufficient balance! ");
        else {bal-=wd; System.out.print("Withdrawn. Current Balance: "+bal);}
    }
}


public class Assignment_5_7_1601CS35{

    

    
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Current Balance: ");
        totest t = new totest();
        t.bal = sc.nextInt(); 
        System.out.print("Enter The amount to withdraw: ");
        int wda = sc.nextInt();
        try{ t.withdraw(wda);}
        catch(Exception m){System.out.println("RJS: Exception Message: "+m);}

        
        
    }
}
