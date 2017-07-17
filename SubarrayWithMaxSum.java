import java.util.Scanner;
public class SubarrayWithMaxSum {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n=sc.nextInt();
		System.out.println("Enter array elements");
		int i,j;
		int arr[]=new int[n];
		for(i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int sum=0;
		int temp=0;
		int pos1=0;
		int pos2=0;
		for(i=0;i<n;i++) {
			for(j=i;j<n;j++) {
				sum=sum+arr[j];
				if(sum>temp) {
					temp=sum;
					pos1=i;
					pos2=j;
				}
			}
			sum=0;
		}
		sc.close();
		System.out.print("Sub Array with maximum sum is : \n[ ");
		for(i=pos1;i<=pos2;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("]");
	}
}
