import java.util.Scanner;
public class Add2NumForSpecificTarget {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int n=sc.nextInt();
		System.out.println("Enter the numbers");
		int i,j;
		int arr[]=new int[n];
		for(i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the target number");
		int target=sc.nextInt();
		int tem1=0;
		int tem2=0;
		int flag=0;
		for(i=0;i<n;i++){
			for(j=i+1;j<n;j++){
				if(arr[i]+arr[j]==target){
					tem1=arr[i];
					tem2=arr[j];
					++flag;
					break;
				}
			}
			if(flag==1){
				break;
			}
		}
		if(flag==1){
			System.out.println("The two no's "+tem1+" and "+tem2+" add upto the target element "+target);
		}
		else{
			System.out.println("No elements add up to target number");
		}	
		sc.close();
	}

}
