import java.util.Scanner;
public class BalancedWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int i;
		int count=0;
		String str1=str.toLowerCase();
		for(i=1;i<str1.length()-2;i++) {
			if(!( (str1.charAt(i)>='a' && str1.charAt(i)<='m')   && (str1.charAt(i+1)>='a' && str1.charAt(i+1)<='m') )) {
				++count;
			}
		}
		if(count==0) {
			System.out.println(str+" is not balanced.");
		}	
		else {
			System.out.println(str+" is balanced.");
		}
		sc.close();
	}
}
