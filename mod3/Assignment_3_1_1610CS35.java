import java.lang.Math;
import java.util.Scanner;

public class Assignment_3_1_1601CS35{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter The String: ");
        String s0 = sc.nextLine();
        System.out.print("Choices Available:\n 1) All upper Case\n 2) All lower Case\n 3) Capital Case\nEnter Your Choice ");
        int ch;
        ch = sc.nextInt();
        System.out.print("The string after manipulation is: ");
        switch(ch){
            case 1:
                System.out.print(s0.toUpperCase());
            break;
            case 2:
                System.out.print(s0.toLowerCase());
            break;
            case 3:
                s0 = s0.substring(0,1).toUpperCase()+s0.substring(1);
                for(int i = 1;i< s0.length();i++){
                    if(s0.charAt(i-1) == ' '){
                        s0 = s0.substring(0,i)+s0.substring(i,i+1).toUpperCase()+s0.substring(i+1);
                    
                    }
                }
                System.out.print(s0);
            break;
            default:
                System.out.println("Wrong input. Please Re-run program.");
            break;
        }
         
    }
}
