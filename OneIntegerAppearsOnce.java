import java.util.Scanner;
public class OneIntegerAppearsOnce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size");
		int s=sc.nextInt();
		System.out.println("Enter the array elements");
		int i,j;
		int[] arr=new int[s];
		for(i=0;i<s;i++){
			arr[i]=sc.nextInt();
		}
		int flag=0;
		for(i=0;i<s;i++){
			for(j=0;j<s;j++){
				if(arr[i]==arr[j] && i!=j){
					++flag;
				}
			}
			if(flag==0){
				System.out.println("Unique integer :"+arr[i]);
			}
			flag=0;
		}
	}
}
