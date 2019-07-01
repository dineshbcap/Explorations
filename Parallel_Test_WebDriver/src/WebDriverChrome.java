
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class WebDriverChrome{
	@Test(groups={"regression testing", "smoke testing"})
	@Parameters({"URL"})
	public void open1(String URL1) throws InterruptedException, MalformedURLException{
		WebDriver driver;
	    //mention where we keep the chrome driver file(it was downlaoded from "http://code.google.com/p/chromedriver/downloads/list")
		System.setProperty("webdriver.chrome.driver","D:\\Setup_Files\\Selenium_Useful\\chromedriver.exe");
		
		//initialize the chrome browser
		driver = new RemoteWebDriver(new URL("http://127.0.0.1:4444/wd/hub/"), DesiredCapabilities.firefox());
		
		Thread.sleep(20000);
		
		//get this url
		driver.get(URL1);
		
		//find the element in the page called "q" as a name and type the text we mentioned
		WebElement searchField = driver.findElement(By.name("q"));
	    searchField.sendKeys("Aricent Technologies");
	    //and submit
	    searchField.submit(); 
	    driver.quit();
	  }
}
