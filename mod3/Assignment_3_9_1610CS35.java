import java.lang.Math;
import java.util.Scanner;

public class Assignment_3_9_1601CS35{
    public static void main(String args[]){
        int n;
        int mxln = 0;
        int cln;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The number of strings: ");
        n = sc.nextInt();
        sc.nextLine();
        String s [] = new String[n];
        System.out.print("Enter the strings\n");
        for(int i = 0;i<n;i++){
            // System.out.println(i);
            s[i] = sc.nextLine();
            cln = s[i].length();
            if(cln>mxln) mxln = cln;
        }
        int i = 0;int j = n-1;int xj = 0;
        while(i<j){
            xj = mxln - s[i].length();
            System.out.print(s[i]+new String(new char[xj]).replace("\0","J"));
            xj = mxln - s[j].length();
            s[j] = s[j]+new String(new char[xj]).replace("\0","J");
            for(int k = mxln-1;k>=0;k--) System.out.print(s[j].charAt(k));
            i++;j--;
        }
        xj = mxln - s[i].length();
        if(i==j) System.out.print(s[i]+new String(new char[xj]).replace("\0","J"));
        System.out.println();
        
    }
}
