import java.util.Scanner;

public class Assignment_5_2_1601CS35{
    public static int[] rev(int a[],int n){
        int [] b = new int[n];
        for(int i = 0;i<n;i++){
            b[i] = a[n-1-i];
        }
        return b;
    }
    
    public static int[] getinp(Scanner sc){
        System.out.print("Enter Comma Separated ints of the array: ");
        String inp = sc.nextLine();
        String[] wrds = inp.split(",");
        int n = wrds.length;
        int a[] = new int[n];
        for(int i = 0;i<n;i++){
            a[i] = Integer.parseInt(wrds[i]);
        }
        
        return a;
    }
    
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int [] a = getinp(sc);
        int n = a.length;
        a = rev(a,n);
        
        if(n<=0) {System.out.print("Empty Array");System.exit(0);}
        System.out.print("The new Array:  "+a[0]);
        for(int i = 1;i<n;i++){
            System.out.print(", "+a[i]);
        }
        System.out.print("\n");
        
        
        
    }
}
