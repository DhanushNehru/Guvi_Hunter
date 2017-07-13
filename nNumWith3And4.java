import java.util.Scanner;
public class nNumWith3And4 {

	public static void main(String[] args) {
		int i,j;
		int flag=0;
		Scanner in =new Scanner(System.in);
		int n=in.nextInt();
		// TODO Auto-generated method stub
		for(i=1;i<n;i++) {
			String str=new String(i+"");
			char ch[]=str.toCharArray();
			for(j=0;j<ch.length;j++) {
				if(ch[j]=='3' || ch[j]=='4') {
					++flag;
				}
			}
			if(flag==ch.length) {
				System.out.print(i +" ");
			}
			flag=0;
		}
		in.close();
	}
}
