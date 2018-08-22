import java.util.Scanner;

public class Assignment_5_4_1601CS35{
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
        System.out.print("Enter then sum of the two numbers: ");
        int tc = sc.nextInt();
        System.out.print("The pairs are:  ");
        for(int i = 0;i<n;i++){
            for(int j = i+1;j<n;j++){
                if(a[i]+a[j]==tc) System.out.print("("+a[i]+", "+a[j]+" ),");
            }
        }
        
        System.out.print("\n");
        
        
        
    }
}
