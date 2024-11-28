package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex3_getSpecificData {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Welcome/Desktop/web_table.html");
		
	String Text=driver.findElement(By.xpath("//table[@id='1234']//tr[2]//td[2]")).getText();
	System.out.println(Text);
	}

}
