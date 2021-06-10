
public class Calculator {

	private final String regEx = "[^0-9]+";
	
	public int calString(String inputString) throws Exception{
		
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
	
	private int sumInt(String[] numbers) throws Exception{		
		negNumInput(numbers);		
		return sumIntLessThan1000(numbers);
	}
	
	private int sumIntLessThan1000(String[] numbers) {
		int sum = 0;
		for(String loop:numbers){
			if(stringToInteger(loop) > 1000) {
				continue;
			}				
			sum += stringToInteger(loop);
		}
		return sum;
	}
	
	private void negNumInput(String[] numbers) throws Exception{
		for(String loop:numbers){
			if(stringToInteger(loop) < 0) {
				throw new Exception("Negative number input!");
			}
		}
	}
	
	private boolean isEmpty(String inputString) {
		return inputString.isEmpty();
	}	
	
	private int stringToInteger(String inputString) {
		return Integer.parseInt(inputString);
	}
}
