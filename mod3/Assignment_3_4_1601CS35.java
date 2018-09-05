import java.lang.Math;
import java.util.Scanner;


public class Assignment_3_4_1601CS35{
    public static void main(String [] args){
        int a0[] = new int[256];
        int a1[] = new int[256];
        // for(int i = 0;i<27,i++){
        //     a0[i] = 0;a1[i] = 0;
        // }
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First String.");
        String s0 = sc.nextLine();
        s0 = s0.toLowerCase();
        System.out.print("Enter Second String: ");
        String s1 = sc.nextLine();
        s1 = s1.toLowerCase();
        if(s1.length()!= s0.length()) System.out.println("They are not anagrams");
        int c;
        for(int i = 0;i<s0.length();i++){
            c = (int) s0.charAt(i);
            a0[c]++;
            c = (int) s1.charAt(i);
            a1[c]++;
            
        }
        c = 0;
        for(int i = 0;i<256;i++){
            if(a0[i]!= a1[i]){
                System.out.println("They are not anagrams"+i);System.exit(0);
            }
            
        }
        System.out.println("They are anagrams.");
        
        
    }
}
