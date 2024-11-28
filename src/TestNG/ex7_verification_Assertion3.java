package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ex7_verification_Assertion3 {
	@Test
public void m3_assertTrue() {
	boolean actResult = false;
	Assert.assertTrue(actResult,"Failed : act result is false");
	System.out.println("hii");
}
}
