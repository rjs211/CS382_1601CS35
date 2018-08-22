import java.lang.Math;
import java.util.Scanner;


public class Assignment_2_5_1601CS35{
     public static void main(String args[]){
         int n,p,q;
         Scanner s = new Scanner(System.in);
         System.out.print("Enter Any Number:  ");
         n = s.nextInt();
         p = 2*n-1;
         q = p;
         for(int i = n;i>0;i--){
             
             for(int j = 0;j<q;j++){
                 if(Math.abs(j-n+1)>i-1)System.out.print(" ");
                 else System.out.print(p);
             }
             System.out.println();p-=2;
         }
     }


}
