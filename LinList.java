import java.util.Scanner;

class Node2{
	Node2 next;
	int data;
	Node2(int data){
		this.data = data;
		next = null;
	}
}

public class LinList {
	
	static Node2 insert(Node2 head, int data) {
		
		Node2 p = new Node2(data);
		
		if(head == null) {
			head = p;
		}else if(head.next == null) {
			head.next = p;
		}else {
			Node2 start = head;
			while(start.next != null) {
				start = start.next;
				
			}
			start.next = p;
		}
		
		return head;
	}
	
	static Node2 removeDuplicates(Node2 head) {
		Node2 start = head;
		while(start.next != null) {
			if(start.data == start.next.data) {
				start.next = start.next.next;
			}else {
				start = start.next;
			}
		}
		return head;
	}
	
	static void display(Node2 head) {
		Node2 start = head;
		while(start != null) {
			System.out.print(start.data + " ");
			start = start.next;
		}
	}

	public 	static void main(String... args) {
		Scanner sc = new Scanner(System.in);
		
		int testCase = sc.nextInt();
		
		Node2 head = null;
		while(testCase-- > 0) {
			int data = sc.nextInt();
			head = insert(head, data);
			//System.out.println(head.data);
			
		}
		head = removeDuplicates(head);
		display(head);

	}

}
