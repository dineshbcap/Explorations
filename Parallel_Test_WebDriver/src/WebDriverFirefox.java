
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class WebDriverFirefox {
	@Test(groups={"regression testing"})
	@Parameters({"URL"})
	public void open(String URL1) throws InterruptedException, MalformedURLException{
		WebDriver driver;
	  
		//initialize the firefox browser
		driver = new RemoteWebDriver(new URL("http://127.0.0.1:4444/wd/hub/"), DesiredCapabilities.firefox());
		//get this url
		driver.get(URL1);
		Thread.sleep(10000);
		
		//find the element in the page called "q" as a name and type the text we mentioned
		WebElement searchField = driver.findElement(By.name("q"));
	    searchField.sendKeys("Aricent Technologies");
	    //and submit
	    searchField.submit();
	    driver.quit();
	  }
}
