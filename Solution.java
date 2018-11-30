    import java.util.*;
    public class Solution {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            Deque<Integer> deque = new ArrayDeque<Integer>();
            int n = in.nextInt();
            int m = in.nextInt();

            int max = 0;
            for (int i = 0; i < n; i++) {
                int num = in.nextInt();
                deque.addFirst(num);
                if(deque.size() == m) {
                	Set<Integer> set = new HashSet<Integer>(deque);
                	//System.out.println(set);
                	if(set.size() > max) max = set.size();
                	deque.removeLast();
                }
            }
            System.out.println(max);
        }
    }



