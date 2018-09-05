import java.util.Scanner;
import java.lang.Math;

public class Assignment_3_6_1601CS35{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String to use: ");
        String s = sc.nextLine();
        
        char sa[] = s.toCharArray();
        int ln = s.length();
        int lc = ln / 2;
        
        char c;
        for(int  i= 0;i<lc;i++){
            c = sa[i];
            sa[i] = sa[ln-1-i];
            sa[ln-i-1] = c;
            
            
        }
        String srev = new String(sa);
        System.out.println("Reverse String: "+srev);
        
        if( s.toLowerCase().equals(srev.toLowerCase())) System.out.println("Is Palindrome: Yes");
        else System.out.println("Is Palindrome: No");
        
        System.out.println("Length of String is: "+ln);
        
        
        
    }
}
