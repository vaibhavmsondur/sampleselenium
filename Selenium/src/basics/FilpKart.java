package basics;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FilpKart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/puma-spike-19-2-cricket-shoes-men/p/itm14a4df7702ba2?pid=SHOG5CGGPBQKGNGZ&lid=LSTSHOG5CGGPBQKGNGZKUNTCF&marketplace=FLIPKART&sattr[]=color&st=color&otracker=hp_omu_Men%252527s%252BFootwear%252B_1_10.dealCard.OMU_FENXS8O1LEXY_5");
		driver.findElement(By.cssSelector("input[placeholder='Enter delivery pincode']")).sendKeys("560070");
		driver.findElement(By.xpath("//span[text()='Check']")).click();
		driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("7")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Spike 19.2 Cricket Shoes For Men']/following::li[@id='swatch-1-color']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Product Details')]")));
		driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='PUMA Spike 19.2 Cricket Shoes For Men']")));
		driver.findElement(By.xpath("//button[text()='+']")).click();
		driver.findElement(By.xpath("//span[text()='Place Order']")).click();
	}

}
