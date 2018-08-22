import java.lang.Math;
import java.util.Scanner;

// The strings are Case snsitive and capital ascii is smaller than lowercase ascii


public class Assignment_3_2_1601CS35{

    public static void main(String [] args){
        System.out.print("Enter The first String: ");
        Scanner sc = new Scanner(System.in);
        String s0 = sc.nextLine();
        System.out.print("Enter The Second String: ");
        //Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        int a = s1.compareTo(s0);
        if(a!= 0){
            if(a>0) System.out.println("Second String is bigger.");
            else System.out.println("First String is bigger");
            
        }
        else System.out.println("Both strings are Equal.");
        
        
    }

}
