import java.util.Scanner;



public class Assignment_3_13_1601CS35{
    
    public static String[] arrRev(String[] arr){
        int n = arr.length ;
        int m = n/2;
        String sdum;
        for(int i = 0;i<m;i++){
            sdum = arr[i];
            arr[i] = arr[n-1-i];
            arr[n-1-i] = sdum;
        }
        return arr;
    }
    
    public static String strRev(String s){
        int n = s.length() ;
        int m = n/2;
        char cdum;
        char [] c = s.toCharArray();
        for(int i = 0;i<m;i++){
            cdum = c[i];
            c[i] = c[n-1-i];
            c[n-1-i] = cdum;
        }
        return (new String(c));
    }
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] wrds = s.split("\\s");
        int nw = wrds.length;
        for(int i = 1;i<nw-1;i++){
            wrds[i] = strRev(wrds[i]);
        }
        wrds = arrRev(wrds);
        System.out.println("New String: "+String.join(" ",wrds));
    }
}