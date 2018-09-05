import java.util.Scanner;
import java.lang.Math;
import java.util.Date;
import java.text.SimpleDateFormat;


class Customer{
    String name;
    boolean member;
    String memberType;
    
    Customer(String name){
        name = new String("NoName");
        memberType = new String("NotApplicable");
        member = false;
    }
    String getName(){
        return name;
    }
    boolean isMember(){
        return member;
    }
    
    void setMember(boolean member){
        this.member  = member;
        if(member) setMemberType("NotAssigned");
    }
    
    String getMemberType(){
        return this.memberType;
    }
    void setMemberType(String type){
        this.memberType = type;
    }
    
    public String toSting(){
        return "";
    }
}

class Visit{
    Customer customer;
    Date date;
    Double serviceExpense;
    double productExpense;
    
    Visit(String name, Date date){
        customer = new Customer(name);
        this.date = date;
    }
    
    String getName(){
        return customer.getName();
    }
    
    double getServiceExpense(){
        return serviceExpense; 
    }
    double getProductExpense(){
        return productExpense; 
    }
    
    void setServiceExpense(double ex){
        serviceExpense = ex;
    }
    
    void setProductExpense(double ex){
        productExpense = ex;
    }
    
    double getTotalExpense(){
        double sd = 1.0 - DiscountRate.getServiceDiscountRate(customer.memberType);
        double pd = 1.0 - DiscountRate.getProductDiscountRate(customer.memberType);
        
        return serviceExpense*sd + productExpense*pd;
    }
    
    public String toString(){
        return "";
    }
    
}

class DiscountRate{
    static double serviceDiscountPremium = 0.2;
    static double serviceDiscountGold = 0.15;
    static double serviceDiscountSilver = 0.1;
    static double productDiscountPremium = 0.1;
    static double productDiscountGold = 0.1;
    static double productDiscountSilver = 0.1;
    
    static double getServiceDiscountRate(String type) {
        if(type.equals("Premium")) return serviceDiscountPremium;
        if(type.equals("Gold")) return serviceDiscountGold;
        if(type.equals("Silver")) return serviceDiscountSilver;
        return 0.0;
    }
    
    static double getProductDiscountRate(String type) {
        if(type.equals("Premium")) return productDiscountPremium;
        if(type.equals("Gold")) return productDiscountGold;
        if(type.equals("Silver")) return productDiscountSilver;
        return 0.0;
    }

} 
public class Assignment_7_2_1601CS35{
    public static void main(String[] args) throws Exception{
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Visit v1;
        String s = "2018-05-06";
        
        try{
        Date d = sdf.parse(s);
        v1 = new Visit("Srivatsa", d); 
        v1.customer.setMember(true);
        v1.customer.setMemberType("Gold");
        v1.setServiceExpense(100);
        v1.setProductExpense(100);
        System.out.printf("The Total Expense of visit is: %.2f\n",v1.getTotalExpense() );
        
        } catch(Exception ex){
            ex.printStackTrace();
        
        }
        //https://stackoverflow.com/questions/16402164/set-a-string-variable-to-a-date-object-in-java
        
    }
}