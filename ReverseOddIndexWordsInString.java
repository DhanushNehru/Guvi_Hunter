import java.util.Scanner;
public class ReverseOddIndexWordsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String str1[]=str.split(" ");
		String str2="";
		String str3="";
		for(int i=0;i<str1.length;i++){
			if(i%2==0){
				StringBuffer br=new StringBuffer(str1[i]);
				str2=br.reverse()+"";
			}
			else{
				str2=str1[i];
			}
			str3=str3+str2+" ";
		}
		System.out.println(str3);
		sc.close();
	}
}