
import java.util.*;

class PrimeNumber{

    static boolean prime(int x){
        for(int i = 2;i < Math.sqrt(x);i++){
            if(x % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        while(testCase-- > 0){
            String s;
            int x = sc.nextInt();
            if(x >= 2 && prime(x)) { 
            	s = "Not prime";
            }
            else {
            	s = "Prime";
            }
            	
            System.out.println(s);
        }
    }
}
