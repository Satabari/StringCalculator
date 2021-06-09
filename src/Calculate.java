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
	
	public void emptyString()
	{
		//Calculator cal = new Calculator();
		assertEquals(cal.calString(""),0);
	}
	public void singleNumber()
	{
		assertEquals(cal.calString("1"),1);
	}
	
	public void twoNumbers() {
		assertEquals(cal.calString("1,2"),3);
	}
	
	public void twoNumbersDelimitedByNewLine() {
		assertEquals(cal.calString("1\n2"),3);
	}
}
