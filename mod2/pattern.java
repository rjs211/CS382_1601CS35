import java.util.Scanner;

public class pattern{
    public static void main(String[] args){
        int a;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Any Number:  ");
        a = s.nextInt();
        for(int i = 0;i< a;i++){
            for(int j = 0;j<=i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        
        for(int i = a-1;i> 0;i--){
            for(int j = 0;j<i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    
    
    }
}
