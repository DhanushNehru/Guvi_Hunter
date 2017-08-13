package Hunter;
import java.util.Scanner;
public class AnalyseAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str="my brother is taller than me@1233334. I always a short man, but smart than him.";
		String strArr[]=str.split(" ");
		int i;
		int temp=0;
		String longStr="";
		String removeSpaces="";
		int charE=0;
		int intCount=0;
		int doubleVal=0;
		for(i=0;i<strArr.length;i++) {
			removeSpaces=removeSpaces+strArr[i];
			if(strArr[i].length()>temp){
				temp=strArr[i].length();
				longStr=strArr[i];
			}
			try {
				Double d=Double.parseDouble(strArr[i]);
				if(d.doubleValue()!=-1) {
					++doubleVal;
				}
			}
			catch(Exception e) {
				
			}
		}
		int strSentence=0;
		for(i=0;i<removeSpaces.length();i++) {
			if(str.charAt(i)=='.') {
				++strSentence;
			}
			if(str.charAt(i)>='0'&& str.charAt(i)<='9') {
				++intCount;
			}
			if(str.charAt(i)=='e') {
				++charE;
			}
		}
		sc.close();
		System.out.println("1) Word after removing spaces");
		System.out.println(removeSpaces);
		System.out.println("2) Longest word in the string");
		System.out.println(longStr);
		System.out.println("3) Number of letters \'e\' in the string");
		System.out.println(charE);
		System.out.println("4) Number of Integers in the string");
		System.out.println(intCount);
		System.out.println("5) Number of doubles in the string");
		System.out.println(doubleVal);
		System.out.println("6) Number of words in the string");
		System.out.println(strArr.length);
		System.out.println("7) Number of sentences in the string");
		System.out.println(strSentence);
	}
}
