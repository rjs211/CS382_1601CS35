import java.util.Scanner;

public class Assignment_3_11_1601CS35{
    
    
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
        String s = sc.nextLine();
        char c[] = s.toCharArray();
        char v[] = {'A','E','I','O','U','a','e','i','o','u'};
        int n = s.length();
        for(int i = 0;i<n;i++){
            for(int j = 0;j<10;j++){
                if(c[i] == v[j]){ c[i] = '$'; break;}
            }
        }
        s = new String(c);
        System.out.println("Output: "+s);
    }
}