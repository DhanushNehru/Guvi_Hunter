import java.util.Scanner;
public class WorkingDay {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String day=in.nextLine(); 
		if((day.equalsIgnoreCase("Mon"))||(day.equalsIgnoreCase("Tue"))||(day.equalsIgnoreCase("Wed"))||(day.equalsIgnoreCase("Thu"))||(day.equalsIgnoreCase("Fri"))||(day.equalsIgnoreCase("Sat"))){
			System.out.println(day+"=true");
		}
		else if(day.equalsIgnoreCase("Sun")){
			System.out.println(day+"=false");
		}
		else{
			System.out.println("Invalid day");
		}
		in.close();
	}
}