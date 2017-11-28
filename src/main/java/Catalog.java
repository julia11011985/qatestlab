import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Catalog {
	private static WebDriver driver;

	static {
		System.setProperty("webdriver.chrome.driver", "/Users/tester/Downloads/chromedriver_3");
		driver = new ChromeDriver();
		EventFiringWebDriver eventFiringWebDriver = new EventFiringWebDriver(driver);
		WebDriverEventListener eventListener = new EventHandler();
		eventFiringWebDriver.register(eventListener);
	}

	public static void main(String[] arg) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/");
		driver.findElement(By.id("email")).sendKeys("webinar.test@gmail.com");
		driver.findElement(By.id("passwd")).sendKeys("Xcg7299bnSmMuRLp9ITw");
		driver.findElement(By.name("submitLogin")).click();
		WebElement catalog = driver.findElement(By.xpath("//*[@id=\"subtab-AdminCatalog\"]/a"));

		WebDriverWait webDriverWait = new WebDriverWait(driver, 10);
		webDriverWait.until(ExpectedConditions.elementToBeClickable(catalog));

		Actions actions = new Actions(driver);
		actions.moveToElement(catalog).build().perform();

		new WebDriverWait(driver, 10).until(e ->
				driver.findElement(By.id("subtab-AdminCategories")).isDisplayed()
		);

		driver.findElement(By.id("subtab-AdminCategories")).click();
		driver.findElement(By.xpath("//*[@id=\"page-header-desc-category-new_category\"]/i")).click();
		String name = "Julia";
		driver.findElement(By.id("name_1")).sendKeys(name);
		driver.findElement(By.xpath("//*[@id=\"category_form_submit_btn\"]/i")).click();
		String message = driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div")).getText();
		Assert.assertTrue(message.contains("Создано"));
		driver.findElement(By.xpath("//*[@id=\"table-category\"]/thead/tr[1]/th[3]/span/a[2]/i")).click();
		WebElement table = driver.findElement(By.id("table-category"));
		WebDriverWait webDriverWait1 = new WebDriverWait(driver, 10);
		boolean isNameDisplayed = table.findElement(By.xpath(String.format("//tr//td[3][contains(text(),'%s')]", name))).isDisplayed();
		webDriverWait1.until(e -> isNameDisplayed);
		Assert.assertTrue(isNameDisplayed);
	}
}
