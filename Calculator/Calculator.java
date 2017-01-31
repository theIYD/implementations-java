
//Import libraries
import java.io.*;
import java.util.*;

/* 
	Author: Idrees Dargahwala

	Calculator is a terminal based Java project which operates on 
	the operands entered by the user and gives the user to choose an operation.
	The project is currently work in progress [WIP]. 

	*/

//Class starts
public class Calculator {

	//Global Variables
	public double OPERAND_1 = 0;
	public double OPERAND_2 = 0;
	public double TOTAL = 0;
	public double ENTER_NUMBER = 0;
	public static final String AGREE = "yes";
	public static final String DISAGREE = "no";
	public static boolean FLAG = false;

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
			System.out.print(" 1. Addition\n 2. Subtraction\n 3. Multiplication\n 4. Division\n 5. Square\n 6. Square Root\n 7. Log\n 8. Cube-root\n 9. Sine\n 10. Cosine\n 11. Tangent\n");

			System.out.println();
			System.out.println("Which operation you want to choose ?");

			int selectOperator = sc.nextInt();

			//Use switch-case.
			switch(selectOperator) {

				case 1: additionOperation();
						validEntry = true;
						break;

				case 2: subtractionOperation();
						validEntry = true;
						break;

				case 3: multiplicationOperation();
						validEntry = true;
						break;

				case 4: divisionOperation();
						validEntry = true;
						break;

				case 5: squareOperation();
						validEntry = true;
						break;

				case 6: squareRootOperation();
						validEntry = true;
						break;

				case 7: logOperation();
						validEntry = true;
						break;

				case 8: cuberootOperation();
						validEntry = true;
						break;	

				case 9: sineOperation();
						validEntry = true;
						break;	

				case 10: cosineOperation();
						validEntry = true;
						break;

				case 11: tangentOperation();
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

	public void acceptANumber() {
		System.out.print("Enter a number :- ");
		ENTER_NUMBER = sc.nextDouble();
	}

	//Addition Method
	public void additionOperation() {

		acceptOperands();
		TOTAL = OPERAND_1 + OPERAND_2;
		System.out.println("Total is: "+TOTAL);

		System.out.println();
		goBackToStart();
	}

	//It's called when the user wants to go back to menu
	public void goBackToStart() {

		System.out.println();
		do { 

			System.out.println("Want to go to menu ? (YES/NO)");
			String goBack = sc.next();

			//Check if the user enters (YES/NO)
		

			if(goBack!=null) {

				if(goBack.equalsIgnoreCase(AGREE)) {
						chooseOperations();
						System.out.println();
						FLAG = true;

				}
				else if(goBack.equalsIgnoreCase(DISAGREE)) {
						System.out.println();
						System.out.println("Thanks alot for using the calculator !");
						System.exit(0);
						FLAG = true;

				}else {
					System.out.println("Something's wrong !");
					System.out.println();
					FLAG = false;
				}

			}

		}while(FLAG==false);
	}

	//Subtraction Method
	public void subtractionOperation() {
		acceptOperands();

		//Check which operand is greater.
		if(OPERAND_1 < OPERAND_2) {
			TOTAL = OPERAND_2 - OPERAND_1;	
		}
		else {
			TOTAL = OPERAND_1 - OPERAND_2;
		}

		System.out.println("Total is :- "+TOTAL);
		goBackToStart();
	}

	//Multiplication Method
	public void multiplicationOperation() {
		acceptOperands();

		TOTAL = OPERAND_1 * OPERAND_2;
		System.out.println("Total is :"+TOTAL);
		goBackToStart();
	}

	//Division Method
	public void divisionOperation() {
		acceptOperands();

		TOTAL = OPERAND_1 / OPERAND_2;
		System.out.println("Total is: "+TOTAL);
		goBackToStart();
	}

	//Square Method
	public void squareOperation() {

		acceptANumber();

		TOTAL = ENTER_NUMBER * ENTER_NUMBER;
		System.out.println("Squared number is "+TOTAL);
		goBackToStart();
	}

	//Square-root method
	public void squareRootOperation() {
		acceptANumber();

		TOTAL = Math.sqrt(ENTER_NUMBER);
		System.out.println("Sqaure root of entered number is :- "+TOTAL);
		goBackToStart();
	}

	//Log method
	public void logOperation() {
		acceptANumber();

		TOTAL = Math.log(ENTER_NUMBER);
		System.out.println("Log of "+ENTER_NUMBER+ " is :- "+TOTAL);
		goBackToStart();
	}

	//Cube-root method
	public void cuberootOperation() {
		acceptANumber();

		TOTAL = Math.cbrt(ENTER_NUMBER);
		System.out.println("Cube Root of "+ENTER_NUMBER+ " is :- "+TOTAL);
		goBackToStart();
	}

	//Sine method
	public void sineOperation() {
		System.out.print("Enter angle in degrees :-");
		double acceptInDegrees = sc.nextDouble();

		double radians = Math.toRadians(acceptInDegrees);
		TOTAL = Math.sin(radians);

		System.out.println("Sine of "+acceptInDegrees+" is :- "+TOTAL);
	}

	//Cosine method
	public void cosineOperation() {
		System.out.print("Enter angle in degrees :-");
		double acceptInDegrees = sc.nextDouble();

		double radians = Math.toRadians(acceptInDegrees);
		TOTAL = Math.cos(radians);

		System.out.println("Cosine of "+acceptInDegrees+" is :- "+TOTAL);
	}

	//Tangent method
	public void tangentOperation() {
		System.out.print("Enter angle in degrees :-");
		double acceptInDegrees = sc.nextDouble();

		double radians = Math.toRadians(acceptInDegrees);

		if(radians==90) {
			System.out.println("Tangent of "+acceptInDegrees+" is not defined");
		}
		else{

			TOTAL = Math.tan(radians);
			System.out.println("Tangent of "+acceptInDegrees+" is :- "+TOTAL);
		}
		
	}
}//Class ends