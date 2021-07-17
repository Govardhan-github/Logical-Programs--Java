//Importing The Java Util Scanner Package
import java.util.Scanner;
public class ReverseNumberPgm {
	/*
	 * Ask User To Enter a Number
	 * And Write Condition To Print Reverse Number
	 */
	public static void main(String[] args) {
		int num,remainder,reverse=0;
		//Welcome message added
		System.out.println("Welcome to the reverse Number Program");
		//Ask user to enter a number
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		num = sc.nextInt();
		//While condition for to print the reverse number
		while(num!=0) {	
			remainder = num % 10;
			reverse = reverse * 10 + remainder;
			num = num / 10 ;
		}
		System.out.println("The Reverse number is :" +reverse);
	}
}