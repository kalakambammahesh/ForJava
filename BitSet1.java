
import java.util.BitSet;
import java.util.Scanner;

public class BitSet1{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		//int n = 1;
		BitSet B1 = new BitSet(n);
		BitSet B2 = new BitSet(n);
		
		BitSet[] bset = new BitSet[3];
		bset[1] = B1;
		bset[2] = B2;
		
		
		
		for(int i = 0;i < sc.nextInt();i++) {
			String s = sc.next();
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			switch(s){
			case "AND":
				bset[x].and(bset[y]);
				break;
			case "OR":
				bset[x].or(bset[y]);
				break;
			case "XOR":
				bset[x].xor(bset[y]);
				break;
			case "FLIP":
				bset[x].flip(y);
				break;
			case "SET":
				bset[x].set(y);
				break;
			}
			System.out.printf("%d %d %n", B1.cardinality(), B2.cardinality());
				
		}
		
	}
}