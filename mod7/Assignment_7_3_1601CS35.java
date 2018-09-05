import java.util.Scanner;

interface Payable{
    public double getPaymentAmount();
}

class Invoice implements Payable{
    private String partNumber, partDescription;
    private double pricePerItem;
    private int quantity;
    public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem)
    {
        this.partNumber=partNumber; 
        this.partDescription=partDescription;
        if(pricePerItem<0.0)
        {
            throw new IllegalArgumentException("Price per Item must be >= 0.0");
        }
        else
        {
        this.pricePerItem=pricePerItem;
        }
        if(quantity<0)
        {
            throw new IllegalArgumentException("Quantity must be >= 0");
        }
        else
        {
        this.quantity=quantity;
        }
    }
    public String getpartNumber()
    {
        return partNumber;
    }
    public void setpartNumber(String partNumber)
    {
        this.partNumber=partNumber;
    }
    public String getpartDescription()
    {
        return partDescription;
    }
    public void setpartDescription(String partDescription)
    {
        this.partDescription=partDescription;
    }
    public int getquantity()
    {
        return quantity;
    }
    public void setquantity(int quantity1)
    {
        if(quantity1<0)
        {
            throw new IllegalArgumentException("Quantity must be >= 0");
        }
        else
        {
            quantity=quantity1;
        }
    }
    public double getpricePerItem()
    {
        return pricePerItem;
    }
    public void setpricePerItem(double pricePerItem1)
    {
        if(pricePerItem1<0.0)
        {
            throw new IllegalArgumentException("Price per Item must be >= 0.0");
        }
        else
        {
        pricePerItem=pricePerItem1;
        }
    }
    public double getPaymentAmount()
    {
        double payment=quantity*pricePerItem;
        return payment;
    }
}

abstract class Employee implements Payable{
    private String firstName, lastName, socialSecurityCode;
    public Employee(String firstName, String lastName, String socialSecurityCode)
    {
        this.firstName=firstName;
        this.lastName=lastName;
        this.socialSecurityCode=socialSecurityCode;
    }
    public String getfirstName()
    {
        return firstName;
    }
    public void setfirstName(String firstName1)
    {
        firstName=firstName1;
    }
    public String getlastName()
    {
        return lastName;
    }
    public void setlastName(String lastName1)
    {
        lastName=lastName1;
    }
    public abstract double getPaymentAmount();
}

class SalariedEmployee extends Employee{
    private double weeklySalary;
    public SalariedEmployee(String firstName, String lastName, String socialSecurityCode, double weeklySalary)
    {
        super(firstName, lastName, socialSecurityCode);
        if (weeklySalary < 0.0)
        {
            throw new IllegalArgumentException("Weekly salary must be >= 0.0");
        }
        else
        {
        this.weeklySalary = weeklySalary;
        }
    }
    public double getweeklySalary()
    {
        return weeklySalary;
    }
    public void setweeklySalary(double weeklySalary)
    {
        if(weeklySalary<0.0)
        {
            throw new IllegalArgumentException("Weekly salary must be >= 0.0");
        }
        else
        {
            this.weeklySalary=weeklySalary;
        }
    }
    public double getPaymentAmount()
    {
        double payment=weeklySalary;
        return payment;
    }
}


public class Assignment_7_3_1601CS35 {
    public static void main(String args[])
    {
        double payment=0;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the No. of Items:" + '\n');
        int totalItems=input.nextInt();
        Invoice items[]=new Invoice[totalItems];
        System.out.print("Enter partNumber, partDescription, quantity, pricePerItem for " + totalItems + " items:" + '\n');
        for(int i=0;i<totalItems;i++)
        {
            String partNumber=input.next();
            String partDescription=input.next();
            int quantity=input.nextInt();
            double pricePerItem=input.nextDouble();
            items[i]=new Invoice(partNumber, partDescription, quantity, pricePerItem);
        }
        for(int i=0;i<totalItems;i++)
        {
            System.out.print("partNumber:" + items[i].getpartNumber() + '\n');
            System.out.print("partDescription:" + items[i].getpartDescription() + '\n');
            System.out.print("quantity:" + items[i].getquantity() + '\n');
            System.out.print("Price per Item:" + items[i].getpricePerItem() + '\n');
            System.out.print("Payment Amount:" + items[i].getPaymentAmount() + '\n');
        }
        System.out.print("Enter the total No. of Employees:");
        int totalEmployee=input.nextInt();
        SalariedEmployee employee[]=new SalariedEmployee[totalEmployee];
        System.out.print("Enter the firstName, lastName, socialSecurityCode, weeklySalary:" + '\n');
        for(int i=0;i<totalEmployee;i++)
        {
            String firstName=input.next();
            String lastName=input.next();
            String socialSecurityCode=input.next();
            double weeklySalary=input.nextDouble();
            employee[i]=new SalariedEmployee(firstName, lastName, socialSecurityCode, weeklySalary);
        }
        for(int i=0;i<totalEmployee;i++)
        {
            System.out.print("First Name:" + employee[i].getfirstName() + '\n');
            System.out.print("Last Name:" + employee[i].getlastName() + '\n');
            System.out.print("Weekly Salary:" + employee[i].getweeklySalary() + '\n');
            System.out.print("Payment Amount:" + employee[i].getPaymentAmount() +'\n');
            payment=payment+employee[i].getPaymentAmount();
        }
        System.out.println("Total Payment:" + payment + '\n');
    }
}
