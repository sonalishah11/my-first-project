
package Project1;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;


public class javascriptexecuterscrollandfileupload {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); 
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//WebElement value= driver.findElement(By.xpath("//input[@class='form-control']"));
		
		JavascriptExecutor js=  driver;
		//js.executeScript("arguments[0].setAttribute('value', 'sonali')",value);
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(0,1500)", "");

	}

}
