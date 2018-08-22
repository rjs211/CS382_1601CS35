import java.lang.Math;
import java.util.Scanner;


public class Assignment_3_10_1601CS35{
    
    public static String [] strSort(String [] st,int n){
        String sdum;
        int j,i,ldum;
        for(i = n-2;i>=0;i--){
            sdum = st[i];
            ldum = sdum.length();
            for( j = i+1;j<n;j++){
                if(st[j].length() > ldum ) st[j-1]= st[j];
                else break;
            }
            st[j-1] = sdum;
        }
        
        return st;
    }
    
    
    public static void main(String args []){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Strings: ");
        n = sc.nextInt();
        sc.nextLine();
        String st [] = new String[n];
        int slen[] = new int[n];
        for(int i = 0;i<n;i++){
            st[i] = sc.nextLine();
            //slen[i] = st[i].length();
            
        }
        st = strSort(st,n);
        
        for(int i = 0;i<n;i++){
            slen[i] = st[i].length();
        }
        
        int k;
        for (int i = slen[0] ;i>0 ;i--){
            
            for(int j = 0;j<n;j++){
                k = slen[j]-i;
                if(k>=0) System.out.print(st[j].charAt(k));
            }
            System.out.print(",");
        }
        
        
    }
}