import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;

import java.util.concurrent.TimeUnit;


public class Left_menu {
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

		driver.findElement(By.xpath("//*[@id=\"tab-AdminDashboard\"]/a/span")).click();
		String dash = driver.getTitle();
		System.out.println(dash);
		driver.navigate().refresh();
		Assert.assertEquals(dash, driver.getTitle());
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//*[@id=\"subtab-AdminParentOrders\"]/a/span")).click();
		String order = driver.getTitle();
		System.out.println(order);
		driver.navigate().refresh();
		Assert.assertEquals(order, driver.getTitle());
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//*[@id=\"subtab-AdminCatalog\"]/a/span")).click();
		String  catalog = driver.getTitle();
		System.out.println(catalog);
		driver.navigate().refresh();
		Assert.assertEquals(catalog, driver.getTitle());
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);

		driver.findElement(By.xpath(".//li[@data-submenu=\"23\"]")).click();
		String support = driver.getTitle();
		System.out.println(support);
		driver.navigate().refresh();
		Assert.assertEquals(support, driver.getTitle());
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//*[@id=\"subtab-AdminParentCustomerThreads\"]/a/span")).click();
		String customer = driver.getTitle();
		System.out.println(customer);
		driver.navigate().refresh();
		Assert.assertEquals(customer, driver.getTitle());
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//*[@id=\"subtab-AdminStats\"]/a/span")).click();
		String stat = driver.getTitle();
		System.out.println(stat);
		driver.navigate().refresh();
		Assert.assertEquals(stat, driver.getTitle());
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//*[@id=\"subtab-AdminParentModulesSf\"]/a/span")).click();
		String modul = driver.getTitle();
		System.out.println(modul);
		driver.navigate().refresh();
		Assert.assertEquals(modul, driver.getTitle());
		driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
		driver.navigate().refresh();

		driver.findElement(By.xpath("/html/body/nav/ul/li[11]/a/span")).click();
		String car = driver.getTitle();
		System.out.println(car);
		driver.navigate().refresh();
		Assert.assertEquals(car, driver.getTitle());
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//*[@id=\"subtab-AdminParentPayment\"]/a")).click();
		String pay = driver.getTitle();
		System.out.println(pay);
		driver.navigate().refresh();
		Assert.assertEquals(pay, driver.getTitle());
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//*[@id=\"subtab-AdminInternational\"]/a/span")).click();
		String local = driver.getTitle();
		System.out.println(local);
		driver.navigate().refresh();
		Assert.assertEquals(local, driver.getTitle());
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//*[@id=\"subtab-ShopParameters\"]/a/span")).click();
		String shop = driver.getTitle();
		System.out.println(shop);
		driver.navigate().refresh();
		Assert.assertEquals(shop, driver.getTitle());
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//*[@id=\"subtab-AdminAdvancedParameters\"]/a/span")).click();
		String info = driver.getTitle();
		System.out.println(info);
		driver.navigate().refresh();
		Assert.assertEquals(info, driver.getTitle());
		driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//*[@id=\"subtab-AdminParentThemes\"]/a/span")).click();
		String design = driver.getTitle();
		System.out.println(design);
		driver.navigate().refresh();
		Assert.assertEquals(design, driver.getTitle());
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
	}

}
