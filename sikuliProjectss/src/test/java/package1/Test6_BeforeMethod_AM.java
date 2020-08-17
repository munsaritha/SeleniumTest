package package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Test6_BeforeMethod_AM {
	public WebDriver driver;
	@BeforeMethod
	public void launchBrowser() 
	{
		System.setProperty("webdriver.chrome.silentOutput","true");
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Automation\\Required Tools\\chromedriver.exe");
		 driver=new ChromeDriver();
	}
	@Test(priority=1)
	public void verifyGoogle() throws InterruptedException
	{
	driver.get("https://www.google.com");

	Thread.sleep(5000);

	String atitle=driver.getTitle();
	System.out.println(atitle);
	String ExpTitle="Google";
	//String ExpTitle="ssGoogle";(Enable this statement to see method fails)
	
	Assert.assertEquals(atitle, ExpTitle);
}

  @Test(priority=2)
	public void verifyintelli() throws InterruptedException
	{
	driver.get("https://www.intellipaat.com");

	Thread.sleep(5000);

	String atitle=driver.getTitle();
	System.out.println(atitle);
	String ExpTitle="Online Professional Training Courses and Certification - Intellipaat";
	//String ExpTitle="ssOnline Professional Training Courses and Certification - Intellipaat";(Enable this statement to see method fails)
	
	Assert.assertEquals(atitle, ExpTitle);
}
		@Test(priority=3)
		public void verifyFBTitle() throws InterruptedException
		{
		driver.get("https://www.facebook.com");
	
		Thread.sleep(5000);
	
		String atitle=driver.getTitle();
		System.out.println(atitle);
		String ExpTitle="Facebook - Log In or Sign Up";
		//String ExpTitle="ssFacebook - Log In or Sign Up";(Enable this statement to see method fails)
		
		Assert.assertEquals(atitle, ExpTitle);
	}
	
		@AfterMethod
	public void teardown()
	{
		driver.close();
	}

}
