package com.interview;

import java.util.Scanner;

class Node{
    int data;
    Node next;
    
    Node(int data) {
        this.data = data;
        next = null;
    }
}

public class LinkedLin {
	
	private static Scanner sc = new Scanner(System.in);
	
	static Node head = null;
	
	public static void printList(Node head) {
		while(head != null) {
			System.out.print(head.data+" ");
			System.out.println(head);
			head = head.next;
		}
	}
	
	
	//Deleting Node 
	
	public static void deleteNode(int data) {
		Node root = head;
		while(root != null && root.next != null) {
			if(root.next.data == data) {
				root.next = root.next.next;
				break;
			}else {
				root = root.next;
			}
		}
	}
	
	//Inserting Node at end 
	public static void addNode(int data) {
		
		if(head == null) {
			head = new Node(data);
		} else {
			Node cur = new Node(data);
			Node root = head;
			while(root.next != null) {
				root = root.next;
			}
			root.next = cur;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numOfNode = 7;
		int data;
		
		
		while(--numOfNode > 0) {
			System.out.println("Please Enter New Node Data");
			data = sc.nextInt();
			addNode(data);
		}
		deleteNode(10);
		printList(head);
	}

}
