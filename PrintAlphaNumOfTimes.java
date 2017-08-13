package Hunter;
import java.util.Scanner;
public class PrintAlphaNumOfTimes {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		str=str+" ";
		int i;
		int j;
		char a='0';
		int n=0;
		for(i=0;i<str.length()-1;i++) {
			if(Character.isAlphabetic(str.charAt(i))) {
				a=str.charAt(i);
			}
			
			if(Character.isDigit(str.charAt(i)) && Character.isDigit(str.charAt(i+1))  ) {
				n=Integer.parseInt(str.charAt(i)+""+str.charAt(i+1)+"");
				for(j=0;j<n;j++) {
					System.out.print(a);
				}
			}
			else if(Character.isDigit(str.charAt(i))){
				if(Character.isDigit(str.charAt(i-1))){
					continue;
				}
				n=Integer.parseInt(str.charAt(i)+"");
				for(j=0;j<n;j++) {
					System.out.print(a);
				}
			}
			n=0;
		}
		sc.close();
	}

}
