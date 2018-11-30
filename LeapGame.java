import java.util.*;

public class LeapGame {

    public static boolean canWin(int leap, int[] game) {
        // Return true if you can win the game; otherwise, return false.
        int n = game.length;
        boolean flag = false;
        	int i = 0;
        	while(i < n) {
        		if(i + leap >= n) { 
        			flag = true;
        			break;
        		}else if(i + leap == n-1 && game[n-1] == 0) {
        			flag = true;
        			i = i+ leap;
        		}else {
        			if(i+leap < n && game[i+leap] == 0) {
        				i = i+leap;
        			}else {
        				if(game[i+1] == 0) {
        					i++;
        				}else {
        					break;
        				}
        			}
        		}//inner else
        	}
        return flag;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}

