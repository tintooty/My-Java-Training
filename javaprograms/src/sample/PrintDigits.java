package sample;

import java.util.Scanner;

public class PrintDigits {
	
	public void printNumbers(int limit)
	{
		int i=1;
		while(i<=limit)
		{
			System.out.println(i);
			i++;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		PrintDigits obj = new PrintDigits();
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the limit");
		number = scr.nextInt();
		obj.printNumbers(number);
		System.out.println("End");

	}

}
