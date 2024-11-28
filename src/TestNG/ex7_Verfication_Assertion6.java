package TestNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ex7_Verfication_Assertion6 {
	@Test
	public void m1_softAssert() {
		SoftAssert Soft = new SoftAssert();
		System.out.println("checck");
		boolean actResult = true;
		Soft.assertTrue(actResult,"Failed:act result false");
		
		
		String actResult1 = "xyz";
		String expResult1 ="xyz";
		//Soft.assertEquals(actResult1, expResult1,"failed2:both result are diff");
		Soft.assertEquals(actResult1, expResult1,"Pass");

		Soft.assertAll();
		System.out.println("point");
		
		
		
	}

}
//"soft assert" only records the failure and continues executing the test