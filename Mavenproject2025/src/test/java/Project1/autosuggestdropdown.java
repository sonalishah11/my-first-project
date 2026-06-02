 package Project1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class autosuggestdropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 driver.get("http://www.google.com");
		 driver.manage().window().maximize(); 
		 
		driver.findElement(By.name("q")).sendKeys("selenium");
		Thread.sleep(5000);
		 
		List <WebElement> list=driver.findElements(By.xpath("//ul[@role='listbox']//li[@role='presentation']//span"));
		
		System.out.println(list.size());
		int i;
		for(i=0; i<list.size();i++)
		{
		System.out.println(list.get(i).getText());
		
				if(list.get(i).getText().equals("selenium")) {
					
					list.get(i).click();
					break;
				}
		}
		
			 driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"recaptcha\"]/div/div/iframe")));
			WebElement captcha=driver.findElement(By.xpath("//*[@id=\"recaptcha-anchor\"]/div[1]"));
			
		 captcha.click();
 
	}

}
