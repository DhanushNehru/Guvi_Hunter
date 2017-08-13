package sql;
import java.util.Scanner;
public class SubstringStringIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String1 :");
		String str1=sc.next();
		System.out.println("Enter String2 :");
		String str2=sc.next();
		int l1=str1.length();
		int l2=str2.length();
		System.out.println(validate(str1,str2,l1,l2));
		sc.close();
	}
	public static int validate(String str1,String str2,int l1,int l2) {
		int ans=0;
		if(l2>l1) {
			ans=1;
		}
		else {
			for(int i=0;i<l1-l2;i++) {
				if(str1.substring(i,i+l2).equals(str2)) {
					ans=i;
					break;
				}
				else {
					ans=-1;
				}
			}
		}
		return ans;
	}

}
