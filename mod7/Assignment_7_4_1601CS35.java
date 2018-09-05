import java.util.Scanner;
import java.lang.Math;

class delivery{
    static double morGain = 2;
    static double eveGain = 1.5;
    static double getEarning(int rounds, int code){
        if(code == 0){
            return rounds*morGain;
        }
        else if(code == 1){
            return rounds*eveGain;
        }
        else return -1.0;
    } 
}

public class Assignment_7_4_1601CS35{
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Code of delivery boy: ");
        int code = sc.nextInt();
        System.out.print("Enter the Number of rounds by delivery boy: ");
        int rounds = sc.nextInt();
        
        System.out.printf("The Weekly earning of delivery boy is: %.2f.\n",delivery.getEarning(rounds,code));
    }
}
