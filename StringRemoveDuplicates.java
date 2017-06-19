import java.util.Scanner;
public class StringRemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=sc.next();
		char ch[]=str.toCharArray();
		int len=str.length();
		int flag=0;
		for(int i=0;i<len;i++){
			for(int j=0;j<len;j++){
				if(ch[i]==ch[j] && i!=j){
					flag=1;
				}	
			}
			if(flag==0){
				System.out.println(ch[i]);
			}
			flag=0;
		}
		sc.close();
	}
}