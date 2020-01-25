package simpleCalc;

//Importing Scanner
import java.util.Scanner;

class calculator{
	// Calculator class to do simple calculations on two numbers
	
	// declaring our variables
	private double num1;
	private double num2;
	private double result;
	
	// declaring actions array
	private static final String[] actions=new String[]{
		"1-Addition", "2-Difference", "3-Multiply", "4-Division", "5-Average"
	};
	
	// creating a Scanner object
	Scanner s=new Scanner(System.in);
	
	private void readTwoNums() {
		// This method reads two numbers from the user
		
		// reading two numbers then giving them to our variables
		num1=s.nextDouble();
		num2=s.nextDouble();
	}
	
	private void actions() {
		// This method print actions to the user
		
		// The for loop print every element in actions[] array
		for(short i = 0;i<actions.length;i++) {
			System.out.println(actions[i]);
		}
	}
	
	public void sendMsg() {
		// This method sends messages to the user and calls appropriate methods to perform appropriate action
		
		// Sending a message to the user to enter 2 numbers
		String msgEnter= "Enter two numbers :";
		System.out.println(msgEnter);
		
		// Calling readTwoNums() method to read the numbers
		readTwoNums();
		
		// Sending a message to the user to choose an action
		String msgAction= "Choose the number of the action to do:";
		System.out.println(msgAction);
		
		// Calling actions() method to print available actions to the user
		actions();
		
		// Calling actionChooser() method
		actionChooser();
	}
	
	private void actionChooser() {
		// This method read the choice of the user and call appropriate method according to it
		
		// Reading user choice
		int action =s.nextInt();
		
		// Switch statement to switch between available actions till choosing appropriate method to call
		switch (action)
		{
		case 1:
			add();
			break;
		case 2:
			dif();
			break;
		case 3:
			mul();
			break;
		case 4:
			div();
			break;
		case 5:
			avg();
			break;
		default:
			
			// Printing an error message if the use entered an unexpected value
			String vn="please enter a valide action number";
			System.out.println(vn);
			
			actionChooser();
		}
		
	}
	
	private void add() {
		// This method add the two numbers
		
		result=num1+num2;
	}
	
	private void dif() {
		// This method calculate the difference between the two numbers
		
		result=num1-num2;
	}
	
	private void mul() {
		// This method multiply the two numbers
		
		result=num1*num2;
	}
	
	private void div() {
		// This method do a division
		
		//Checking that the second numbers doesn't equal zero
		if(num2 != 0) {
			result=num1/num2;
		}else {
			String vn="Can't divide by zero, please choose two valid numbers:";
			System.out.println(vn);
			readTwoNums();
			div();
		}
	}
	
	public void avg() {
		// This method calculates the average
		
		add();
		result= result/2;
	}
	
	public void printResult() {
		//This method prints the result
		
		String resTxt= "The result is : ";
		System.out.println(resTxt + result);
	}
	
	public void error() {
		//This method handles errors if happened
		
		//Printing error message to the user
		String error="Please enter appropriate value...";
		System.out.println(error);
		
	}
	
}
