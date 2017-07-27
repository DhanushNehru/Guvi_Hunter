import java.util.Scanner;
class Node{
	char data;
	Node next;
}
public class SinglyLinkedListPalindrome {
	static String str1="";
	static String str2="";
	static int count1=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinglyLinkedListPalindrome sl=new SinglyLinkedListPalindrome();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of characters to be filled");
		int n=sc.nextInt();
		Node head=null;
		System.out.println("Enter the characters");
		for(int i=0;i<n;i++) {
			char get=sc.next().charAt(0);
			head=insertNode(head,get);
		}
		sl.print(head);
		sl.reversePrint(head);
	//	System.out.println(str1);
	//	System.out.println(str2);
		if(str1.equals(str2)){
			System.out.println("Singly Linked List is a Palindrome");
		}
		else {
			System.out.println("Singly Linked List not a Palindrome");
		}
		sc.close();
	}
	static Node insertNode(Node head,char data) {
		Node newNode=new Node();
		newNode.next = null;
		newNode.data=data;
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
	void print(Node head) { 
		Node head2=head;
		while(head2!=null) {
			++count1;
			str1=str1+""+head2.data;
			head2=head2.next;			
		}
	}  
	void reversePrint(Node head) {
		  Node head1=head;
		  if(head==null); 
		  else {
			  if(head1.next!=null)
			      reversePrint(head1.next);
			  str2=str2+head1.data;
		  }
	}  
}
