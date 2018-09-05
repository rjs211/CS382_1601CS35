import java.util.Scanner;
import java.lang.Math;

public class Assignment_2_1_1601CS35{
    public static void main (String args[]){
        int n,gaps,q;
        System.out.print("Enter The Number of Lines for Pascal Triangle:  ");
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        gaps = n-1;
        for (int i = 0;i<n;i++){
            q  = 1;
            for(int j = 0;j< gaps;j++) System.out.print(" ");
            for (int j = 0;j<=i;j++){
                System.out.print(q + " ");
                q = q * (i-j );
                q = q / (j+1);
            }
            gaps--;
            System.out.println();
        }
        
    
    }




}
