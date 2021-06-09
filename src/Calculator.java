
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
			return sumInt(numbers);
		}
		
	}
	
	private int sumInt(String[] numbers) {
		int sum = 0;
		for(String loop:numbers){
			sum += stringToInteger(loop);
		}
		return sum;
	}
	
	private boolean isEmpty(String inputString) {
		return inputString.isEmpty();
	}	
	
	private int stringToInteger(String inputString) {
		return Integer.parseInt(inputString);
	}
}
