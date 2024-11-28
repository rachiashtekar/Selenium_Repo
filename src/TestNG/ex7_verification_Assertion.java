package TestNG;
import org.testng.Assert;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class ex7_verification_Assertion {
	@Test
	public void m1_assertEquals() {
		
		String actResult = "xyz";
		String expResult ="abcd";
		
	Assert.assertEquals(actResult, expResult,"Failed : both results are diff");
		
	}

}
