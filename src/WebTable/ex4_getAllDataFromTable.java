package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex4_getAllDataFromTable {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Welcome/Desktop/web_table.html");
		for(int i=1;i<=3;i++)  //outer for loop->Rows
		{
			for(int j=1;j<=3;j++)//inner for loop->cols
			{
				if(i==1)
				{
					String text = driver.findElement(By.xpath("//table[@id='1234']//tr["+i+"]/th["+j+"]")).getText();
					System.out.print(text+" ");
				}
				else
				{
					String text = driver.findElement(By.xpath("//table[@id='1234']//tr["+i+"]/td["+j+"]")).getText();
					System.out.print(text+" ");
				}
			}
			System.out.println();
		}
	}

}
