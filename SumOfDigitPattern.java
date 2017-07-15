import java.util.Scanner;
public class SumOfDigitPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String str=new String(n+"");
		int i,j;
		int sum1=0;
		int sum2=0;
		char ch[]=str.toCharArray();
		for(i=0;i<str.length();i++) {
			for(j=0;j<=i;j++) {
				sum1=sum1+Integer.parseInt(ch[j]+"");
			}
			sum2=sum2+sum1;
			sum1=0;
		}
		System.out.println(sum2);
		sc.close();
	}
}
