
public class Calculator {

	public int calString(String inputString) {
		String[] numbers = inputString.split(",");
		
		
		if(isEmpty(inputString))
		{
			return 0;
		}
		else if(inputString.length() == 1){
			return stringToInteger(inputString);
		}
		else {
			return Integer.parseInt(numbers[0]) + Integer.parseInt(numbers[1]);
		}
		
	}
	
	private boolean isEmpty(String inputString) {
		return inputString.isEmpty();
	}
	
	
	private int stringToInteger(String inputString) {
		return Integer.parseInt(inputString);
	}
}
