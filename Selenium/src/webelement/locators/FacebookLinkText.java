package webelement.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLinkText {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.linkText("Forgotten password?")).click();
		System.out.println("After Clicking: " +driver.getCurrentUrl());
		driver.navigate().back();
		driver.findElement(By.linkText("ಕನ್ನಡ")).click();
		Thread.sleep(200);
		driver.quit();
	}

}
