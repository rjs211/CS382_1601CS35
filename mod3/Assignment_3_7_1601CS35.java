import java.util.Scanner;
import java.lang.Math;
import java.util.*;

class DataHolder {
	 char c;
	 int freq;
	 int start;

	public DataHolder(char c) {
		this.c = c;
		freq = 0;
		start = -1;
	}

	public void incrementFreq(int start) {
		this.freq++;
		if(this.start == -1) {
			this.start = start;
		}
	}
}

class DataHolderComparator implements Comparator<DataHolder> {
    @Override
    public int compare(DataHolder a, DataHolder b) {
        if(a.freq != b.freq) {
        	return (a.freq > b.freq) ? -1 : 1 ;
        } 

        return (a.start <= b.start ) ? -1 : 1;
    }
}

public class Assignment_3_7_1601CS35 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s;
    
        System.out.print("Enter a string: ");
        s = sc.nextLine();

        char[] sa = s.toCharArray();
        
        int n = s.length();
        
        ArrayList<DataHolder> al = new ArrayList<>();
        for(int i = 0; i < 256; i++) {
        	DataHolder dh = new DataHolder((char) i);
        	al.add(dh);
        }

        for(int i = 0; i < n; i++) {
        	int index = sa[i];
        	if(sa[i] == ' ') {
        		continue;
        	}
        	al.get(index).incrementFreq(i);
        }

        Collections.sort(al, new DataHolderComparator());

        for(int i = 0; i < 256; i++) {
        	DataHolder dh = al.get(i);
        	if(dh.freq > 0) {
        		System.out.print(al.get(i).c + "-" + al.get(i).freq + ", ");
        	}
        }
    }
}
