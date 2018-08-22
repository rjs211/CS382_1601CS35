import java.util.Scanner;

public class Assignment_5_3_1601CS35{

    
    public static String[] getinp(Scanner sc){
        System.out.print("Enter Comma Separated String array: ");
        String inp = sc.nextLine();
        String[] wrds = inp.split(",");
        // int n = wrds.length;
        // int a[] = new int[n];
        // for(int i = 0;i<n;i++){
        //     a[i] = Integer.parseInt(wrds[i]);
        // }
        
        return wrds;
    }
    
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String [] s1 = getinp(sc);
        String [] s2 = getinp(sc);
        
        int l1 = s1.length;
        int l2 = s2.length;
        boolean flg = false;
        System.out.print("The common Strings are: ");
        for(int i = 0;i<l1;i++){
            
            
            for(int j = 0;j<l2;j++){
                if(s1[i].equals(s2[j])){System.out.print(s1[i]+", ");flg = true; break;}
            }
        }
        if(!flg) System.out.print("No Strings Common.");
        
        
        System.out.print("\n");
        
        
        
    }
}
