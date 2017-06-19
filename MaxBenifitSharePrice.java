import java.util.Scanner;
public class MaxBenifitSharePrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the stock price for 10 days");
		int arr[]=new int[10];
		int i,j;
		for(i=0;i<10;i++){
			arr[i]=sc.nextInt();
		}
		int tem=0;
		int val1=0;
		int val2=0;
		for(i=0;i<10;i++){
			for(j=0;j<10;j++){
				if((Math.abs(arr[i]-arr[j]))>tem){
					val1=i;
					val2=j;
					tem=Math.abs(arr[i]-arr[j]);
				}
			}
		}
		System.out.println("Max Benifit : "+arr[val2]+" - "+arr[val1]+" = "+Math.abs(arr[val1]-arr[val2])+"thousand");
		sc.close();
	}
}