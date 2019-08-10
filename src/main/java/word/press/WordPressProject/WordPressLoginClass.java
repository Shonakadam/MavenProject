package word.press.WordPressProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WordPressLoginClass {
	WebDriver driver;
	
	By locatorsofUsername=(By.id("user_login"));
	
	By locatorsofpassword=(By.xpath("//input[@name='pwd']"));
	
	By locatorsofloginbnt=(By.xpath("//input[@name='wp-submit']"));
	
	
	public WordPressLoginClass(WebDriver driver2) {
		this.driver=driver2;
	}
	public void wordpressloginfunction() {
		WebElement Username = driver.findElement( locatorsofUsername);
		Username.sendKeys("admin");

		WebElement password = driver.findElement(locatorsofpassword);
		password.sendKeys("demo123");

		WebElement loginbnt = driver.findElement(locatorsofloginbnt);
		loginbnt.click();
	}

}
