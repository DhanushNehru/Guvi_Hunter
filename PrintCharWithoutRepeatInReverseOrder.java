package Hunter;
import java.util.Scanner;
public class PrintCharWithoutRepeatInReverseOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string");
		String str=sc.next();
		char ch[]=str.toCharArray();
		int flag=0;
		str="";
		for(int i=0;i<ch.length;i++) {
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					++flag;
					break;
				}
			}
			if(flag==0) {
				str=str+ch[i];
			}
			flag=0;
		}
		StringBuffer br=new StringBuffer(str);
		System.out.println(br.reverse());
		sc.close();
	}
}
