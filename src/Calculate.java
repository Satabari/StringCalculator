import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

@Test
public class Calculate {
	
	//constructor
	private Calculator cal;
	
	@BeforeTest
	public void init() {
		cal = new Calculator();
	}
	
	//testing for no input
	public void emptyString() throws Exception
	{
		//Calculator cal = new Calculator();
		assertEquals(cal.calString(""),0);
	}
	
	//testing for single number input
	public void singleNumber() throws Exception
	{
		assertEquals(cal.calString("1"),1);
	}
	
	//testing for two numbers input separated by commas
	public void twoNumbers() throws Exception{
		assertEquals(cal.calString("1,2"),3);
	}
	
	//testing for two numbers input separated by new line
	public void twoNumbersDelimitedByNewLine() throws Exception{
		assertEquals(cal.calString("1\n2"),3);
	}
	
	//testing for three no.s input
	public void threeNumbers() throws Exception{
		assertEquals(cal.calString("1\n2,3"),6);
	}
	
	//testing for negative number exception
	@Test(expectedExceptions = Exception.class)
	public void negativeInput() throws Exception{
		cal.calString("-1");
	}
	
	//testing for bigger than 1000 as input
	public void ignoreBiggerNumbers() throws Exception{
		assertEquals(cal.calString("20,950,1010"),970);
	}
	
	//testing for input where "//" will be ignored as delimiter
	public void multipleDelimiter() throws Exception{
		assertEquals(cal.calString("//;\\n1;2"),3);
	}
}
