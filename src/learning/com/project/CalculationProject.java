package learning.com.project;

import java.util.Scanner;

public class CalculationProject {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int value1 = scan.nextInt();
		int value2 = scan.nextInt();
		sum(value1,value2);
		scan.close();
	}
	
	public static void sum(int a, int b) {
		int sum = a+b;
		System.out.println("Sum of " +a  +" &  " +b +" is: " +sum);
	}
	
	public static void multiply(int a, int b) {
		int mul = a*b;
		System.out.println("Multiply of " +a  +" &  " +b +" is: " +mul);
	}

	public static void newCode() {
		//G can you please add the code here
	}
}


