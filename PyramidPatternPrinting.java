import java.util.Scanner;
public class PyramidPatternPrinting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int level=sc.nextInt();
		int i,j,k,l;
		int n=0;
		for(i=0;i<level;i++){
			for(j=level;j>=i;j--){
				System.out.print(" ");
			}
			for(k=0;k<=i;k++){
				System.out.print("*");
				
			}
			for(l=1;l<=i;l++){
				System.out.print("*");
				
			}
			System.out.println("");
		}
	}

}
/*
6
        *
      ***
     *****
    *******
   *********
  ***********
*/