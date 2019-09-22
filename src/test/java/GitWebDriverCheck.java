import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class GitWebDriverCheck {

	public static WebDriver driver;

	@BeforeSuite
	public void setUp() {
		
		System.setProperty("webdriver.gecko.driver", "E:\\SeleniumPreReq\\geckodriver-v0.24.0-win64\\geckodriver.exe");

		driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	@Test
	public void login() throws InterruptedException {
		
		driver.get("http://gmail.com");
		driver.findElement(By.id("identifierId")).sendKeys("jagan.ccs");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/span/span")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div[1]/div/div/div/div/div[1]/div/div[1]/input")).sendKeys("asdasdasd");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/span/span")).click();
		
	}
	
	@AfterSuite
	public void teadDown() {
		
		driver.quit();
	}
	
}
