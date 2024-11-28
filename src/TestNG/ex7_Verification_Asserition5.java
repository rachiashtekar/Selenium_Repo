package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ex7_Verification_Asserition5 {
	
	@Test
	public void limitationOfAssertClass() {
		boolean actResult=true;
		Assert.assertTrue(actResult,"Failed :act Result false");
		
		String actResult1="xyz";
		String expResult1 = "abcd";
		Assert.assertEquals(actResult1, expResult1,"Failed2:both results are diff");
		
	}

}
