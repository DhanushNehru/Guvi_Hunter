import java.util.Scanner;
public class ReverseOrderOfTwoWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String str1[]=str.split(" ");
		str="";
		for(int i=str1.length-1;i>=0;i--){
			str=str+str1[i]+" ";
		}
		System.out.println(str.trim());
		sc.close();
	}
}