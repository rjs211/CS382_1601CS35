import java.util.Scanner;
import java.lang.Math;

public class Assignment_3_5_1601CS35{
    public static void main(String [] args){
        
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter First String:  ");
        String s0 = sc.nextLine();
        System.out.print("Enter The second string:  ");
        String s1 = sc.nextLine();
        char[] sa0 = s0.toCharArray();
        char[] sa1 = s1.toCharArray();
        int ln= s0.length()+s1.length()+1;
        char[] sa3 = new char[ln];
        int i;
        for( i= 0;i<s0.length();i++){
            sa3[i] = sa0[i];
        }
        sa3[i] = ' ';
        i++;
        
        for( int j=0;i<ln;i++,j++){
            sa3[i] = sa1[j];
        }
        String s3 = new String(sa3);
        System.out.println("The resulting string is:"+s3);
        
        
        
        
    }
}
