package com.interview;

import java.util.Scanner;

class Node1 {
	int data;
	Node1 left, right;
	
	Node1(int data) {
		this.data = data;
		left = right = null;
	}
}

public class BinaryTree {
	
	public static Node1 addNode1(Node1 root, int data) {
		
		if(root == null) {
			root = new Node1(data);
		}else if(data < root.data) {
			Node1 curr = addNode1(root.left, data);
			root.left = curr;
		} else if(root.right == null) {
			Node1 curr = addNode1(root.right, data);
			root.right = curr;
		}
		return root;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int times = 3;
		int data;
		Node1 root = null;
		Scanner sc = new Scanner(System.in);
		while(times-- > 0) {
			System.out.println("Enter data");
			data = sc.nextInt();
			root = addNode1(root, data);
		}
		
		//printTree(root) {
			
	}

}
