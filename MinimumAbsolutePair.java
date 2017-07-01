import java.util.Scanner;
public class MinimumAbsolutePair {
	static int i=0,j=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size");
		int size=sc.nextInt();
		System.out.println("Enter the array elements");
		int arr[]=new int[size];
		for(i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}
		abs(arr,size);
	}
	public static void abs(int arr[],int size){
		if(size<2){
			System.out.println("Invalid");
		}
		else
		{
		int temp1=0;
		int temp2=0;
		int val=Math.abs(arr[0]+arr[1]);
		for(i=0;i<size;i++){//Hunter 56
			for(j=0;j<size;j++){
				if(Math.abs(arr[i]+arr[j])<=Math.abs(val) && i!=j){
					val=arr[i]+arr[j];
					temp1=arr[j];
					temp2=arr[i];
				}
			}
		}
		System.out.println("The sum closest to zero is "+val);
		System.out.println("The elements are "+temp1+" and "+temp2);
		}	
	}
}
