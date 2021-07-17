//Importing The Java Util Scanner Package
import java.util.Scanner;
public class PerfectNumberPgm {
	/*
	 * Ask user To Enter a Number 
	 * And Check It Is a Perfect Number Or Not
	 */
	public static void main(String[] args) {
		{  
			int n, sum=0;  
			System.out.println("Welcome to the perfect number checking program ");  
			//Ask user to enter the number
			Scanner sc=new Scanner(System.in);         
			System.out.println("Enter the number: ");  
			n=sc.nextInt();  
			int i=1;  
			//While loop to checking perfect number 
			while(i <= n/2)  
			{  
			if(n % i == 0)  
			{  
			//calculates the sum of factors  
			sum = sum + i;  
			}
			i++;  
			}   
			if(sum==n)  
			{  
			//print if sum and n are equal  
			System.out.println(n+" is a perfect number.");  
			} 
			else  
			//print if sum and n are not equal  
			System.out.println(n+" is not a perfect number.");   
		}
	}  
} 
