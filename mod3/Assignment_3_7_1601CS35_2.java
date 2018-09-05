import java.util.Scanner;
import java.lang.Math;



class charfreq {
    char c;
    int freq;
    charfreq(char c){
        this.c = c;
        freq = 1;
    }
    
    boolean gtr(charfreq c2){
        return this.freq > c2.freq;
    }
}

public class Assignment_3_7_1601CS35{
    charfreq[] insort(charfreq[] s,int n){
        charfreq ch;
        for(int i = 1;i<n;i++){
            ch = s[i];
            for(int j = i-1;j>=0;j--){
                if(ch.gtr(s[j])) s[j+1] = s[j];
                else break;
            }
            s[j+1] = ch;
            
        }
        return s;
    }
    
    
    
    puiblic static void main(String args[]){
        String st = new String("IIT Patna");
        charfreq[] ch = new charfreq[256]; 
        int cflen = 0;
        for(int i = 0;i< s.length();i++){
            char p = st.charAt();
            for(int j = 0;j<cflen;j++){
                if(ch[j])
            }
            
            if(j == cflen){
                
            }
        }
    }
}
