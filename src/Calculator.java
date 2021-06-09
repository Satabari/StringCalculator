
public class Calculator {

	public int calString(String inputString) {
		// TODO Auto-generated method stub
		if(isEmpty(inputString))
		{
			return 0;
		}
		return stringToInteger(inputString);
	}
	
	private boolean isEmpty(String inputString) {
		return inputString.isEmpty();
	}
	
	
	private int stringToInteger(String inputString) {
		return Integer.parseInt(inputString);
	}
}
