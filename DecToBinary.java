//WAJP TO CONVERT decimal to binary.
import java.util.Scanner;
public class DecToBinary {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		String s="";
		do
		{
		int r=n%2;
		s=s+r;
		n=n/2;
		}while(n!=0);
		System.out.println("Binary number is "+s);
	}
}
