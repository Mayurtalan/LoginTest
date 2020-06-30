import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Salesforce {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Testing Projects\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rediff.com/");
		driver.findElement(By.cssSelector("a[class='signin']")).click();

		driver.findElement(By.cssSelector("input[name='login']")).sendKeys("may@gmail.com");
		driver.findElement(By.cssSelector("input[name='passwd']")).sendKeys("m12345");
		driver.findElement(By.cssSelector("input[class='signinbtn']")).click();
		
		
		
		
	}

}
