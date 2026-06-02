package Project1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Interactwithwebelements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		int i;
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		List<WebElement>checkboxes=driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
	
		Thread.sleep(5000);
		/* for(i=0; i<checkbox.size(); i++) {
			 checkbox.get(i).click();
			 
		 }*/
		
		/*for (WebElement checkbox:checkboxes) {
			checkbox.click();
		 
		}*/
		
		//Specific checkbosex
		for (i=0; i<3 ;i++) {
			
			checkboxes.get(i).click();
			if(checkboxes.get(i).isSelected()) {
				checkboxes.get(i).click();
		}
		
		}
	}  

}
