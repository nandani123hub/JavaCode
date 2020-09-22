//WAJP to convert decimal to hexadecimal.
import java.util.Scanner;
public class DecToHex {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value");
		int n=sc.nextInt();
		String st="";
		do
		{
			int r=n%16;
			st=r+st;
			n=n/16;
		}
		while(n!=0);
		System.out.println("Hexadecimal number is: "+st);
	}
}
