import java.util.Scanner;

public class ReverseOrderOfWordsWithStringInPlace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseOrderOfWordsWithStringInPlace o=new ReverseOrderOfWordsWithStringInPlace();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string :");
		String str1=sc.nextLine();
		System.out.println("The reversed string is :");
		System.out.println(o.reverse(str1));
		sc.close();
	}
	public String reverse(String str1){
		String str2[]=str1.split(" ");
		StringBuffer br;
		int i;
		String str3="";
		for(i=0;i<str2.length;i++){
			br=new StringBuffer(str2[i]);
			str3=str3+br.reverse()+" ";
		}
		return str3;
	}
}
