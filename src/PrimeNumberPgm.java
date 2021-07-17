//Importing The Java Util Scanner Package
import java.util.Scanner;
public class PrimeNumberPgm {
		/*
		 *Ask User To Enter a Number
		 *And Write Condition To Check The Number Is Prime Or Not
		 *Print The Result 
		 */
	public static void main(String[] args) {
		int i,m=0,n,g=0;       
		//Welcome to the prime number checking program
		System.out.println("Welcome to the prime number checking program");
		//Ask user to enter the number for checking
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number  : ");
		n=sc.nextInt();
		//Condition for checking prime number
		m=n/2;      
		if(n==0||n==1){  
		System.out.println(n+" is not a prime number");      
	  				}
		else {  
			for(i=2;i<=m;i++) {      
			   if(n%i==0) {      
				   System.out.println(n+" is not a prime number");      
				   g=1;      
			   break;      
				}      
		   		}      
		if(g==0)  { System.out.println(n+" is a prime number"); }  
		  } 
	}    
}
