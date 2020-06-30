import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fieldfacebook1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Testing Projects\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");  // Currrent URL of Browser.
		driver.findElement(By.id("email")).sendKeys("mayur.t@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("M@123");
		driver.findElement(By.linkText("Forgotten account?")).click();
	}

}
