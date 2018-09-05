import java.util.*;
class SavingsAccount
{
    static float  annualInterestRate;
    private float savingsBalance;
    void calculateMonthlyInterest()
    {
        float j = savingsBalance*annualInterestRate/(float)(12*100);
        savingsBalance += j;

    }
    static void modifyInterestRate(float annualInterestRat)
    {
        annualInterestRate = annualInterestRat;
    }
    void set(float balance)
    {
        savingsBalance = balance;
    }
    float get()
    {
        float balance = savingsBalance;
        return balance;
    }

}
public class Assignment_6_2_1601CS35{

    public static void main(String[] args)
    {   Scanner in = new Scanner(System.in);
        SavingsAccount saver1 = new SavingsAccount();
        SavingsAccount saver2 = new SavingsAccount();
        System.out.println("Enter initial savings of saver1");
        saver1.set(in.nextFloat());
        System.out.println("Enter initial savings of saver2");
        saver2.set(in.nextFloat());
        System.out.println("Enter initial interest rate");
        SavingsAccount.annualInterestRate = in.nextFloat();
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        System.out.println("saver1 Balance: "+ saver1.get());
        System.out.println("saver2 Balance: "+saver2.get());
        System.out.println("Enter modified interest rate");
        SavingsAccount.modifyInterestRate(in.nextFloat());
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        System.out.println("saver1 Balance: "+ saver1.get());
        System.out.println("saver2 Balance: "+saver2.get());





    }
}

