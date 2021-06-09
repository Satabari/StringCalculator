import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

@Test
public class Calculate {
	
	private Calculator cal;
	
	@BeforeTest
	public void init() {
		cal = new Calculator();
	}
	
	public void emptyString() throws Exception
	{
		//Calculator cal = new Calculator();
		assertEquals(cal.calString(""),0);
	}
	public void singleNumber() throws Exception
	{
		assertEquals(cal.calString("1"),1);
	}
	
	public void twoNumbers() throws Exception{
		assertEquals(cal.calString("1,2"),3);
	}
	
	public void twoNumbersDelimitedByNewLine() throws Exception{
		assertEquals(cal.calString("1\n2"),3);
	}
	
	public void threeNumbers() throws Exception{
		assertEquals(cal.calString("1\n2,3"),6);
	}
	
	@Test(expectedExceptions = Exception.class)
	public void negativeInput() throws Exception{
		cal.calString("-1");
	}
	
	public void ignoreBiggerNumbers() throws Exception{
		assertEquals(cal.calString("20,950,1010"),970);
	}
}
