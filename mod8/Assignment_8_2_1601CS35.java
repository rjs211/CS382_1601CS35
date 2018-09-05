import java.util.*;
import java.security.SecureRandom;

class Card{
    private final String face,suit;
    Card(String f, String s){
        face = f;
        suit  = s;
    }
    void display(){
        System.out.println(face +" of "+suit );
    }
}

class DeckOfCards{
    Card [] deck = new Card[52];
    int currentCard;
    static final int NUMBER_OF_CARDS = 52;
    static String suitTypes []  = {"Clubs","Spades","Hearts","Diamonds" };
    static String faceTypes []  = {"Ace","2","3","4","5","6","7","8","9","10","King","Queen","Jack" };
    DeckOfCards(){
        currentCard = NUMBER_OF_CARDS -1;
        int ind;
        for(int i = 0;i<4;i++){
            for(int j = 0;j<13;j++){
                ind  = 13*i+j;
                deck[ind] = new Card(faceTypes[12-j] , suitTypes[i]);
            }
        }
    }
    
    void shuffle(){
        SecureRandom rand = new SecureRandom();
        int a;
        Card c;
        for(int i = 0;i <=currentCard ; i++){
            a = rand.nextInt(currentCard+1);
            c = deck[i];
            deck[i] = deck[a];
            deck[a] = c;
        }
    }
    
    void dealCard(int n){
        if(currentCard < 0) {System.out.println("No cards left in deck. Create new deck.");return;}
        if(currentCard+1 < n ) {System.out.println("Nt enough cards. Can deal only "+ (currentCard+1) +" cards."); return;}
        for(int i = 0; i<n; i++){
            deck[currentCard].display();
            currentCard--;
        }
    }
    
}


public class Assignment_8_2_1601CS35{
    public static void main(String[] args){
        char c = 'y';
        DeckOfCards d = new DeckOfCards();
        int n;
        int ch;
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.print("Choises: 1) Create Deck. 2) shuffle Deck 3) Deal Cards 4) quit.\n Enter your Choice: ");
            ch = sc.nextInt();
            
            if(ch == 1){
                d = new DeckOfCards();
            }
            else if (ch == 2){
                d.shuffle();
            }
            else if (ch == 3){
                System.out.print("Enter the number of cards to deal: ");
                n = sc.nextInt();
                d.dealCard(n);
            }
            else if (ch == 4){
                break;
            }
        }
    }
}
