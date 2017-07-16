package Hunter;
import java.util.Scanner;
public class PasswordFrom2Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String 1");
		String str1=sc.next();
		System.out.println("Enter String 2");
		String str2=sc.next();
		int len1=str1.length();
		int len2=str2.length();
		int i,j;
		int length;
		String ans1;
		String ans2;
		if(len1>=len2) {
			ans1=str2;
			ans2=str1;
			length=len1;
		}
		else {
			ans1=str1;
			ans2=str2;
			length=len2;
		}
		for(i=1;i<=length;i++) {
			ans1=ans1+i;
		}
		String answer="";
		for(i=0;i<length;i++) {
			answer=answer+ans1.charAt(i)+ans2.charAt(i);
		}
		System.out.println(answer);
		sc.close();		
	}
}
