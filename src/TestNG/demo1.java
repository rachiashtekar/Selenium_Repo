package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;
@Test
public class demo1 {
	
	public void TC1() {
		Reporter.log("running Tc1--",true);
	}
	
	public void TC2() {
		Reporter.log("running Tc2--",true);
	}
	
	public void TC3() {
		Reporter.log("running Tc3--",true);
	}
	
	public void TC4() {
		Reporter.log("running Tc4--",true);
	}

}
