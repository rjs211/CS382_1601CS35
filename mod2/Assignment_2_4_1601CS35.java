import java.util.Scanner;
import java.lang.Math;

public class Assignment_2_4_1601CS35{
    public static void main(String args []){
        int n;
        System.out.print("Ennter number of Rows:  ");
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int t = 2*n-1;
        int p,q;
        for(int  i = 0;i<n;i++){
            
            for(int j = 0;j<t;j++){
               q = Math.abs(j-n+1); 
                if (q>i) System.out.print(" "); 
                else System.out.print(i+1-q);    
            }
            System.out.print("\n");
        }
    }

}
