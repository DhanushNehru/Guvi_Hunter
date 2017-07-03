import java.util.Scanner;
public class ReverseStringWithUpperCasePosition {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string");
		String str=sc.nextLine();
		char ch1[]=str.toCharArray();
		String[] str1=str.split(" ");
		int i;
		String str2="";
		for(i=0;i<str1.length;i++){
			StringBuffer sb=new StringBuffer(str1[i]);
			str2=str2+sb.reverse()+" ";
		}
		//System.out.println(str2);
		char ch2[]=str2.toCharArray();
		//System.out.println(ch2);
		for(i=0;i<ch1.length;i++){
			if(ch1[i]>='A' && ch1[i]<='Z'){
				ch2[i]=Character.toUpperCase(ch2[i]);
			}
			else if(ch1[i]>='a' && ch1[i]<='z'){
				ch2[i]=Character.toLowerCase(ch2[i]);
			}
			else{
				continue;
			}
		}
		String str3=new String(ch2);
		System.out.println(str3);
		sc.close();
	}
}
