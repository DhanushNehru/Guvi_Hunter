package Hunter;
import java.util.Scanner;
public class FindFirstOccurenceInAStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of the set");
		int size=sc.nextInt();
		System.out.println("Enter the elements in the set");
		int i,j;
		String arr[]=new String[size];
		sc.nextLine();
		for(i=0;i<size;i++) {
			arr[i]=sc.next();
		}
		int flag=0;
		for(i=0;i<size;i++) {
			for(j=0;j<size;j++) {
				if(arr[i].compareTo(arr[j])==0 && i!=j) {
					++flag;
				}
			}
			if(flag==0) {
				System.out.print(arr[i]);
				break;
			}
			flag=0;
		}
		sc.close();
	}
}