import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

@Test
public class Calculate {
	public void emptyString()
	{
		Calculator cal = new Calculator();
		assertEquals(cal.calString(""),0);
	}
}
