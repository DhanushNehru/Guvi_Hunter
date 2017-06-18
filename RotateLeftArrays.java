import java.util.Scanner;
public class RotateLeftArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n=sc.nextInt();
		System.out.println("Enter the number of times to rotate");
		int r=sc.nextInt();
		int i;
		int arr[]=new int[n];
		System.out.println("Enter the elements");
		for(i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		leftRotate(arr,n,r);
		printArray(arr,n);
		sc.close();
	}
	static void leftRotate(int arr[],int n,int r){
		for(int i=0;i<r;i++){
			leftRotateByOne(arr,n);
		}
	}
	static void leftRotateByOne(int arr[],int n){
		int i,temp=arr[0];
		for(i=0;i<n-1;i++){
			arr[i]=arr[i+1];
		}
		arr[i]=temp;
	}
	static void printArray(int arr[],int n){
		for(int i=0;i<n;i++){
			System.out.print(arr[i]+" ");
		}
	}

}
