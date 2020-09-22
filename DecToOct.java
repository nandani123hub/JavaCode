//WAJP to print the decimal to octal.
import java.util.Scanner;
public class DecToOct {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value");
		int n=sc.nextInt();
		String st="";
		do
		{
			int r=n%8;
			st=r+st;
			n=n/8;
		}
		while(n!=0);
		System.out.println("Octal number is: "+st);
	}
}
