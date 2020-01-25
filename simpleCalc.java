package simpleCalc;

public class simpleCalc {

	public static void main(String[] args) {
		// The main method
		
		// crating a calculator object so we can perform an action
		calculator c=new calculator();
		
		// Checking that no error happens
		try {
			
			// sending message to the user and performing action depending on his response by calling sendMsg() method in the calculator class
			c.sendMsg();
			
			//printing results by calling printResult() method in the calculator class
			c.printResult();	
			
		} catch(Exception e) {
			// Handling the error
			
			// Sending an error message to the user by calling error() method in the calculator class
			c.error();
			
			// Calling main method again
			main(null);
			
		}
	}

}
