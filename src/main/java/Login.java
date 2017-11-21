import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	private static WebDriver driver;

	static {
		System.setProperty("webdriver.chrome.driver", "/Users/tester/Downloads/chromedriver_3");
		driver = new ChromeDriver();
	}
	public static void main(String[] arg) throws InterruptedException {
		driver.get("http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/");
		driver.findElement(By.id("email")).sendKeys("webinar.test@gmail.com");
		driver.findElement(By.id("passwd")).sendKeys("Xcg7299bnSmMuRLp9ITw");
		driver.findElement(By.name("submitLogin")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"employee_infos\"]/a/span")).click();
		driver.findElement(By.id("header_logout")).click();
		}
}