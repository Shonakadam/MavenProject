package word.press.WordPressProject;

import org.testng.annotations.Test;



import org.testng.annotations.BeforeTest;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class WindowHandle {
	  WebDriver driver;
  @Test
  public void f() {
	  String Mainwindow=driver.getWindowHandle();
	  Set<String> multiplewindow=driver.getWindowHandles();
	  System.out.println(multiplewindow.size());
	  
	  for (String Myname : multiplewindow) {
		 if (!Myname.equals(Mainwindow)) {
			 driver.switchTo().window(Mainwindow);
			
		}
		 {
			
		}
		
	}
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "Resoures/chromedriver.exe");
	  driver= new ChromeDriver();
	  driver.get("https://www.naukri.com/");
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() throws InterruptedException {
	  Thread.sleep(5000);
	  driver.quit();
  }

}
