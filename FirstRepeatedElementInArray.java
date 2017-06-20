import java.util.Scanner;
public class FirstRepeatedElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the array size");
		int size=in.nextInt();
		System.out.println("Enter the array elements");
		int i,j;
		int arr[]=new int[size];
		for(i=0;i<size;i++){
			arr[i]=in.nextInt();
		}
		int tem1=0;
		int flag=0;
		for(i=0;i<size;i++){
			for(j=i+1;j<size;j++){
				if(arr[i]==arr[j]){
					tem1=arr[i];
					flag=1;
					break;
				}
			}
			if(flag==1){
				break;
			}
		}
		if(flag==1){
			System.out.println("The first element repeated is : "+tem1);
		}
		else{
			System.out.println("No element is repeated");
		}
		in.close();
	}
}