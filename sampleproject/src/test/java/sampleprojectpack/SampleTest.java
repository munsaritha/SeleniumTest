package sampleprojectpack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

public class SampleTest {
  @Test
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.chrome.silentOutput","true");
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Automation\\Required Tools\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		String val2=driver.getTitle();
		System.out.println(val2);
		
				driver.quit();
  }
}




