import java.util.Scanner;
import java.lang.Math;




class Invoice{
    String part_number;
    String part_description;
    int qty;
    float price;
    
    void setPart_number(String s){
        this.part_number = s;
    }
    
    void setPart_description(String s){
        this.part_description = s;
    }
    
    void setqty(int s){
        if(s<0) s = 0;
        this.qty = s;
        
    }
    
    void setprice(float s){
        if(s<0.0f) s = 0.0f;
        this.price = s;
    }
    
    Invoice(){
        Scanner sc = new Scanner(System.in);
        String s;
        System.out.print("Enter the partNumber: ");s = sc.nextLine(); setPart_number(s);
        System.out.print("Enter the part Description: ");s = sc.nextLine(); setPart_description(s);
        System.out.print("Enter the Qutantity: ");int b = sc.nextInt(); setqty(b);
        System.out.print("Enter the Price: "); float f = sc.nextFloat(); setprice(f);
        
    }
    
    String getPart_number(){
        return part_number;
    }
    
    String getPart_description(){
        return part_description;
    }
    
    int getqty(){
        
        return qty;
    }
    
    float getprice(){
        return price;
    }
    
    float getInvoiceAmount(){
        return (float) qty * price;
    }
    
    
}


public class Assignment_6_5_1601CS35{
    public static void main(String Args[]){
        Scanner sc = new Scanner(System.in);
        Invoice inv1 = new Invoice();
        System.out.printf("The part number: %s\npart Description: %s\nQuantity: %d\nQuantity: %.2f\nInvoiceAmount :%.2f\n",inv1.getPart_number(),inv1.getPart_description(),inv1.getqty(),inv1.getprice(),inv1.getInvoiceAmount());
    }
}