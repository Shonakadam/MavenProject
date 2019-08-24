package word.press.WordPressProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class WordPressFramework {
	WebDriver driver;
	ExtentTest test;
	ExtentReports extent;

	@Test
	public void Login() {
		test.pass("Starting with Login Process");
		WordPressLoginClass log = new WordPressLoginClass(driver);
		log.wordpressloginfunction();
		test.pass("Successfully Login Process");

	}

	@Test
	public void dashboard() {
		test.pass("Staring with Dashboard");
		WordPressDashBoardClass dash = new WordPressDashBoardClass(driver);
		dash.wordpressdashboardfunction();
		test.pass("Successfully Dashboard Process");

	}

	@BeforeTest
	public void Setup() {

		// initialize the HtmlReporter
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("Resoures/wordpress.html");
	
		// initialize ExtentReports and attach the HtmlReporter
		 extent = new ExtentReports();
		
		// attach only HtmlReporter
		extent.attachReporter(htmlReporter);

		
		
		 test=extent.createTest("wordpress regression");
		test.pass("Starting with Automation");

		
		System.setProperty("webdriver.chrome.driver", "Resoures/chromedriver.exe");
		test.pass("our browser got initiated");
		driver = new ChromeDriver();
		
		driver.get("http://demosite.center/wordpress/wp-login.php?");
		test.pass("My url lunch browser");
		
		driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@AfterTest
	public void teardown() {
		test.pass("End oF Excutions");
		driver.quit();
		extent.flush();
	}

}