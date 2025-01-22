package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a year ");
		int year = in.nextInt();
	
		boolean leapyear = year%4==0 && year%100!=0 || year%400==0;
		System.out.print(year + " is a learp year: " + leapyear);
	}

}
