//Importing The Java Util Scanner Package
import java.util.Scanner;
public class FibnacciSeriesPgm {
	/*
	 * Ask User To Enter Number To Print Fibnacci Series 
	 */
	public static void main(String[] args) {
		int n1=0,n2=1,f,i,n3;	
		System.out.println("Welcome to the fibnacci series program");
		//Enter the how many numbers to print numbers inseries
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number print fibnacci series : ");
		f=sc.nextInt();
		System.out.print(n1+" "+n2);
		//for loop for to evaluating fibnacci series
		for (i=2;i<f;++i) {
		 n3=n2+n1;
		 System.out.print(" "+n3);
		 n1=n2;
		 n2=n3;
		 }
	}
}
