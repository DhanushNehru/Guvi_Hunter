import java.util.Scanner;
public class SumOfPowValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=4;
		int sum=1;
		int ans=0;
		String str=new String(n+"");
		for(int i=1;i<=str.length();i++) {
			int num=n%10;
			for(int j=1;j<=a;j++) {
				sum=sum*num;
			}
			ans=ans+sum;
			sum=1;
			n=n/10;
		}
		System.out.println(ans);
		sc.close();
	}
}
