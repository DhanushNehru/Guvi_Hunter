import java.util.Scanner;
public class NumbersMultiplicationAsString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		try{
		System.out.println(StringMul(s1,s2));
		}
		catch(Exception e){
			System.out.println("The entered string cannot be converted to a number");
		}
		sc.close();

	}
	public static String StringMul(String s1,String s2){
		int c=Integer.parseInt(s1)*Integer.parseInt(s2);
		String s=Integer.toString(c);
		return s;
	}
}
