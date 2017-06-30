import java.util.Scanner;
import java.util.Arrays;
public class tallStu4th {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of students:");
		int num=sc.nextInt();
		int i,j;
		int[] arr=new int[num];
		for(i=0;i<num;i++){
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		try
		{
		if(num>=4){
		for(i=num-4;i>=0;i-=4){
			System.out.println(arr[i]);
		}
		}
		else{
			throw new Exception();
		}
		}
		catch(Exception e){
			System.out.println("There is no 4th tallest student");
		}
	}
}
