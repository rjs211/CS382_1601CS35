import java.util.Scanner;
import java.lang.Math;



public class Assignment_3_3_1601CS35{
    public static void main(String [] args){
        System.out.print("Enter the string to find the substrings for:  ");
        
        Scanner sc = new Scanner(System.in);
        String s0 = sc.nextLine();
        for(int i = 0;i<s0.length();i++){
            for(int j = i+1;j<=s0.length();j++){
                System.out.println(s0.substring(i,j));
            }
        }
    }
}
