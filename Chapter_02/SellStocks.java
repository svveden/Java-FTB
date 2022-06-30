//calculates stock info 

import java.util.Scanner;

public class SellStocks{
	public static void main(String[] args){
		System.out.println("This program calculates the net proceeds from a sale of a stock.");
		Scanner myObj = new Scanner(System.in);
		System.out.print("Enter stock price: ");
		double price = Double.parseDouble(myObj.nextLine());
		System.out.print("Enter number of shares: ");
		double shares = Double.parseDouble(myObj.nextLine());
		System.out.println("Value of shares: $" + price * shares);
		System.out.print("Enter commission rate (as a percentage): ");
		double commission = Double.parseDouble(myObj.nextLine());
		System.out.println("Comission: $" + ((price * shares) * commission));
		System.out.println("Net proceeds: $" + ((price * shares) - commission));
	}
}
