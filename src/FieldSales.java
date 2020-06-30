import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FieldSales {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Testing Projects\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=in");  // Currrent URL of Browser.
		//driver.findElement(By.id("email")).sendKeys("m@gmail.com");
		driver.findElement(By.id("username")).sendKeys("ma@gmail.com");
		driver.findElement(By.name("pw")).sendKeys("1234");
		driver.findElement(By.xpath("//*[@id=\'Login\']")).click();
		
	}

}
