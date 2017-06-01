import java.util.Scanner;
public class removeElementFromArray {
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		int i;
		System.out.println("Enter the number of elements");
		int n=in.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the elements");
		for(i=0;i<n;i++){
			arr[i]=in.nextInt();
		}
		System.out.println("Enter the number to be removed");
		int num=in.nextInt();
		for(i=0;i<n;i++){
			if(arr[i]==num){
				arr[i]='\0';
			}
		}
		System.out.println("The final array after removal of an element");
		for(i=0;i<n;i++){
			if(arr[i]!='\0')
				System.out.println(arr[i]+" ");
		}
		in.close();
	}
}