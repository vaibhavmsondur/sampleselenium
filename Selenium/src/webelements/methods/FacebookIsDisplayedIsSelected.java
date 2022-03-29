package webelements.methods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FacebookIsDisplayedIsSelected {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Sign Up']")));
		
		WebElement CustomRadioButton = driver.findElement(By.xpath("//label[text()='Custom']"));
		CustomRadioButton.click();
		
		if (CustomRadioButton.isSelected()) {
			System.out.println("PASS:: The radio button is selected");
		} else {
			System.out.println("FAIL:: The radio button is not selected");
		}
		
		Thread.sleep(5000);
		
		if (driver.findElement(By.className("preferred_pronoun")).isDisplayed()) {
			System.out.println("PASS:: The dropdown is Displayed");
		} else {
			System.out.println("FAIL:: The dropdown is Not Displayed");
		}
		

	}

}
