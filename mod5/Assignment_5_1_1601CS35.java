import java.util.Scanner;

public class Assignment_5_1_1601CS35{
    public static int[] rem(int a[],int num,int n){
        for(int i = 0;i<n;i++){
            if(a[i] == num){
                int b[] = new int[n-1];
                System.arraycopy(a,0,b,0,i);
                System.arraycopy(a,i+1,b,i,n-i-1);
                a = b;
                n--;
                i--;
            }
            
        }
        return a;
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
        System.out.print("Enter the integer to remove: ");
        int torem = sc.nextInt();
        a = rem(a,torem,n);
        
        n = a.length;
        if(n<=0) {System.out.print("Empty Array");System.exit(0);}
        System.out.print("The new Array:  "+a[0]);
        for(int i = 1;i<n;i++){
            System.out.print(", "+a[i]);
        }
        System.out.print("\n");
        
        
        
    }
}
