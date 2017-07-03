import java.util.Scanner;
public class SumOfPowOfGivenIntegerNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		String str=num+"0";
		char ch[]=str.toCharArray();
		long sum=0;
		int i;
		for(i=0;i<ch.length-1;i++){
			sum=sum+(int)Math.pow(Character.getNumericValue(ch[i]), Character.getNumericValue(ch[i+1]));
		}
		System.out.println("Sum of power of given integer value is "+sum);
		sc.close();
	}
}
