import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node1{
	int data;
	Node1 left, right;
	
	Node1(int data){
		this.data = data;
		left = right = null;
	}

	
}

public class BSTPrac {
	
	static void levelOrder(Node1 root) {
		Queue<Node1> queue = new LinkedList<Node1>();
		queue.add(root);
		
		while(!queue.isEmpty()) {
			Node1 current = queue.remove();
			System.out.println(current.data);
			if(current.left != null) queue.add(current.left);
			if(current.right != null) queue.add(current.right);
		}
	}
	
	static Node1 insert(Node1 root, int data) {
		
		if(root == null) {
			return new Node1(data);
		}else {
			Node1 cur;
			if(data < root.data) {
				cur = insert(root.left, data);
				root.left = cur;
			}else {
				cur = insert(root.right, data);
				root.right = cur;
			}
			return root;
		}
		
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int testCases = sc.nextInt();
		Node1 root = null;
		
		while(testCases-- > 0) {
			int data = sc.nextInt();
			root  = insert(root, data);
		}
		levelOrder(root);
	}

}
