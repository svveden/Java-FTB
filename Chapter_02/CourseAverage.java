// Computes course average.
import java.util.Scanner;

public class CourseAverage {
	public static void main(String[] args){
		double quiz_1, quiz_2, quiz_3, quiz_4, quiz_5;
		double program_1, program_2, program_3, program_4, program_5, program_6, program_7, program_8;
		double test_1, test_2, test_3;
		Scanner myObj = new Scanner(System.in);
		System.out.println("Welcome to the CSc 2310 average calculation program.");
		System.out.print("Enter Program 1 score: ");
		program_1 = Double.parseDouble(myObj.nextLine());
		System.out.print("Enter Program 2 score: ");
		program_2 = Double.parseDouble(myObj.nextLine());
		System.out.print("Enter Program 3 score: ");
		program_3 = Double.parseDouble(myObj.nextLine());
		System.out.print("Enter Program 4 score: ");
		program_4 = Double.parseDouble(myObj.nextLine());
		System.out.print("Enter Program 5 score: ");
		program_5 = Double.parseDouble(myObj.nextLine());
		System.out.print("Enter Program 6 score: ");
		program_6 = Double.parseDouble(myObj.nextLine());
		System.out.print("Enter Program 7 score: ");
		program_7 = Double.parseDouble(myObj.nextLine());
		System.out.print("Enter Program 8 score: ");
		program_8 = Double.parseDouble(myObj.nextLine());

		double program_average = (program_1 + program_2 + program_3 + program_4 + program_5 + program_6 + program_7 + program_8) / 8;

		System.out.println("");
		System.out.print("Enter Quiz 1 score: ");
		quiz_1 = Double.parseDouble(myObj.nextLine());
		System.out.print("Enter Quiz 2 score: ");
		quiz_2 = Double.parseDouble(myObj.nextLine());
		System.out.print("Enter Quiz 3 score: ");
		quiz_3 = Double.parseDouble(myObj.nextLine());
		System.out.print("Enter Quiz 4 score: ");
		quiz_4 = Double.parseDouble(myObj.nextLine());
		System.out.print("Enter Quiz 5 score: ");
		quiz_5 = Double.parseDouble(myObj.nextLine());

		double quiz_average = (quiz_1 + quiz_2 + quiz_3 + quiz_4 + quiz_5) / 5;

		System.out.println("");
		System.out.print("Enter Test 1 score: ");
		test_1 = Double.parseDouble(myObj.nextLine());
		System.out.print("Enter Test 2 score: ");
		test_2 = Double.parseDouble(myObj.nextLine());
		System.out.print("Enter Final score: ");
		test_3 = Double.parseDouble(myObj.nextLine());

		System.out.println("Course average: " + (.30 * program_average * 5 + .10 * quiz_average * 10 + .15 * test_1 + .15 * test_2 + .30 * test_3));


	}
}
