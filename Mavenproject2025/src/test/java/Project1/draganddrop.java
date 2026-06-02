package Project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class draganddrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demo.automationtesting.in/Static.html");
		driver.manage().window().maximize();
		
		WebElement source=driver.findElement(By.xpath("//img[@id='mongo']"));
		WebElement target=driver.findElement(By.xpath("//div[@id='droparea']"));
		
		
		Actions act= new Actions(driver);
		act.dragAndDrop(source, target).perform();
		
		
		
	}

}
