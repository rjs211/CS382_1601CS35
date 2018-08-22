import java.util.Scanner;

public class Assignment_5_6_1601CS35{

    
    public static int[] getinp(Scanner sc){
        System.out.print("Enter Comma Separated ints of the array: ");
        String inp = sc.nextLine();
        String[] wrds = inp.split(",");
        int n = wrds.length;
        int a[] = new int[5];
        try{
            for(int i = 0;i<n;i++){
                a[i] = Integer.parseInt(wrds[i]);
            }
        }catch(ArrayIndexOutOfBoundsException e ){
            System.out.println("This is RJS handling the exception:"+e);
        }    
        return a;
    }
    
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int [] a = getinp(sc);
        // int n = a.length;
        // // int mn,mx,sum;
        // int mn = a[0];
        // int mx = a[0];
        // int sum = 0;
        // for(int i = 0;i<n;i++){
        //     sum+=a[i];
        //     if(mn>a[i]){mn = a[i];}
        //     else if(mx<a[i]) mx = a[i];
        // }
        // sum= sum-mx-mn;
        // float avg = (float) sum / (float)(n-2);
        // System.out.printf("The avg is: %.2f \n",avg);
        
        
    }
}
