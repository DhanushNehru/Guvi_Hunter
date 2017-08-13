import java.util.Scanner;
class Node{
	int data;
	Node next;
}
public class MiddleOfLinkedList {
	static int count=0;
	static int middle=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Node head=null;
		char ch;
		do {
			System.out.print("Enter the element in the linked list : ");
			int data=sc.nextInt();
			head=insert(head,data);
			++count;
			System.out.println("Do you want to add another element in the linked list, Type Y/N");
			ch=sc.next().charAt(0);
		}while((ch=='Y' || ch=='y'));
		sc.close();
		print(head);
		middle=count/2+1;
		middleElement(head,middle);
	}
	public static Node insert(Node head,int data) {
		Node newNode=new Node();
		newNode.data=data;
		newNode.next=null;
		if(head==null) {
			head=newNode;
		}
		else {
			Node temp=head;
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next=newNode;
		}
		return head;
	}
	public static void print(Node head) {
		System.out.println("Elements in the linked list");
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data);
			if(temp.next!=null) {
				System.out.print("->");
			}
			temp=temp.next;
		}
	}
	public static void middleElement(Node head,int middle) {
		Node temp=head;
		count=0;
		while(temp!=null) {
			++count;
			if(middle==count) {
				System.out.print("\nMiddle element = "+temp.data);
			}
			temp=temp.next;
		}
	}
}
