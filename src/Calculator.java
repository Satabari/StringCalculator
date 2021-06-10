
public class Calculator {

	//regular expression to check
	private final String regEx = ",|\n";
	
	//Addition of String method
	public int calString(String inputString) throws Exception{
		
		//Splitting the String for regular expression
		String[] numbers = inputString.split(regEx);
		
		//for empty string input
		if(isEmpty(inputString))
		{
			return 0;
		}
		
		//for single number input
		else if(inputString.length() == 1){
			return stringToInteger(inputString);
		}
		
		//for non single number inputs
		else {
			return sumInt(numbers);
		}
		
	}
	
	//for checking negative number input
	private int sumInt(String[] numbers) throws Exception{		
		negNumInput(numbers);		
		return sumIntLessThan1000(numbers);
	}
	
	//adding the numbers in String inputs
	private int sumIntLessThan1000(String[] numbers) {
		int sum = 0;
		for(String loop:numbers){
			//for checking inputs greater than 1000
			if(stringToInteger(loop) > 1000) {
				continue;
			}				
			sum += stringToInteger(loop);
		}
		return sum;
	}
	
	//creating exception for negative number inputs
	private void negNumInput(String[] numbers) throws Exception{
		for(String loop:numbers){
			if(stringToInteger(loop) < 0) {
				throw new Exception("Negative number input!");
			}
		}
	}
	
	//checking for empty string
	private boolean isEmpty(String inputString) {
		return inputString.isEmpty();
	}	
	
	//parsing the numbers from String to Integers
	private int stringToInteger(String inputString) {
		return Integer.parseInt(inputString);
	}
}
