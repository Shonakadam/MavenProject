package word.press.WordPressProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WordPressDashBoardClass {
	WebDriver driver;
	@FindBy(xpath = "//div[text()='Posts']")
	WebElement webofPosts;

	@FindBy(xpath = "//a[@href='post-new.php']")
	WebElement webofAddnew;
	
	@FindBy (xpath="//h1[text()='Add a New Post']")
	WebElement webofaddnewposte;
	
	@FindBy (xpath="//input[@name='post_title']")
	WebElement webofentertitle;
	
	@FindBy (xpath="//input[@name='publish']")
	WebElement webofpolish;
	
	

	public WordPressDashBoardClass(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public void wordpressdashboardfunction() {

		webofPosts.click();

		
		webofAddnew.click();

		
		webofaddnewposte.click();

		
		webofentertitle.sendKeys("Hello Word");


		webofpolish.click();

	}

}
