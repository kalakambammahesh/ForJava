import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node{
	int data;
	Node left, right;
	
	Node(int data){
		this.data = data;
		left = right = null;
	}
}

public class BST {
	
	static void levelOrder(Node root) {
		Queue<Node> queue = new LinkedList<Node>();
			queue.add(root);
			while(!queue.isEmpty()) {
				Node current =  queue.remove();
				System.out.println(current.data + " ");
				if(current.left != null) queue.add(current.left);
				if(current.right != null) queue.add(current.right);
			}
	}

	public static Node insert(Node root, int data) {
		
		if(root == null) {
			return new Node(data);
		}else {
			Node cur;
			if(data <= root.data) {
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
		Node root = null;
		while(testCases-- > 0) {
			int data = sc.nextInt();
			root = insert(root, data);
			//System.out.println(root.data);
		}
		levelOrder(root);
	}

}
