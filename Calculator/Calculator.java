
import java.io.*;
import java.util.*;

//Class starts
public class Calculator {

	public double OPERAND_1 = 0;
	public double OPERAND_2 = 0;

	//We use Scanner class
	Scanner sc = new Scanner(System.in);

	//Main method
	public static void main(String[] args) {

		Calculator calc = new Calculator();
		calc.acceptName();
		calc.chooseOperations();
	}

	//Accept user's name
	public void acceptName() {

		String username;

		System.out.print("Please enter your name : ");
		username = sc.nextLine();

		System.out.println();
		System.out.println("\t\t\t Welcome "+username+"\t\t\t");
		System.out.println();
	}

	//Accept the entry and go to the appropriate methods
	public void chooseOperations() {

		boolean validEntry = false;

		do{
			System.out.print(" 1. Addition\n 2.Subtraction\n 3. Multiplication\n 4.Division\n");
			System.out.println();
			System.out.println("Which operation you want to choose ?");

			int selectOperator = sc.nextInt();

			switch(selectOperator) {

				case 1: additionOperation();
						validEntry = true;
						break;

				case 2: //subtractionOperation();
						validEntry = true;
						break;

				case 3: //multiplicationOperation();
						validEntry = true;
						break;

				case 4: //divisionOperation();
						validEntry = true;
						break;

				default: System.out.println("Try again !");
						 validEntry = false;
						 break;
			}
		}while(validEntry==false);


	}

	//Accept the 2 operands
	public void acceptOperands() {

		System.out.print("Enter 1st operand : ");
		OPERAND_1 = sc.nextDouble();

		System.out.print("Enter 2nd operand : ");
		OPERAND_2 = sc.nextDouble();
	}

	//Addition Method
	public void additionOperation() {

		acceptOperands();
		double total = OPERAND_1 + OPERAND_2;
		System.out.println("Total is: "+total);
	}

}