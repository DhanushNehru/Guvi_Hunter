import java.util.Scanner;
public class Encryption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		char ch[]=str.toCharArray();
		int i;
		for(i=0;i<ch.length;i++){
			if(!(i==ch.length-1))
			{	if(ch[i]=='A'){
					ch[i]='Z';
				}
				else if(ch[i]=='a'){
					ch[i]='z';
				}
				else{
					ch[i]-=1;
				}
			}
		}	
		String str1=new String(ch);
		System.out.println(str1);
	}
}
