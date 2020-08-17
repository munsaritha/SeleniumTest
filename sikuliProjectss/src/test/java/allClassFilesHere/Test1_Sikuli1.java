package allClassFilesHere;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

public class Test1_Sikuli1 {
     @Test
	public void handlefileUpload() throws InterruptedException, FindFailed
	{
    	 System.setProperty("webdriver.chrome.silentOutput","true");
 		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Automation\\Required Tools\\chromedriver.exe");
 		WebDriver driver=new ChromeDriver();
			driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_fileupload_get");
			Thread.sleep(5000);
			//Implementing sikuli
			Screen s=new Screen();
			Thread.sleep(5000);
			//To perform click operation click() method
			s.click("C:\\Selenium Automation\\sikuliProject\\src\\sikuli_locators\\Click_ChooseFile.PNG");
			Thread.sleep(5000);
			Pattern fileInput=new Pattern("C:\\Selenium Automation\\sikuliProject\\src\\sikuli_locators\\send_Path of Image.PNG");
	
			Pattern openButton=new Pattern("C:\\Selenium Automation\\sikuliProject\\src\\sikuli_locators\\click_Open.PNG");
			Thread.sleep(5000);
			//to send data use type()
			
			s.type(fileInput,"C:\\Selenium Automation\\sikuliProject\\src\\sikuli_locators\\File.PNG");
			Thread.sleep(5000);
			s.click(openButton);
			Thread.sleep(5000);
			driver.close();
			
	}
     
}
