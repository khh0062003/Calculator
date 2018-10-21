package se.kh_codepool.calculator;

import java.util.Scanner;

import java.lang.Exception;

import se.kh_codepool.processing.functionalInterfaces;

public class calculatorApp {

	private static Scanner scan = new Scanner(System.in);
	private static Scanner scan1 = new Scanner(System.in);
	static Double inputNum1, inputNum2, num1, num2;
	static String result, option;

	public static void main(String[] args) {

		functionalInterfaces FuncInterface = new functionalInterfaces();

		boolean keepRunning = true;
		boolean startOver = true;

		// while (startOver) {

		// System.out.println("Please, select the calculation operation you would like
		// performed from the menu below\n");
		//
		// System.out.println("Operations available:");
		// System.out.println("1 Addition");
		// System.out.println("2 Subtraction");
		// System.out.println("3 Multiplication");
		// System.out.println("4 Division");

		while (startOver) {
			
			while (keepRunning == true) {

			//do {

				System.out.println(
						"Please, select the calculation operation you would like performed from the menu below\n");

				System.out.println("Operations available:");
				System.out.println("1 Addition");
				System.out.println("2 Subtraction");
				System.out.println("3 Multiplication");
				System.out.println("4 Division");

				String operation = scan1.nextLine();

				switch (operation) {

				case "1":
					 try {

					System.out.println("Please enter any two numbers");

					System.out.println(
							FuncInterface.calc(FuncInterface.userInput(scan.nextDouble(), (inputNum) -> inputNum),
									FuncInterface.userInput(scan.nextDouble(), (inputNum1) -> inputNum1),
									(num1, num2) -> "Outcome: " + (num1 + num2) + "\n"));

					keepRunning = false;
					break;

				 } catch (RuntimeException e) {
				 e.printStackTrace();
				 }

				case "2":
					System.out.println("Please enter any two numbers");
					System.out.println(
							FuncInterface.calc(FuncInterface.userInput(scan.nextDouble(), (inputNum) -> inputNum),
									FuncInterface.userInput(scan.nextDouble(), (inputNum1) -> inputNum1),
									(num1, num2) -> "Outcome: " + (num1 - num2) + "\n"));
					keepRunning = false;
					break;

				case "3":
					System.out.println("Please enter any two numbers");
					System.out.println(
							FuncInterface.calc(FuncInterface.userInput(scan.nextDouble(), (inputNum) -> inputNum),
									FuncInterface.userInput(scan.nextDouble(), (inputNum1) -> inputNum1),
									(num1, num2) -> "Outcome: " + (num1 * num2) + "\n"));
					keepRunning = false;
					break;

				case "4":
					System.out.println("Please enter any two numbers");
					System.out.println(
							FuncInterface.calc(FuncInterface.userInput(scan.nextDouble(), (inputNum) -> inputNum),
									FuncInterface.userInput(scan.nextDouble(), (inputNum1) -> inputNum1),
									(num1, num2) -> "Outcome: " + (num1 / num2) + "\n"));
					keepRunning = false;
					break;

				default:
					System.out.println("Invalid entry. Please try again\n");
					keepRunning = true;
					break;
				}
				

			//} while (keepRunning == true);
		}

			System.out.println("Would you like to do another operation.");
			System.out.println("Please type y/n");

			option = scan1.nextLine();

			if (option.equalsIgnoreCase("n")) {
				startOver = false;
				System.out.println("Bye");
			}else keepRunning = true;
		}
	}

}
