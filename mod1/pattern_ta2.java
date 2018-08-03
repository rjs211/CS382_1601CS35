import java.util.Scanner;
import java.lang.Math;


public class pattern_ta2{
    public static void main(String args[]){
    int n;
    Scanner s = new Scanner(System.in);
    System.out.print("Enter any number < 26:  ");
    n = s.nextInt();
    
    char c = 'A';
    for(int i = 0;i<n;i++){
        c = 'A';
        for(int j = n-i-1;j>=0;j--){
            System.out.print(c);c++;
        }
        System.out.print("\n");
         //= char(byte(c)+1);
    }
    
    
    }



}
