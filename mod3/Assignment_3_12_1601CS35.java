import java.util.Scanner;



public class Assignment_3_12_1601CS35{
    
    public static void main(String [] args){
        System.out.print("Enter The Starting String: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char c = 'y';
        int ch;
        int pos;
        char nch;
        char yn;
        int noc,nov;
        String vl = "AEIOUaeiou";
        while(c == 'y' || c == 'Y'){
            System.out.print("Choices:1) Insert a character in any position of given string. \n2)Delete a character in any position of given string.\n3.) Count the number of vowels and Consonants.\n Enter your choice:  ");
            ch = sc.nextInt();
            sc.nextLine();
            switch(ch){
                case 1:
                    System.out.print("Enter the position to enter new character:(zero indexed) " );
                    pos = sc.nextInt();
                    if(pos > s.length()) {System.out.print("Position invalid\n");break;}
                    sc.nextLine();
                    System.out.print("Enter the new character: ");
                    nch = sc.next().charAt(0);
                    s = s.substring(0,pos)+Character.toString(nch)+s.substring(pos);
                    System.out.println("New String: "+s );
                    break;
                case 2:
                    System.out.print("Enter the position to delete character: (zero indexed)");
                    pos = sc.nextInt();
                    sc.nextLine();
                    if(pos >= s.length()) {System.out.print("Position invalid\n");break;}
                    s = s.substring(0,pos)+s.substring(pos+1);
                    System.out.println("New String: "+s );
                    break;
                case 3:
                    noc = 0;nov = 0;
                    for(int i = 0;i<s.length();i++){
                        nch = s.charAt(i);
                        if(Character.isLetter(nch)){
                            if(vl.contains(Character.toString(nch))) nov++;
                            else noc++;
                        }
                    }
                    System.out.println("Nuber of vowels: "+nov+"\nNumber of Consonants = "+noc);
                    break;
                default:
                    System.out.print("Invalid Choice.");
                    break;
            }
            System.out.print("Press 'y' to to Continue :");
            c = sc.next().charAt(0);
            sc.nextLine();
        }
        
    }
}