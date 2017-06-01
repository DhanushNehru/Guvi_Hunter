import java.util.Scanner;
public class sumOfDigPalindrome {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int a=input.nextInt();
		int ans1=calc(a);
		int ans2=calc(ans1);
		if(ans1==ans2)
		{
			System.out.println("Sum of Digits of Given number is Palindrome");
		}
		else
		{
			System.out.println("Sum of Digits of Given number is not a Palindrome");
		}
		input.close();
	}
	public static int calc(int b)
	{
		
		int sum=0;
		int temp;
		while(b!='\0')
		{
			temp=b%10;
			sum+=temp;
			b=b/10;			
		}
		return sum;
	}
}