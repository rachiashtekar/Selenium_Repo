package selenium_project;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo1 {
	public static void main(String[] args) {
		WebDriver open = new ChromeDriver();
		open.get("https://www.instagram.com");
	}
}