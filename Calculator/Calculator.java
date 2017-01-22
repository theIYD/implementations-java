
import java.io.*;
import java.util.*;

//Class starts
public class Calculator {

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

				case 1: //additionOperation();
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

}