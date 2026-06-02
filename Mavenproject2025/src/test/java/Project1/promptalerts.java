package Project1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class promptalerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    
		WebDriver driver= new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
		 
		 /*for promt handle with ok 
		 WebElement alert =driver.findElement(By.xpath("//button[text()='Click for JS Alert']"));
		 alert.click();
		 Thread.sleep(5000);
		 System.out.println(alert.getText());
		  
		 driver.switchTo().alert().accept();*/
		 
		 
		 /*for prompt hsandle with ok & cancel
		 WebElement alert =driver.findElement(By.xpath("//button[text()='Click for JS Confirm']"));
		 alert.click();
		 Thread.sleep(5000);
		 driver.switchTo().alert().accept();*/
		 
		 //for sending message prompt
		 
		 WebElement alert =driver.findElement(By.xpath("//button[text()='Click for JS Prompt']"));
		 alert.click();
		 Thread.sleep(5000);
		Alert myalert= driver.switchTo().alert();
		myalert.sendKeys("welcome");
		myalert.accept();
		     
		
		 
		
		
		
		
		
		
	}

}
 