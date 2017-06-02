import java.util.Scanner;
public class MatchingNum {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number of values");
		int n=in.nextInt();
		int[] a=new int[n];
		System.out.println("Enter the values");
		int i;
		for(i=0;i<n;i++){
			a[i]=in.nextInt();
		}
		System.out.println("Enter target integer");
		int t=in.nextInt();
		int m=0;
		for(i=0;i<n;i++){
			m=m+a[i];
		}
		if(m==t){
			System.out.println("true");
		}
		else{
			System.out.println("False");
		}
	}
}