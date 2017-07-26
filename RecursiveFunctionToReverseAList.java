package Hunter;
import java.util.Scanner;
class Node{
	char data;
	Node next;
}
public class RecursiveFunctionToReverseAList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of nodes to be inserted in the list:");
		int n=sc.nextInt();
		Node head=new Node();
		for(int i=0;i<n;i++) {
			insertNode(head,sc.next().charAt(0));
		}
		reversePrintList(head);
	}
	static Node insertNode(Node head,char data) {
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
	static void reversePrintList(Node head) {
		  Node head1=head;
		  if(head1.next!=null)
		      reversePrintList(head1.next);
		  System.out.println(head1.data);
	}
}
