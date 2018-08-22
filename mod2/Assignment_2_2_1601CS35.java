import java.util.Scanner;
import java.lang.*;

public class Assignment_2_2_1601CS35{
    public static void main(String args[]){
        int n;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of lines:  ");
        n =  s.nextInt();
        int t = 2*n-1;
        for (int  i = 1;i<=n;i++){
            for(int j = 0;j<t;j++){
                if(Math.abs(j-n+1) < i) System.out.print(i);
                else System.out.print(" ");
            }
            System.out.println();
        }
        
        
        
        
        
    }

}
