package Hunter;
import java.util.Scanner;
public class RemoveCharToBecomePalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.next();
		int i;
		int flag=0;
		for(i=0;i<str.length();i++) {
			String str1=str.substring(0,i);
			String str2=str.substring(i+1);
			String newString=str1+str2;
			StringBuilder br=new StringBuilder(newString);
		//	System.out.println(newString);
			br=br.reverse();
		//	System.out.println(br);
			if(newString.contentEquals(br)) {
				System.out.println("The character \'"+str.charAt(i)+"\' at index "+i+" should be removed to become a palindrome");
				++flag;
				break;
			}
		}
		if(flag==0) {
			System.out.println("No character can be removed in order to make the string a palindrome");
		}
	}
}
