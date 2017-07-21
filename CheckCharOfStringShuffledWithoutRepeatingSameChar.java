package Hunter;
import java.util.Scanner;
public class CheckCharOfStringShuffledWithoutRepeatingSameChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str1=sc.next();
		System.out.println(check(str1));
		sc.close();
	}
	public static String check(String str1) {
		int len=str1.length();
		int flag=0;
		if(len==1) {
			return "valid";
		}
		else {
			for(int i=1;i<str1.length();i++) {
				if(str1.charAt(0)==str1.charAt(i)) {
					++flag;
				}
			}
			if(flag==len-1) {
				return "invalid";
			}
			else {
				return "valid";
			}
		}
	}
}
