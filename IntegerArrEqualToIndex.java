import java.util.Scanner;
public class IntegerArrEqualToIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		int i;
		System.out.println("Enter the elements of the array");
		for(i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}
		int flag=0;
		for(i=0;i<size;i++){
			if(arr[i]==i){
				++flag;
				System.out.println("The number "+arr[i]+" equals its index "+i);
			}
		}
		if(flag==0){
			System.out.println("No number equals to its index");
		}
	}
}