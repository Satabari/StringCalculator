
public class Calculator {

	private final String regEx = ",|\n";
	
	public int calString(String inputString) {
		String[] numbers = inputString.split(regEx);
		
		
		if(isEmpty(inputString))
		{
			return 0;
		}
		else if(inputString.length() == 1){
			return stringToInteger(inputString);
		}
		else {
			return sumInt(numbers[0],numbers[1]);
		}
		
	}
	
	private int sumInt(String num1, String num2) {
		return Integer.parseInt(num1) + Integer.parseInt(num2);
	}
	
	private boolean isEmpty(String inputString) {
		return inputString.isEmpty();
	}	
	
	private int stringToInteger(String inputString) {
		return Integer.parseInt(inputString);
	}
}
