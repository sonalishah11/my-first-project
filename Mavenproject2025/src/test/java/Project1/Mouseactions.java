package Project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Mouseactions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		//Mousehover
		
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//driver.get("https://www.flipkart.com/" );
          //driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		driver.manage().window().maximize();
		
		
		/*WebElement rightclick=driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		
		Actions act= new Actions(driver);
		
		act.contextClick(rightclick).perform();
		
		
		driver.findElement(By.xpath("//li[@class='context-menu-item context-menu-icon context-menu-icon-copy']")).click();
		
		driver.switchTo().alert().accept();*/
		driver.switchTo().frame("iframeResult");
		WebElement box1=driver.findElement(By.xpath("//input[@id='field1']"));
		 WebElement button=driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));
		 
		 box1.clear();
		 box1.sendKeys("Welcome");
		 
		 
		 Actions act= new Actions(driver);
		 act.doubleClick(button).perform();
		
	}
}
