package Project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class practicetestng {
	 WebDriver driver;
	 
	 
@Test(priority=1)
void opening() {
		 driver= new ChromeDriver() ;
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		  driver.manage().window().maximize();
	 }
  @Test (priority=2)
  void testlogo() throws InterruptedException {
Thread.sleep(5000);
  boolean status = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[1]/img")).isDisplayed();
 
  System.out.println("logo displayed: " + status);
 
  
  }
  @Test(priority=3)
  void login() throws InterruptedException {
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
	  driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
  }
  @Test(priority=4)
  void logout() {
	  
	  
	driver.quit();
  }
  

  
}
