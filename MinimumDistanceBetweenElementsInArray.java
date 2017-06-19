import java.util.Scanner;
public class MinimumDistanceBetweenElementsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		System.out.println("Enter the array elements");
		int arr[]=new int[size];
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the two elements to find the minimum distance");
		int ele1=sc.nextInt();
		int ele2=sc.nextInt();
		int i,j;
		int tem=0;
		int flag=0;
		for(i=0;i<size;i++){
			for(j=0;j<size;j++){
				if(ele1==arr[i] && ele2==arr[j] && i!=j){
					++flag;
					if(flag==1){
						tem=Math.abs(i-j);
					}
					if(tem>Math.abs(i-j)){
							tem=Math.abs(i-j);
					}					
				}
			}
		}
		if(tem!=0)
			System.out.println("Minimum Distance : "+tem);
		else
			System.out.println("The elements are not present in the array");
		sc.close();
	}
}