import java.util.Scanner;
public class ElementsPairWhoseSumIsK {
	static int i,j;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ElementsPairWhoseSumIsK obj=new ElementsPairWhoseSumIsK();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size");
		int size=sc.nextInt();
		System.out.println("Enter the array elements");
		int arr[]=new int[size];
		for(i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the k value");
		int k=sc.nextInt();
		try
		{
		obj.pairs(arr,k,size);
		}
		catch(Exception e){
			System.out.println("No pair has the difference "+k);
		}
		sc.close();
	}
	public void pairs(int arr[],int k,int size) throws Exception
	{
		int count=0;
		for(i=0;i<size;i++){
			for(j=i;j<size;j++){
				if(Math.abs(arr[i]-arr[j])==k && i!=j){
					System.out.println(arr[i]+","+arr[j]);
					++count;
				}
				
			}
		}
		if(count!=0){
			System.out.println("The number of pairs whose difference is "+k+" is "+count);
		}
		else{
			throw new Exception();
		}
	}
}
